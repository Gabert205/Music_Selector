import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Algorithm {
    public Data data;   //stores all the dataPoints
    List<DataPoint[]> genreArrays;
    List<MedianNode> medianNodes;

    public Algorithm(Data data) {
        this.data = data;
        genreArrays = new ArrayList<>();

        data.sort(new CompareGenre());
        String genre = data.dataPoints.get(0).musicGenre;

        //creates genreArrays
        int split = 0;
        for (int i = 0 ; i < data.dataPoints.size() ; i++) {
            if(!data.dataPoints.get(i).musicGenre.equals(genre) || i == data.dataPoints.size() - 1){
                genre = data.dataPoints.get(i).musicGenre;

                DataPoint[] arr = new DataPoint[i - split];
                for (int j = 0 ; j < i - split ; j++) {
                    arr[j] = data.dataPoints.get(split + j);
                }

                genreArrays.add(arr);

                split = i;
            }
        }

        //creating medianNodes

        medianNodes = new ArrayList<>();

        for (int i = 0 ; i < genreArrays.size() ; i++) {
            int heartBeat = 0;
            int bloodPressure = 0;
            double time = 0;

            for(DataPoint dataPoint : genreArrays.get(i)){
                heartBeat += dataPoint.heartBeat;
                bloodPressure += dataPoint.bloodPressure;
                time += dataPoint.time;
            }

            heartBeat /= genreArrays.get(i).length;
            bloodPressure /= genreArrays.get(i).length;
            time /= genreArrays.get(i).length;

            medianNodes.add(new MedianNode(heartBeat, bloodPressure, time, genreArrays.get(i)[0].musicGenre));
        }

    }

    //==================================================================================================================

    public String getGenre(int heartBeat, int bloodPressure, double time){
        double[] distances = new double[medianNodes.size()];

        for (int i = 0 ; i < medianNodes.size() ; i++) {
            distances[i] = Math.sqrt(
                            Math.pow(heartBeat - medianNodes.get(i).heartBeat, 2) +
                            Math.pow(bloodPressure - medianNodes.get(i).bloodPressure, 2) +
                            Math.pow(time - medianNodes.get(i).time, 2));
        }

        int lowestIndex = 0;

        for (int i = 0 ; i < distances.length ; i++) {
            if(distances[i] < distances[lowestIndex]){
                lowestIndex = i;
            }
        }

        return medianNodes.get(lowestIndex).musicGenre;
    }

}

class MedianNode{
    public int heartBeat;
    public int bloodPressure;
    public double time;
    public String musicGenre;

    public MedianNode(int heartBeat, int bloodPressure, double time, String musicGenre) {
        this.heartBeat = heartBeat;
        this.bloodPressure = bloodPressure;
        this.time = time;
        this.musicGenre = musicGenre;
    }
}

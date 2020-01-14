import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Data {
    public List<DataPoint> dataPoints;   //stores all the dataPoints

    public Data(){
        dataPoints = new ArrayList<>();
    }

    //==================================================================================================================

    public void sort(Comparator<DataPoint> comparator){
        dataPoints.sort(comparator);
    }

    public void fillWithRandom(int numOfDataPoints){
        String[] genres = {"rock", "pop", "rap", "country", "classical"};
        for (int i = 0 ; i < numOfDataPoints ; i++) {
            dataPoints.add(new DataPoint((int)(Math.random() * 150 + 50),
                                        (int)(Math.random() * 50 + 100),
                                        (Math.random() * 24),
                                        genres[(int)(Math.random() * genres.length)]) );
        }
    }

    public String toString(){
        String end = "";

        for(DataPoint dataPoint : dataPoints){
            end += String.format("%s%n", dataPoint.toString());
        }

        return end;
    }
}

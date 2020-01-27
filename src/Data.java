import java.awt.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Data {
    public List<DataPoint> dataPoints;   //stores all the dataPoints
    public static final String[] GENRES = {"pop", "rap", "classical"};

    public Data(){
        dataPoints = new ArrayList<>();
    }

    //==================================================================================================================

    public int getIndexOfGenre(String genre){
        for (int i = 0 ; i < GENRES.length ; i++) {
            if(GENRES[i].equals(genre))
                return i;
        }

        return -1;
    }

    public void sort(Comparator<DataPoint> comparator){
        dataPoints.sort(comparator);
    }

    public void fillWithRandom(int numOfDataPoints){
        for (int i = 0 ; i < numOfDataPoints ; i++) {
            dataPoints.add(new DataPoint((int)(Math.random() * 150 + 50),
                                        (int)(Math.random() * 50 + 100),
                                        (Math.random() * 24),
                                        GENRES[(int)(Math.random() * GENRES.length)]) );
        }
    }

    //==================================================================================================================

    public void draw(){
        for(DataPoint dataPoint : dataPoints){
            StdDraw.setPenColor(Color.getHSBColor(
                    (float) getIndexOfGenre(dataPoint.musicGenre) / GENRES.length, 1, 1));
            StdDraw.filledCircle(dataPoint.heartBeat / 200., dataPoint.bloodPressure / 200., dataPoint.time / 24. / 100.);
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

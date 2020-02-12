import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Data {
    public List<DataPoint> dataPoints;   //stores all the dataPoints
    public final String[] GENRES = {"Pop", "Alternative", "Lofi", "Classical", "Jazz"};

    public Data(){
        dataPoints = new ArrayList<>();
    }

    public Data(String filePath) throws FileNotFoundException {
        dataPoints = new ArrayList<>();

        Scanner scan = new Scanner(new File(filePath));
        while (scan.hasNext()){
            int bloodPressure = scan.nextInt();
            int heartBeat = scan.nextInt();
            String genre = scan.next();
            double time = scan.nextDouble();
            dataPoints.add(new DataPoint(heartBeat, bloodPressure, time, genre));
        }
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
        StdDraw.setXscale(50, 150);
        StdDraw.setYscale(75,175);
        StdDraw.textLeft(50, 77, "(50, 75)");
        StdDraw.line(75, 80, 75, 175);
        StdDraw.text(75, 77, "75");
        StdDraw.text(100, 77, "100");
        StdDraw.line(100, 80, 100, 175);
        StdDraw.text(125, 77, "125");
        StdDraw.line(125, 80, 125, 175);
        StdDraw.textRight(150, 77, "150");

        StdDraw.textLeft(50, 100, "100");
        StdDraw.line(57, 100, 150, 100);
        StdDraw.textLeft(50, 125, "125");
        StdDraw.line(57, 125, 150, 125);
        StdDraw.textLeft(50, 150, "150");
        StdDraw.line(57, 150, 150, 150);
        StdDraw.textLeft(50, 173, "175");
        for(DataPoint dataPoint : dataPoints){
            StdDraw.setPenColor(Color.getHSBColor(
                    (float) getIndexOfGenre(dataPoint.musicGenre) / GENRES.length, 1, 1));
            StdDraw.filledCircle(dataPoint.heartBeat, dataPoint.bloodPressure, dataPoint.time / 24.);
            System.out.println(dataPoint.heartBeat);
        }

        StdDraw.save("data_graph.png");
    }

    public String toString(){
        String end = "";

        for(DataPoint dataPoint : dataPoints){
            end += String.format("%s%n", dataPoint.toString());
        }

        return end;
    }
}

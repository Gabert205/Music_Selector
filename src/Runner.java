import java.io.FileNotFoundException;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);
        Data data = new Data("Data File");
        Algorithm algo = new Algorithm(data);
        data.draw();
        System.out.println("heartbeat");
        int heartBeat = scan.nextInt();
        System.out.println("bloodpressure");
        int bloodPressure = scan.nextInt();
        System.out.println("time");
        double time = scan.nextDouble();
        System.out.println(algo.getGenre(heartBeat, bloodPressure, time));

        //121/70
        //71
        //15.1
    }
}

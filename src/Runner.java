import java.io.FileNotFoundException;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);
        Data data = new Data("Data File");
        Algorithm algo = new Algorithm(data);

        System.out.println("Current Heartbeat : ");
        int heartBeat = scan.nextInt();

        System.out.println("\nCurrent Blood Pressure : ");
        int bloodPressure = scan.nextInt();

        System.out.println("\nCurrent Time : ");
        double time = scan.nextDouble();

        System.out.println("\nThe best music to listen to right now is : ");
        System.out.println(algo.getGenre(heartBeat, bloodPressure, time));
    }
}

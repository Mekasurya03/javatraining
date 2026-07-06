import java.util.Scanner;

public class CalculateDelayedArrivalTime {

    public static int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        return (arrivalTime + delayedTime) % 24;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter arrival time (0-23): ");
        int arrivalTime = sc.nextInt();

        System.out.print("Enter delayed time: ");
        int delayedTime = sc.nextInt();

        int result = findDelayedArrivalTime(arrivalTime, delayedTime);

        System.out.println("New Arrival Time: " + result);

        sc.close();
    }
}
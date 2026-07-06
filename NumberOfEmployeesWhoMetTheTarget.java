import java.util.Scanner;

public class NumberOfEmployeesWhoMetTheTarget {

    public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;

        for (int hour : hours) {
            if (hour >= target) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        int[] hours = new int[n];

        System.out.println("Enter working hours:");
        for (int i = 0; i < n; i++) {
            hours[i] = sc.nextInt();
        }

        System.out.print("Enter target hours: ");
        int target = sc.nextInt();

        int result = numberOfEmployeesWhoMetTarget(hours, target);

        System.out.println("Employees Who Met the Target = " + result);

        sc.close();
    }
}
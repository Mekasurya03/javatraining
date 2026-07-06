import java.util.Scanner;

public class Cut {

    public static int numberOfCuts(int n) {
        if (n == 1) {
            return 0;
        }

        if (n % 2 == 0) {
            return n / 2;
        } else {
            return n;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of equal slices: ");
        int n = sc.nextInt();

        System.out.println("Minimum cuts = " + numberOfCuts(n));

        sc.close();
    }
}

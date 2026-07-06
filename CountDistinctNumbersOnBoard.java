import java.util.Scanner;

public class CountDistinctNumbersOnBoard {

    public static int distinctIntegers(int n) {
        if (n == 1) {
            return 1;
        }
        return n - 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int result = distinctIntegers(n);

        System.out.println("Distinct Numbers on Board = " + result);

        sc.close();
    }
}
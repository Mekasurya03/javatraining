import java.util.Scanner;

public class Cudeofnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        System.out.println("Cube = " + (n * n * n));

        sc.close();
    }
}
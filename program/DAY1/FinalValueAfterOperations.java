import java.util.Scanner;

public class FinalValueAfterOperations {

    public static int finalValueAfterOperations(String[] operations) {
        int x = 0;

        for (String op : operations) {
            if (op.equals("++X") || op.equals("X++")) {
                x++;
            } else {
                x--;
            }
        }

        return x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of operations: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] operations = new String[n];

        System.out.println("Enter operations (++X, X++, --X, X--):");
        for (int i = 0; i < n; i++) {
            operations[i] = sc.nextLine();
        }

        int result = finalValueAfterOperations(operations);

        System.out.println("Final Value: " + result);

        sc.close();
    }
}
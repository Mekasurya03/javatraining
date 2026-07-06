import java.util.Scanner;

public class MaximumOddBinaryNumber {

    public static String maximumOddBinaryNumber(String s) {
        int ones = 0;

        // Count the number of 1's
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                ones++;
            }
        }

        StringBuilder result = new StringBuilder();

        // Place all but one '1' at the beginning
        for (int i = 0; i < ones - 1; i++) {
            result.append('1');
        }

        // Place all '0's
        for (int i = 0; i < s.length() - ones; i++) {
            result.append('0');
        }

        // Place the last '1' at the end to make it odd
        result.append('1');

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter binary string: ");
        String s = sc.nextLine();

        System.out.println("Maximum Odd Binary Number = " + maximumOddBinaryNumber(s));

        sc.close();
    }
}
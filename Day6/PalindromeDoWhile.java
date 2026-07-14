import java.util.Scanner;

public class PalindromeDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int temp = num;
        int rev = 0;

        do {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        } while (temp != 0);

        if (rev == num)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

        sc.close();
    }
}
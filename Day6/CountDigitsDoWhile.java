import java.util.Scanner;

public class CountDigitsDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int count = 0;

        do {
            count++;
            num /= 10;
        } while (num != 0);

        System.out.println("Digits = " + count);

        sc.close();
    }
}
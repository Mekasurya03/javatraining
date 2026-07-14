import java.util.Scanner;

public class PassDistinction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int marks = sc.nextInt();

        if (marks >= 75)
            System.out.println("Distinction");
        else if (marks >= 35)
            System.out.println("Pass");
        else
            System.out.println("Fail");

        sc.close();
    }
}
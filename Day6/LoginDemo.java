import java.util.Scanner;

public class LoginDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String user = "admin";
        String pass = "1234";

        System.out.print("Username: ");
        String u = sc.next();

        System.out.print("Password: ");
        String p = sc.next();

        if (u.equals(user) && p.equals(pass))
            System.out.println("Login Successful");
        else
            System.out.println("Login Failed");

        sc.close();
    }
}
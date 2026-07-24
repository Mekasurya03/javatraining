public class BankAccount {

    String name = "Siva";
    int balance = 10000;

    void display() {
        System.out.println("Account Holder: " + name);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.display();
    }
}
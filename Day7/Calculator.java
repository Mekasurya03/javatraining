public class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println("Sum = " + c.add(10, 20));
    }
}
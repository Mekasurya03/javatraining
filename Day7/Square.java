public class Square {

    int square(int n) {
        return n * n;
    }

    public static void main(String[] args) {
        Square s = new Square();
        System.out.println("Square = " + s.square(8));
    }
}
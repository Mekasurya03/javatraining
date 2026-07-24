public class Mobile {

    String brand = "Samsung";
    int price = 25000;

    void show() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Mobile m = new Mobile();
        m.show();
    }
}
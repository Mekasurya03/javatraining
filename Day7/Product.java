public class Product {

    int id = 1;
    String name = "Laptop";
    int price = 50000;

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Product p = new Product();
        p.display();
    }
}
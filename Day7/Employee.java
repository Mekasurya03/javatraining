public class Employee {

    int id = 101;
    String name = "Rahul";
    double salary = 35000;

    void display() {
        System.out.println(id);
        System.out.println(name);
        System.out.println(salary);
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.display();
    }
}
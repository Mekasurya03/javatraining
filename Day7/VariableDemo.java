public class VariableDemo {

    int instanceVar = 100;
    static int staticVar = 200;

    public static void main(String[] args) {

        int localVar = 300;

        VariableDemo obj = new VariableDemo();

        System.out.println("Instance Variable = " + obj.instanceVar);
        System.out.println("Static Variable = " + staticVar);
        System.out.println("Local Variable = " + localVar);
    }
}
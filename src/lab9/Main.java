package lab9;

public class Main {
    public static void main(String[] args) {
        System.out.println("\"Exception1\"");
        new Exception1().exceptionDemo();
        System.out.println("\"Exception2\"");
        new Exception2().exceptionDemo();
        System.out.println("\"ThrowsDemo\"");
        new ThrowsDemo().getKey();
    }
}

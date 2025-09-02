// OOP/MethodOverloadingExample.java
public class MethodOverloadingDemo {
    void sum(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    void sum(int a, int b, int c) {
        System.out.println("Sum: " + (a + b + c));
    }

    public static void main(String[] args) {
        MethodOverloadingDemo obj = new MethodOverloadingDemo();
        obj.sum(5, 10);
        obj.sum(5, 10, 15);
    }
}

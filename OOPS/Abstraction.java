// OOP/AbstractionExample.java
abstract class Shape {
    abstract void draw(); // abstract method
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }
}

public class AbstractionDemo {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();
    }
}

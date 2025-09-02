// OOP/PolymorphismExample.java Method overriding
class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}

class Car extends Vehicle {
    @Override
    void run() {
        System.out.println("Car is running fast");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.run();

        Vehicle c = new Car(); // Runtime polymorphism
        c.run();
    }
}

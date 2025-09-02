// OOP/ConstructorExample.java
public class ConstructorExample {
    String name;
    int age;

    // Constructor
    public ConstructorExample(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        ConstructorExample obj = new ConstructorExample("Bob", 22);
        obj.display();
    }
}

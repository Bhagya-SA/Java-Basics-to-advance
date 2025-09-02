// OOP/ClassAndObjectExample.java
public class ClassAndObjectExample {
    String name;
    int age;

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        // Creating object of the class
        ClassAndObjectExample obj = new ClassAndObjectExample();
        obj.name = "Alice";
        obj.age = 25;
        obj.display();
    }
}

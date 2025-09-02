// OOP/EncapsulationExample.java
public class EncapsulationExample {
    // Private fields
    private String name;
    private int age;

    // Getter methods
    public String getName() { return name; }
    public int getAge() { return age; }

    // Setter methods
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }

    public static void main(String[] args) {
        EncapsulationExample obj = new EncapsulationExample();
        obj.setName("Charlie");
        obj.setAge(30);
        System.out.println("Name: " + obj.getName() + ", Age: " + obj.getAge());
    }
}

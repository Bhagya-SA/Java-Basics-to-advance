// Advanced/CollectionsExample.java
import java.util.*;

public class CollectionsExample {
    public static void main(String[] args) {
        // ArrayList example
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        System.out.println("Fruits List: " + fruits);

        // HashSet example
        Set<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(20); // duplicate ignored
        numbers.add(30);
        System.out.println("Numbers Set: " + numbers);

        // HashMap example
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        System.out.println("Map: " + map);

        // Iterate over ArrayList
        System.out.println("Iterating fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}

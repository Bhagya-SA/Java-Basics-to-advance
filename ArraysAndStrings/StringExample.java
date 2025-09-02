// ArraysAndStrings/StringExample.java
public class StringExample {
    public static void main(String[] args) {
        // Declare and initialize a string
        String text = "Hello Java";

        // Basic string operations
        System.out.println("Original String: " + text);
        System.out.println("Length of string: " + text.length());
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + text.toLowerCase());
        System.out.println("Substring (0-5): " + text.substring(0, 5));
        System.out.println("Character at index 6: " + text.charAt(6));

        // Check if string contains a word
        if (text.contains("Java")) {
            System.out.println("The string contains 'Java'");
        }

        // Replace a word
        String newText = text.replace("Java", "World");
        System.out.println("After replacement: " + newText);

        // Split string
        String[] words = text.split(" ");
        System.out.println("Words in the string:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}

import java.util.Scanner;

public class ArrayConceptsDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Ask user for array size
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // 2. Declare and create the array
        int[] numbers = new int[size];

        // 3. Input elements from the user
        System.out.println("\nEnter " + size + " integer elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element at index " + i + ": ");
            numbers[i] = scanner.nextInt();
        }

        // 4. Print all elements using for-each loop
        System.out.println("\nYou entered:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 5. Calculate sum and average
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        double average = (double) sum / size;

        // 6. Find maximum and minimum elements
        int max = numbers[0];
        int min = numbers[0];
        for (int num : numbers) {
            if (num > max) max = num;
            if (num < min) min = num;
        }

        // 7. Display results
        System.out.println("\nArray Length: " + numbers.length);
        System.out.println("Sum of elements: " + sum);
        System.out.println("Average of elements: " + average);
        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);

        scanner.close();
    }
}

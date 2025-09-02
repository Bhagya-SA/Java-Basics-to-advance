// Advanced/ExceptionHandling.java
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter dividend: ");
            int dividend = sc.nextInt();
            System.out.print("Enter divisor: ");
            int divisor = sc.nextInt();

            int result = dividend / divisor;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        } catch (Exception e) {
            System.out.println("Error: Invalid input!");
        } finally {
            System.out.println("Execution completed.");
            sc.close();
        }
    }
}

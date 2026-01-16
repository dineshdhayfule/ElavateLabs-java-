import java.util.Scanner;

/**
 * Task 2: Variables, Data Types & Console Input Application
 * Demonstrating primitive types, Scanner, and Type Casting.
 */
public class Task2Calculator {

    // 1. Static variable (Class-level, shared by all instances)
    static String appName = "Java Task 2 Calc";

    // 2. Instance variable (Belongs to a specific object)
    int sessionID = 101;

    public static void main(String[] args) {
        // 3. Local variable (Scope limited to this method)
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Welcome to " + appName + " ---");

        // Declaring all primitive data types and their memory usage
        byte age = 22; // 1 byte
        short year = 2026; // 2 bytes
        int population = 10000; // 4 bytes (chosen for standard integers)
        long distance = 999999L;// 8 bytes (chosen for large values)
        float weight = 65.5f; // 4 bytes
        double price = 199.99; // 8 bytes (chosen for high precision)
        char grade = 'A'; // 2 bytes
        boolean isJavaFun = true; // 1 bit (internally often 1 byte)

        System.out.print("Enter first number (Integer): ");
        if (scanner.hasNextInt()) {
            int num1 = scanner.nextInt();

            System.out.print("Enter second number (Double): ");
            if (scanner.hasNextDouble()) {
                double num2 = scanner.nextDouble();

                // Arithmetic Operations
                double sum = num1 + num2;
                double product = num1 * num2;

                // Type Casting
                // Widening (Implicit): int to double
                double widening = num1;
                // Narrowing (Explicit): double to int
                int narrowing = (int) num2;

                // Formatted Output
                System.out.printf("\n--- Results ---\n");
                System.out.printf("Sum: %.2f\n", sum);
                System.out.printf("Product: %.2f\n", product);
                System.out.printf("Explicit Cast (double to int): %d\n", narrowing);

            } else {
                System.out.println("Invalid input! Please enter a decimal number.");
            }
        } else {
            System.out.println("Invalid input! Please enter an integer.");
        }

        scanner.close();
    }
}
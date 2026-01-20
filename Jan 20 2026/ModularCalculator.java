public class ModularCalculator {

    public static void main(String[] args) {

        System.out.println("Addition (int): " + add(10, 20));
        System.out.println("Addition (double): " + add(10.5, 20.5));

        System.out.println("Subtraction: " + subtract(30, 10));
        System.out.println("Multiplication: " + multiply(5, 4));

        try {
            System.out.println("Division: " + divide(20, 2));
            System.out.println("Division: " + divide(10, 0));
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        int num = 50;
        passByValueDemo(num);
        System.out.println("After method call, num = " + num);
    }

    /**
     * Adds two integers
     */
    public static int add(int a, int b) {
        return a + b;
    }

    /**
     * Adds two double values (Method Overloading)
     */
    public static double add(double a, double b) {
        return a + b;
    }

    /**
     * Subtracts two integers
     */
    public static int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Multiplies two integers
     */
    public static int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Divides two integers with exception handling
     */
    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a / b;
    }

    /**
     * Demonstrates pass-by-value behavior
     */
    public static void passByValueDemo(int x) {
        x = x + 10;
        System.out.println("Inside method, x = " + x);
    }
}

import java.util.Scanner;

public class ArrayDataAnalysis {
    public static void main(String[] args) {
        // 1. Array Initialization and 1D/2D Demonstration 
        double[] data = {45.5, 12.0, 78.2, 34.1, 9.9, 66.4};
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        System.out.println("--- Array Analysis Report ---");

        // 2. Perform Calculations [cite: 9]
        double sum = 0;
        double max = data[0];
        double min = data[0];

        for (int i = 0; i < data.length; i++) {
            sum += data[i];
            if (data[i] > max) max = data[i];
            if (data[i] < min) min = data[i];
        }
        double average = sum / data.length;

        // 3. Manual Sorting (Bubble Sort) 
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    double temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }

        // 4. Formatted Output [cite: 14]
        System.out.printf("Sum: %.2f\n", sum);
        System.out.printf("Average: %.2f\n", average);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.print("Sorted Array: ");
        for (double val : data) System.out.print(val + " ");
        System.out.println("\n");

        // 5. Handling ArrayIndexOutOfBoundsException 
        try {
            System.out.println("Accessing invalid index...");
            double invalidValue = data[10]; 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error: " + e.getMessage() + " - Index is out of bounds!");
        }
    }
}
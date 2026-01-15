/**
 * Task 1: Java Environment Setup & First Executable Program
 * This program demonstrates basic Java syntax and command-line input.
 */
public class InternshipTask {
    public static void main(String[] args) {
        // Basic output message 
        System.out.println("Java Environment Setup Successful!");

        // Handling command-line arguments 
        if (args.length > 0) {
            System.out.println("Arguments received:");
            for (int i = 0; i < args.length; i++) {
                System.out.println("Argument " + (i + 1) + ": " + args[i]);
            }
        } else {
            System.out.println("No command-line arguments were provided.");
        }
    }
}
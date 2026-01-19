import java.util.Scanner;

public class StudentResultSystem {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.print("\nEnter Student Name (or type EXIT to stop): ");
            String name = sc.nextLine();

            if (name.equalsIgnoreCase("EXIT")) {
                break;
            }

            int[] marks = readMarks();
            if (marks == null) {
                continue;
            }

            double percentage = calculatePercentage(marks);
            char grade = calculateGrade(percentage);

            displayResult(name, marks, percentage, grade);
        }
        System.out.println("\nResult processing completed.");
    }

    static int[] readMarks() {
        int[] marks = new int[5];
        String[] subjects = {"Maths", "Physics", "Chemistry", "English", "CS"};

        for (int i = 0; i < subjects.length; i++) {
            System.out.print("Enter marks for " + subjects[i] + ": ");
            int m = sc.nextInt();

            if (m < 0 || m > 100) {
                System.out.println("Invalid marks! Enter values between 0 and 100.");
                sc.nextLine();
                return null;
            }
            marks[i] = m;
        }
        sc.nextLine();
        return marks;
    }

    static double calculatePercentage(int[] marks) {
        int sum = 0;
        for (int m : marks) {
            sum += m;
        }
        return sum / 5.0;
    }

    static char calculateGrade(double percentage) {
        int range = (int) percentage / 10;

        switch (range) {
            case 10:
            case 9:
                return 'A';
            case 8:
                return 'B';
            case 7:
                return 'C';
            case 6:
                return 'D';
            case 5:
                return 'E';
            default:
                return 'F';
        }
    }

    static void displayResult(String name, int[] marks, double percentage, char grade) {
        System.out.println("\n----- Result Summary -----");
        System.out.println("Name       : " + name);
        System.out.println("Percentage : " + percentage);
        System.out.println("Grade      : " + grade);
        System.out.println("--------------------------");
    }
}

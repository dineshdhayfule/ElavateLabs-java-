import java.util.ArrayList;
import java.util.List;

// 1. Base Employee class [cite: 8]
abstract class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    // Abstract method to force subclasses to implement their own logic
    public abstract double calculateSalary();

    @Override
    public String toString() {
        return "ID: " + id + " | Name: " + name;
    }
}

// 2. FullTime Employee (extends Base) [cite: 9]
class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id); // 5. Use super keyword effectively 
        this.monthlySalary = monthlySalary;
    }

    // 3. Override salary calculation [cite: 10]
    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}

// 2. PartTime Employee (extends Base) [cite: 9]
class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id); // 5. Use super keyword effectively 
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    // 3. Override salary calculation [cite: 10]
    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

public class PayrollSystem {
    public static void main(String[] args) {
        // 6. Store objects in parent reference 
        List<Employee> payroll = new ArrayList<>();

        payroll.add(new FullTimeEmployee("Dinesh", 101, 75000));
        payroll.add(new PartTimeEmployee("Amit", 102, 500, 40));
        payroll.add(new FullTimeEmployee("Sneha", 103, 82000));

        System.out.println("=== Employee Payroll Summary ===");
        
        // 7. Print payroll summary dynamically (Runtime Polymorphism) [cite: 14]
        for (Employee emp : payroll) {
            System.out.println(emp.toString());
            System.out.println("Type: " + emp.getClass().getSimpleName());
            // The correct calculateSalary() is called based on the object type, not reference type
            System.out.printf("Salary: ₹%.2f%n", emp.calculateSalary()); 
            System.out.println("-----------------------------");
        }
    }
}
import java.util.ArrayList;
import java.util.List;

class BankAccount {
    // 1. Private variables for data hiding (Encapsulation) [cite: 8, 24]
    private String accountNumber;
    private String accountHolder;
    private double balance;
    private List<String> transactionHistory;

    // 2. Constructor for initialization [cite: 9]
    public BankAccount(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
        this.transactionHistory = new ArrayList<>();
        this.transactionHistory.add("Account opened with balance: " + initialBalance);
    }

    // 3. Getters and Setters [cite: 10]
    public String getAccountHolder() { return accountHolder; }
    public double getBalance() { return balance; }

    // 4. Deposit method with validation [cite: 11, 12]
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactionHistory.add("Deposited: " + amount + " | New Balance: " + balance);
            System.out.println("Successfully deposited " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // 4. Withdrawal method with business rules [cite: 11, 12]
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactionHistory.add("Withdrew: " + amount + " | New Balance: " + balance);
            System.out.println("Successfully withdrew " + amount);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    // 7. Method to show transaction history [cite: 14]
    public void displayHistory() {
        System.out.println("\nTransaction History for " + accountHolder + ":");
        for (String record : transactionHistory) {
            System.out.println(record);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // 6. Create multiple account objects [cite: 13]
        BankAccount acc1 = new BankAccount("101", "Dinesh", 5000.0);
        BankAccount acc2 = new BankAccount("102", "Rahul", 3000.0);

        // 8. Demonstrate object interaction [cite: 15]
        acc1.deposit(1500);
        acc1.withdraw(2000);
        
        acc2.withdraw(4000); // Should fail due to validation rules [cite: 12]

        acc1.displayHistory();
        acc2.displayHistory();
    }
}
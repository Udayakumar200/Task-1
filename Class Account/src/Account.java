import java.util.Scanner;

public class Account {
    private double balance;

    // No-argument constructor
    public Account() {
        balance = 0.0;
    }

    // Two-argument constructor
    public Account(double initialBalance) {
        balance = initialBalance;
    }

    // Method to deposit amount to the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit of " + amount + " successful. New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw amount from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal of " + amount + " successful. New balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    // Method to display the balance
    public void displayBalance() {
        System.out.println("Current balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating an account using the no-argument constructor
        Account account = new Account();

        // Taking initial balance input
        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();
        account = new Account(initialBalance);

        // Taking deposit input
        System.out.print("Enter deposit amount: ");
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);

        // Taking withdrawal input
        System.out.print("Enter withdrawal amount: ");
        double withdrawalAmount = scanner.nextDouble();
        account.withdraw(withdrawalAmount);

        // Displaying the final balance
        account.displayBalance();

    }
}
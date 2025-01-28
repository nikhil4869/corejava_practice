package com.example.Oops;

class BankAccount {
    private double balance;
    private int withdrawalCount = 0; // Instance variable to track withdrawal count for each object

    // Constructor to initialize balance
    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        // Increment the withdrawal count
        withdrawalCount++;

        // Apply additional charge after the 3rd withdrawal
        if (withdrawalCount > 3) {
            System.out.println("Additional charge of 25 applied.");
            balance -= 25;  // Deduct the additional charge
        }

        // Perform the actual withdrawal
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid withdraw amount.");
        }
    }

    // Getter for withdrawal count (for testing purposes)
    public int getWithdrawalCount() {
        return withdrawalCount;
    }
    void displayBalance(){
        System.out.println(balance);
    }
}

// SavingAccount (Subclass of BankAccount)
class SavingAccount extends BankAccount {
    private double interestRate;

    // Constructor
    public SavingAccount(double balance, double interestRate) {
        super(balance); // Call the superclass constructor
        this.interestRate = interestRate;
    }

    // Method to add interest to the account
    public void addInterest() {
        double interest = getBalance() * interestRate / 100;
        deposit(interest);  // Adding interest by depositing it
        System.out.println("Interest Added: " + interest);
    }

    // Optionally, you could override withdraw if you want specific behavior for SavingAccount
    @Override
    public void withdraw(double amount) {
        super.withdraw(amount); // Calling the superclass method to withdraw
    }
}

// CheckingAccount (Subclass of BankAccount)
class CheckingAccount extends BankAccount {
    private double overdraftLimit;

    // Constructor
    public CheckingAccount(double balance, double overdraftLimit) {
        super(balance); // Call the superclass constructor
        this.overdraftLimit = overdraftLimit;
    }

    // Overriding the withdraw method to allow overdraft
    @Override
    public void withdraw(double amount) {
        if(amount > 0 && amount <= getBalance() + overdraftLimit) {
            super.withdraw(amount);  // Call the superclass withdraw method
        } else {
            System.out.println("Overdraft limit exceeded.");
        }
    }

    // Method to display overdraft limit
    public void displayOverdraftLimit() {
        System.out.println("Overdraft Limit: " + overdraftLimit);
    }
}

// Main class to test the functionality
public class Main {
    public static void main(String[] args) {
        // Create SavingAccount object
        SavingAccount savingAccount = new SavingAccount(1000, 5);  // 1000 balance, 5% interest
        savingAccount.deposit(500);  // Deposit to saving account
        savingAccount.addInterest();  // Add interest
        System.out.println();
        System.out.println("Withdrawal");

        // Perform withdrawals directly on the SavingAccount object
        savingAccount.withdraw(200);  // 1st withdrawal
        savingAccount.withdraw(150);  // 2nd withdrawal
        savingAccount.withdraw(100);  // 3rd withdrawal
        savingAccount.withdraw(50);   // 4th withdrawal (extra charge applied)
        savingAccount.withdraw(100);  // 5th withdrawal (extra charge applied)
        System.out.println();

        // Display the final balance and withdrawal count for SavingAccount
        savingAccount.displayBalance();
        System.out.println("SavingAccount Withdrawal Count: " + savingAccount.getWithdrawalCount());
        System.out.println();

        // Create a CheckingAccount object
        CheckingAccount checkingAccount = new CheckingAccount(1000, 500);  // 1000 balance, 500 overdraft limit
        checkingAccount.deposit(200);  // Deposit to checking account
        System.out.println();
        System.out.println("Withdrawal");

        // Perform withdrawals directly on the CheckingAccount object
        checkingAccount.withdraw(300);  // 1st withdrawal
        checkingAccount.withdraw(100);  // 2nd withdrawal
        checkingAccount.withdraw(50);   // 3rd withdrawal
        checkingAccount.withdraw(200);  // 4th withdrawal (extra charge applied)
        System.out.println();

        // Display the final balance and withdrawal count for CheckingAccount
        checkingAccount.displayBalance();
        System.out.println("CheckingAccount Withdrawal Count: " + checkingAccount.getWithdrawalCount());
    }
}


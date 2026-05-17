package oop;

// The encapsulated class
class BankAccount {
    // 1. Private variables (Data hiding)
    private String accountHolder;
    private double balance;

    // Constructor to initialize the object
    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0; // Fallback default
        }
    }

    // 2. Getter method for account holder name (Read-only access)
    public String getAccountHolder() {
        return accountHolder;
    }

    // 3. Setter method for account holder name (Write-only access)
    public void setAccountHolder(String accountHolder) {
        if (accountHolder != null && !accountHolder.trim().isEmpty()) {
            this.accountHolder = accountHolder;
        }
    }

    // 4. Getter method for balance
    public double getBalance() {
        return balance;
    }

    // 5. Data validation inside business methods instead of raw setters
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Successfully deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Successfully withdrew: $" + amount);
        } else {
            System.out.println("Transaction denied: Insufficient funds or invalid amount.");
        }
    }
}



package oop;
import oop.BankAccount;

// Test Class to run the program
public class Encapsulation {
    public static void main(String[] args) {
        // Creating an encapsulated object
        BankAccount account = new BankAccount("Dheeraj Kumar", 1000.00);

        // Accessing data through public methods
        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Initial Balance: $" + account.getBalance());

        // Modifying data safely via class logic
        account.deposit(500.0);
        account.withdraw(200.0);
        System.out.println("Current Balance: $" + account.getBalance());

        // Malicious or accidental invalid access attempts:
        // account.balance = -5000; // COMPILER ERROR: balance has private access

        // The setter logic blocks invalid values
        account.withdraw(2000.0); // Output: Transaction denied
    }
}

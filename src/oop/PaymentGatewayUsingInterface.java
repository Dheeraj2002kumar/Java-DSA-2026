package oop;

// define the interface contract
interface PaymentProcessor {
    // implicitly public static final constant
    String CURRENCY = "USD";

    // Implicitly public abstract method (No body allowed here)
    void processPayment(double amount);
    void refundPayment(double amount);
}

// first implementation class
class CreditCardProcessor implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card Payment of $" + amount + " " + CURRENCY);
    }

    @Override
    public void refundPayment(double amount) {
        System.out.println("Refunding credit card Payment of $" + amount + " " + CURRENCY);
    }
}

// Second implementation class
class PayPalProcessor implements PaymentProcessor{
    @Override
    public void processPayment(double amount){
        System.out.println("Processing payPal digital payment of $" + amount + " " + CURRENCY);
    }

    @Override
    public void refundPayment(double amount){
        System.out.println("Refunding PayPal digital payment of $" + amount + " " + CURRENCY);
    }
}


public class PaymentGatewayUsingInterface {
    public static void main(String[] args){
        // Interface variables can reference implementation objects (Polymorphism)
        PaymentProcessor card = new CreditCardProcessor();
        PaymentProcessor paypal = new PayPalProcessor();

        System.out.println("------- Processing Transactions -------");
        card.processPayment(250.00);
        paypal.processPayment(89.99);

        System.out.println("\n----------- Processing Refunds ---------");
        card.refundPayment(50.00);
    }
}

/*
An interface in Java is a blueprint of a class that specifies what a class should do, but not how it should do it.
It is a collection of abstract methods (methods without a body) and constant variables.

Classes implement interfaces to guarantee they support specific behaviors, which helps achieve total
abstraction and multiple inheritance in Java.

Key Characteristics
- Abstract Methods: By default, all methods are public and abstract (no code bodies).
- Constants: All fields declared inside an interface are implicitly public static final.
- No Instantiation: You cannot create an object using new InterfaceName().
- Multiple Inheritance: A Java class can implement multiple interfaces at the same time.


Modern Java Interface Features
Java has evolved to allow logic inside interfaces under specific keywords:
default methods: Allow you to add new methods to interfaces with a code body without breaking existing classes that implement the interface.
static methods: Utility methods belonging strictly to the interface class namespace, which cannot be overridden.

interface AdvancedProcessor {
    void pay();

    // Default method providing optional fallback behavior
    default void printReceipt() {
        System.out.println("Generating default standard receipt...");
    }
}

 */
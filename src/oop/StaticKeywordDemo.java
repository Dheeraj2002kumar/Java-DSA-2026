package oop;

public class StaticKeywordDemo {
    // static variable: shared across all instances
    public static int ObjectCounter = 0;

    // Instance variable: each object gets its own unique copy
    public String instanceName;

    // static Initialization block: runs once when class loads
    static {
        System.out.println("LOG: Main class loaded into memory.");
        // Often used to initialize complex static configuration data
    }

    // Constructor updates the shared counter every time an object is made
    public StaticKeywordDemo(String name){
        this.instanceName = name;
        ObjectCounter++; // modifying the shared static tracker
    }

    public static void displayTotalObjects(){
        System.out.println("Total Main objects created: " + ObjectCounter);

        // COMPILER ERROR IF un-commented: Static method cannot see instance variables
//        System.out.println(instanceName);
    }


    public static void main(String[] args){
        System.out.println("------ Starting Application -------");

        // call a static method directly using the class name (no object creation needed)
        StaticKeywordDemo.displayTotalObjects();

        // create instances
        StaticKeywordDemo obj1 = new StaticKeywordDemo("Alpha");
        StaticKeywordDemo obj2 = new StaticKeywordDemo("Beta");

        // show that static variable value is shared and changed globally
        System.out.println("------ Starting Application -------");
        System.out.println("obj1 name: " + obj1.instanceName);
        System.out.println("obj2 name: " + obj2.instanceName);

        // Calling static method again reflects the updated count
        StaticKeywordDemo.displayTotalObjects();
    }

}

/*
The static keyword in Java means that a variable or method belongs directly to the class itself, rather than to instances (objects) of that class.

When you mark something as static, only one copy of that item exists in memory, and it is shared by all instances of that class.

Where Can You Use static?
- Static Variables: Shared across all objects. Perfect for counters, configuration properties, or memory optimization.
- Static Methods: Can be called without creating an object. They can only access other static data directly.
- Static Blocks: Initialization code blocks that execute exactly once when the class is first loaded into memory.
- Static Nested Classes: Inner classes that do not require a reference to the outer class instance.


Key Memory Difference
Instance Fields: Stored inside the Heap Memory inside each independent object.
Static Fields: Stored in a special permanent memory zone inside the heap called the Metaspace (or Method Area), tied explicitly to the class blueprint.

 */
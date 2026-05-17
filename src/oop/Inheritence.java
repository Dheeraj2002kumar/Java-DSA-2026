package oop;

class Shape{
    public void area(){
        System.out.println("Displays area");
    }
}

// single inheritance
/*
Definition: One subclass inherits from exactly one superclass.
Structure: Class A → Class B.
Example: A Dog class extending an Animal class.
 */
class Rectangle extends Shape{
    public void area(int l, int h){
        System.out.println("Rectangle area " + l*h);
    }
}

// multi-level inheritance
/*
Definition: A subclass acts as a superclass for another class, creating a chain.
Structure: Class A → Class B → Class C.
Example: Animal → Dog → Puppy. The Puppy inherits features from both Dog and Animal.
 */
class EquilateralTriangle extends Shape{
    public void area(int l, int h){
        System.out.println("Equilateral triangle area " + l*h);
    }
}

// hierarchical inheritance
/*
Definition: One superclass is inherited by multiple subclasses.
Structure: Class A → Class B & Class A → Class C.
Example: Both Dog and Cat classes extending the same Animal class
 */
class Circle extends Shape {
    public void area(int r){
        System.out.println("Circle area " + (3.14)*r*r);
    }
}

/*
🔌 Types Supported Only by Interfaces
Java does not support these using classes to avoid the "Diamond Problem" (ambiguity when two parents have the same method).

4. Multiple Inheritance
Definition: One class inherits from more than one parent.
Implementation: Achieved by a class implementing multiple interfaces.
Syntax: class MyClass implements Interface1, Interface2 { ... }.

5. Hybrid Inheritance
Definition: A combination of two or more inheritance types (e.g., Multilevel + Multiple).
Implementation: Can only be achieved in Java using a mix of class inheritance and interface implementation

🔑 Key Concepts to Remember

extends Keyword: Used for inheriting a class.

implements Keyword: Used for implementing interfaces.

super Keyword: Used to call the constructor or methods of the parent class.

Method Overriding: When a subclass provides its own specific implementation of a method already defined in its superclass.

Object Class: Every class in Java implicitly inherits from the java.lang.Object class if no other parent is specified.
 */



public class Inheritence {
    public static void main(String[] args) {}
}

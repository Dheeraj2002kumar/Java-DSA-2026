package oop;

class Employee {
    String name;
    int age;

    public void printInfo(String name){
        System.out.println("name " + name);
    }

    public void printInfo(int age){
        System.out.println("Age " + age);
    }

    public void printInfo(String name, int age){
        System.out.println(name + " " + age);
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.name = "Dheeraj";
        emp.age = 23;

        emp.printInfo(emp.age);
        emp.printInfo(emp.name);
        emp.printInfo(emp.name, emp.age);

    }
}

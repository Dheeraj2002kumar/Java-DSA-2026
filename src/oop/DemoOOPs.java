package oop;

class Pen{
    String type;
    String color;

    public void write(){
        System.out.println("Write something...");
    }

    public void printColor(){
        System.out.println(this.color);
    }
}

class Student {
    String name;
    int age;

    public void printInfo(){
        System.out.println("Student info...");
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // non-parameterized constructor
    Student(){
        System.out.println("Student constructor called...");
    }

    // parameterized constructor
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    // copy constructor
    Student(Student s2){
        this.name = s2.name;
        this.age = s2.age;
    }
}

public class DemoOOPs {
    static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Niharika";
        s1.age = 23;

        Student s2 = new Student(s1);
        s2.printInfo();

//        Student s1 = new Student("Dheeraj", 23);
//        s1.name = "Dheeraj";
//        s1.age = 23;

//        s1.printInfo();


//        Pen pen1 = new Pen();
//        pen1.color = "blue";
//        pen1.type = "gel";
//
//        Pen pen2 = new Pen();
//        pen2.color = "red";
//        pen2.type = "ballpoint";
//
//        pen1.printColor();
//        pen2.printColor();
    }
}

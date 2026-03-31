package generic.method;

class Person {
    String name;
    float marks;

    Person(String name, float marks){
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return name + " (" + marks + ")";
    }
}

public class GenericObjectSwap {
    public static void swap(Object x, Object y){
        Object t = x;
        x = y;
        y = t;
    }

    public static void main(String args[]){
        Object p1 = new Person("Dheeraj", 99.99f);
        Object p2 = new Person("Neeraj", 98.99f);

        System.out.println("Before: p1 = " + p1 + " p2 = " + p2);
        swap(p1, p2);
        System.out.println("After: p1 = " + p1 + " p2 = " + p2);
    }
}
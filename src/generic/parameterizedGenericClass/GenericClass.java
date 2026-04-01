package generic.parameterizedGenericClass;

import java.util.Arrays;

public class GenericClass <T> { // < > to specify class type
    T obj;                  // an object of type t is declared

    // constructor of the generic class
    GenericClass(T obj){
        this.obj = obj;
    }

    // a method in the class
    public static <T> void print(T obj){
        System.out.println(obj);
    }
}

class GenericStatic2{
    public static void main(String[] args) {
        GenericClass<Integer[]> a = new GenericClass<>(new Integer[] {10, 20, 20, 40});

        GenericClass<String> s = new GenericClass<>("Joy with Java");
        GenericClass<Double> d = new GenericClass<Double>(1.2);

        // printing the data...
        GenericClass.print(a.obj);  // Print the array a
        GenericClass.print(Arrays.toString(a.obj)); // print array value
        GenericClass.print(s.obj);  // print the string
        GenericClass.print(d.obj);  // print the value
    }
}
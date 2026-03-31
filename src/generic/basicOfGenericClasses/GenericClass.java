package generic.basicOfGenericClasses;

public class GenericClass <T> {
    // Two elements of generic type T is defined below
    private T x;

    // Constructor
    public GenericClass(T t){
        x = t;
    }

    // print the T-type value for an object
    public void printData(){
        System.out.println(x + " ");
    }
} // this completes the definition of a simple generic class GenericClass<T>

// The driver class is programmed below, which creates different type of objects.

class GenericClassTest{
    static void main(String[] args) {
        // A data with the member as String
        GenericClass<String> a = new GenericClass<>("Java");
        a.printData();;

        // A data with the member as integer value
        GenericClass<Integer> b = new GenericClass<>(123);
        b.printData();

        // a data with member as float value
        GenericClass<Double> c = new GenericClass<>(3.1412);
        c.printData();
    }
}
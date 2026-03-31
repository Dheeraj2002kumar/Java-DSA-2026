package generic.method;

public class StaticGenericMethod {
    // Defining a static generic method to print any data type
    static <T> void genericPrint (T t){
        // print which type parameter T this method is handling
        System.out.println(t.getClass().getName() + ":" + t);
    }

    static void main(String[] args) {
        genericPrint(101); // calling generic method with integer argument
        genericPrint("Joy with Java");  // calling generic method with String argument
        genericPrint(3.1412);  // calling generic method with double argument
    }
}

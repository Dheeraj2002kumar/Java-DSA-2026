package generic.parameterizedGenericClass;

public class GenericStatic <T> {
    // Defining a static generic method to print any data type
    static <T> void gPrint(T t){
        System.out.println(t);
    }

    static void main(String[] args) {
        gPrint(10); // calling generic method with integer argument
        gPrint("Joy with Java"); // String argument
        gPrint(3.1412); // double argument
    }
}

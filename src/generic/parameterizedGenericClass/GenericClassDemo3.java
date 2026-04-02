package generic.parameterizedGenericClass;

// generic class multiple type parameter
//class GenericClass4<T, V> {
//    T Obj1;
//    V obj2;
//
//    // constructor of the generic class
//    GenericClass4(T obj1, V obj2) {
//        this.obj1 = obj1;
//        this.obj2 = obj2;
//    }
//}


class GenericClass3<T> {
    T obj;

    // constructor of the generic class
    GenericClass3(T obj){
        this.obj = obj;
    }
}


public class GenericClassDemo3 {
    static void main(String[] args) {
        GenericClass3<Integer> a = new GenericClass3<Integer>(123); // okay
//    GenericClass3<int> a1 = new GenericClass3<int>(123); // ERROR!

        GenericClass3<String> s = new GenericClass3<>("Joy with java"); // Okay

//    GenericClass3<double> d = new GenericClass3<double>(3.5); // ERROR!
        GenericClass3<Double> d1 = new GenericClass3<Double>(3.5); // okay
    }
}

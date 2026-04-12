package generic.boundedArgumentGenericClass;

import generic.parameterizedGenericClass.GenericClass;

class GenericBound<T extends Number> {
    T[] array;

    GenericBound(T[] t){
        array = t;
    }

    double average(){
        double sum = 0.0;
        for(int i = 0; i < array.length; i++){
            sum += array[i].doubleValue();
        }
        return sum / array.length;
    }
}
public class GenericBoundDemo {
    static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        GenericBound<Integer> intData = new GenericBound<>(intArray);

        double avgInt = intData.average();
        System.out.println("Average is " + avgInt);

        Double[] doubleArray = {1.2, 3.4, 5.5, 44.4};
        GenericBound<Double> doubleData = new GenericBound<>(doubleArray);

        double avgDouble = doubleData.average();
        System.out.println("Average is " + avgDouble);

        // Not allowd (will give comile-time error)
//        String[] strArray = {"1", "2", "3", "5"};
//        GenericBound<String> strData = new GenericBound<String>(strArray);

        /*
        double avgStr = strData.average();  // ERROR!
        System.out.println("Average is " + avgStr);
         */
    }
}

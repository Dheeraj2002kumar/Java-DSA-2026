package generic.basicOfGenericClasses;

public class GenericArray <T>{
    // Declaring an array, which should store any type T of data
    T a[];

    // Constructor
    GenericArray(T[] x){
        a = x;
    }

    T getData(int i){
        return a[i];
    }

    int length(){
        return a.length;
    }

    // A generic method to print the elements in array b
    public static <T> void printData(GenericArray<T> b) {
        for(int i = 0; i < b.length(); i++){
            System.out.print(b.getData(i) + " "); // print the ith element in b
        }
        System.out.println();
    }

    // Generic method to reverse the order of elements in array b
    public static <T> void reverseArray(GenericArray<T> b){
        int front = 0, rear = b.length() - 1;

        while(front < rear){
           T temp = b.a[rear];
            b.a[rear] = b.a[front];
            b.a[front] = temp;
            front++; rear--;
        }
    }

    static void main(String[] args) {
        // creating an array of integer data
        Integer[] x = {10, 20, 30, 40, 50}; // it is an array of integer numbers

        // store the data into generic array
        GenericArray<Integer> aInt = new GenericArray<Integer>(x);
        // Alternatively;
//        GenericArray<Integer> aInt1 = new GenericArray<>(new Integer[]{10, 20, 30, 40, 50});

        // printing the data ...
        printData(aInt); // printing the array of integer objects

        // Reverse ordering of data ...
        reverseArray(aInt);

        // Printing the data after reverse ordering...
        printData(aInt);
        System.out.println();

        // creating an array of String data
        String[] y = {"A", "B", "C", "D", "E"}; //String object

        // store the data into a generic array
        GenericArray<String> bString = new GenericArray<String>(y);

        printData(bString);
        reverseArray(bString);
        printData(bString); // printing data after reversing
        System.out.println();


        // creating an array of double data
        Double[] z = {1.2, 3.4, 5.6, 7.8};

        GenericArray<Double> cDouble = new GenericArray<Double>(z);

        printData(cDouble);

        // reverse ordering of data
        reverseArray(cDouble);

        // printing the data after reverse ordering
        printData(cDouble); // after reversing the array
    }
}

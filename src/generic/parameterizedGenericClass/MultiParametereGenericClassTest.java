package generic.parameterizedGenericClass;

class PairData<T, V>{
    // Two fields of generic type T and V
    private T x;
    private V y;

    // constructor
    public PairData(T a, V b){
        x = a;
        y = b;
    }

    // Get the T-type value for a pair-data
    public T getTvalue(){
        return x;
    }

    // get the V-type for a pair-data
    public V getVvalue(){
        return y;
    }

    // To print the data member in an object
    public void printData(){
        System.out.println(getTvalue() + ", " + getVvalue());
    }
} // this complete the definition of the class PairData<T, V>

public class MultiParametereGenericClassTest {
    static void main(String[] args) {
        // A pair data with both members as String
        PairData<String, String> a = new PairData<String, String>("Dheeraj", "Niharika");
        a.printData();

        // A pair data with the first member as String and other as Integer
        PairData<String, Integer> b = new PairData<>("Dheeraj", 789);
        b.printData();

        // A pair data with the first member as Integer and other as String
        PairData<Integer, String> c = new PairData<Integer, String>(95, "Niharika");
        c.printData();

        // A pair data with the first member as Integer and other as Double
        PairData<Integer, Double> d = new PairData<>(555, 35.3);
        d.printData();
    }
}

package generic.basicOfGenericClasses;

public class SpecificArrayDouble {
    // Declaring an array of Double numbers
    double[] a;

    // Constructor to load the array
    SpecificArrayDouble(double a[]){
        this.a = a;
    }
    // Method to print the array elements
    void printInt(){
        for (double x : a){
            System.out.print(x + " ");
        }
        System.out.println();
    }

    // Method to reverse the array elements
    void reverseInt(){
        int j = a.length - 1;
        for (int i = 0; i < j; i++){
            double temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            j--;
        }
    }

    static void main(String[] args) {
        // this class use the class SpecificArrayInt to manipulate data in it
        double[] arr = {1.2, 2.3, 3.4, 4.5, 5.6};

        SpecificArrayDouble obj = new SpecificArrayDouble(arr);

        obj.printInt();
        obj.reverseInt();
        obj.printInt();
    }
}

package generic.basicOfGenericClasses;


public class SpecificArrayString {
    // Declaring an array of Double numbers
    String[] a;

    // Constructor to load the array
    SpecificArrayString(String a[]){
        this.a = a;
    }
    // Method to print the array elements
    void printInt(){
        for (String x : a){
            System.out.print(x + " ");
        }
        System.out.println();
    }

    // Method to reverse the array elements
    void reverseInt(){
        int j = a.length - 1;
        for (int i = 0; i < j; i++){
            String temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            j--;
        }
    }

    static void main(String[] args) {
        // this class use the class SpecificArrayInt to manipulate data in it
        String[] arr = {"A", "B", "C", "D", "E"};

        SpecificArrayString obj = new SpecificArrayString(arr);

        obj.printInt();
        obj.reverseInt();
        obj.printInt();
    }
}

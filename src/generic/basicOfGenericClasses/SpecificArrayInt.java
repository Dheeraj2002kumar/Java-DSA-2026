package generic.basicOfGenericClasses;

public class SpecificArrayInt {
    // Declaring an array of integer numbers
    int[] a;

    // Constructor to load the array
    SpecificArrayInt(int a[]){
        this.a = a;
    }
    // Method to print the array elements
    void printInt(){
        for (int x : a){
            System.out.print(x + " ");
        }
        System.out.println();
    }

    // Method to reverse the array elements
    void reverseInt(){
        int j = a.length - 1;
        for (int i = 0; i < j; i++){
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            j--;
        }
    }

    static void main(String[] args) {
        // this class use the class SpecificArrayInt to manipulate data in it
        int[] arr = {1, 2, 3, 4, 5};

        SpecificArrayInt obj = new SpecificArrayInt(arr);

        obj.printInt();
        obj.reverseInt();
        obj.printInt();
    }
}

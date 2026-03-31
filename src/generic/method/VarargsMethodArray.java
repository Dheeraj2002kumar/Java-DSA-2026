/*
Methods with Variable List of parameters

Declaration of "varargs" methods

1. Using an array
gMethod1(T[] t);

2. Using ellipsis(three dots)
gMethod2(T ... t);

3. Using Object class
gMethod3(Object[] o);

Varargs methods using array
- You can define a varargs method with an argument an array (of an type).
- In other words, the values which you want to pass to a method, store them in an array and then pass the array to the method.

 */

package generic.method;

public class VarargsMethodArray {
    static void varargsMethod1(int v[]){
        System.out.println("Number of args: " + v.length + " Elements: ");

        for (int x : v){
            System.out.println(x + " ");
        }
        System.out.println();
    }

    static void main(String[] args) {
        // Following arrays are created for test ...
        int x[] = {1, 3, 5, 7};
        int y[] = {2, 4};
        int z[] = { };

        varargsMethod1(x); // passed 4 values to the method
        varargsMethod1(y);  // passed 2 values to the method
        varargsMethod1(z);  // passed no argument to the method
    }
}

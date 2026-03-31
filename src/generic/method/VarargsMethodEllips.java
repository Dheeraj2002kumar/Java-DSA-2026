/*
varargs methods using Ellipsis

The syntax to define varargs method with this approach is given below.

<accessSpecifier> <ReturnType> <MethodName> (<Type> ...<arrayName>){
... // Method body
}

 */

package generic.method;

public class VarargsMethodEllips {
    // defining a varargs method using ellipsis
    static void varargsMethod2(int ...v){
        System.out.println("Number of arguments: " + v.length);

        for(int i : v){
            System.out.println(i + " ");
        }
        System.out.println();
    }

    static void main(String[] args) {
        // calling the varargs method with variable arguments
        varargsMethod2(9);  // one parameter
        varargsMethod2(1, -2, 3, -4);  // four parameter
        varargsMethod2();  // no parameter
    }
}

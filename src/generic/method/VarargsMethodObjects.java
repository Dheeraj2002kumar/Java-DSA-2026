/*
Variable methods using Object

1. This is the most elegant approach to implement the varargs method in a java program.
2. It uses the ellipsis and in addition to this, it uses the Object type.
3. For Example, to define a varargs method using Object, your method declaration should take the following form.

public static void methodName(Object ...obj){
    // body of the method
}

Note:
- The restriction that the method can have zero or more parameters preceding this, but this must be the last.

 */

package generic.method;

public class VarargsMethodObjects {
    public static void varargsMethod3(Object ...obj){
        for(Object o : obj){
            System.out.println(" " + o);
        }
        System.out.println();
    }

    static void main(String[] args) {
        varargsMethod3(1, "String", 2.3, true); // four arguments
        varargsMethod3(); // no arguments
        varargsMethod3(15, 25, 25, 45, 55); // five arguments
    }

}

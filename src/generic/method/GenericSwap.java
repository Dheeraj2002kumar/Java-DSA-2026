/*
Parameter Passing

Types of parameters in a method definition is an issue.

Note:
Parameters should be class type.

 */

package generic.method;

import java.nio.file.Watchable;

class Wrapper<T> {
    T value;
}

public class GenericSwap {
    public static <T> void swap(Wrapper<T> a, Wrapper<T> b){
        T temp = a.value;
        a.value = b.value;
        b.value = temp;
    }

    public static void main(String[] args) {

        // ------- Integer value swap -------------
        Wrapper<Integer> x = new Wrapper<>();
        Wrapper<Integer> y = new Wrapper<>();

        x.value = 90;
        y.value = 56;

        System.out.println("Before: x = " + x.value + " y = " + y.value);
        swap(x, y);
        System.out.println("After: x = " + x.value + " y = " + y.value);

        // --------- double value swap -----------
        Wrapper<Integer> doubleVal1 = new Wrapper<>();
        Wrapper<Integer> doubleVal2 = new Wrapper<>();

        doubleVal1.value = 90;
        doubleVal2.value = 56;

        System.out.println("Before: Double Value = " + doubleVal1.value + " Double Value = " + doubleVal2.value);
        swap(doubleVal1, doubleVal2);
        System.out.println("After: Double Value = " + doubleVal1.value + " Double Value = " + doubleVal2.value);

        // ---------- string swap ------------

        Wrapper<String> s1 = new Wrapper<>();
        Wrapper<String> s2 = new Wrapper<>();

        s1.value = "99";
        s2.value = "66";

        System.out.println("S1 = " + s1.value + " " + "s2 = " + s2.value);
        swap(s1, s2);
        System.out.println("S1 = " + s1.value + " " + "s2 = " + s2.value);

    }
}
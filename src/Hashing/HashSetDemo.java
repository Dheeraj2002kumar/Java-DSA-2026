package Hashing;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    static void main(String[] args) {
        // creating
        HashSet<Integer> set = new HashSet<>();

        // insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);

        // size
        System.out.println("size of set is: " + set.size());

        // search - contains
        if (set.contains(1)) System.out.println("Set contains 1");

        if(!set.contains(6)) System.out.println("dons't contain 6");

        // delete
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("dons't contain 1 - we deleted 1");
        }

        // print all element
        System.out.println("Element of set: " + set);

        // Iterator [hasNext, next]
        Iterator it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        // other method
        System.out.println("\nOther method to iterate: ");
        for (Integer integer : set) {
            System.out.println(integer);
        }
    }
}

package collectionframwork;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayLIst {
    static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        // add elements
        list.add(0);
        list.add(1);
        list.add(2);

        System.out.println(list);

        // get elements
        int element = list.get(2);
        System.out.println(element);

        // add element in between
        list.add(2, 5);
        System.out.println(list);

        // update element in the given index using set method
        list.set(0, 55);
        System.out.println(list);

        // delete element in specific index
        list.remove(3);
        System.out.println(list);

        // get size of the array
        int size = list.size();
        System.out.println("Size of the array ==> " + size);

        // loop
        for(int i = 0; i < list.size(); ++i){
            System.out.println(list.get(i));
        }

        // sort
        Collections.sort(list);
        System.out.println(list);
    }
}

package exam;
import java.util.LinkedList;
import java.util.Collections;

public class DoublyLinkedListCollection {

    LinkedList<Integer> list = new LinkedList<>();

    public void insertAtEnd(int data) {
        list.addLast(data);
    }

    public void displayForward() {
        System.out.print("List: ");
        for (Integer num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public void sortList() {
        Collections.sort(list);
    }

    public static void main(String[] args) {

        DoublyLinkedListCollection dll = new DoublyLinkedListCollection();

        dll.insertAtEnd(30);
        dll.insertAtEnd(10);
        dll.insertAtEnd(50);
        dll.insertAtEnd(20);


        System.out.println("Before Sorting:");
        dll.displayForward();

        dll.sortList();

        System.out.println("After Sorting:");
        dll.displayForward();
    }
}
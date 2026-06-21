package exam;

class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedList {
    Node head;
    Node tail;

    // Insert at Beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // Insert at End
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // Insert at Position
    public void insertAtPosition(int data, int position) {
        if (position == 1) {
            insertAtBeginning(data);
            return;
        }

        Node temp = head;

        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid Position");
            return;
        }

        Node newNode = new Node(data);

        newNode.next = temp.next;
        newNode.prev = temp;

        if (temp.next != null) {
            temp.next.prev = newNode;
        } else {
            tail = newNode;
        }

        temp.next = newNode;
    }

    // Display Forward
    public void displayForward() {
        Node temp = head;

        System.out.print("Forward: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Display Backward
    public void displayBackward() {
        Node temp = tail;

        System.out.print("Backward: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    // Delete Beginning
    public void deleteBeginning() {
        if (head == null) {
            System.out.println("List Empty");
            return;
        }

        if (head == tail) {
            head = tail = null;
            return;
        }

        head = head.next;
        head.prev = null;
    }

    // Delete End
    public void deleteEnd() {
        if (head == null) {
            System.out.println("List Empty");
            return;
        }

        if (head == tail) {
            head = tail = null;
            return;
        }

        tail = tail.prev;
        tail.next = null;
    }

    // Delete Position
    public void deletePosition(int position) {
        if (position == 1) {
            deleteBeginning();
            return;
        }

        Node temp = head;

        for (int i = 1; i < position && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid Position");
            return;
        }

        if (temp.next != null) {
            temp.next.prev = temp.prev;
        } else {
            tail = temp.prev;
        }

        temp.prev.next = temp.next;
    }

    // Search Element
    public void search(int key) {
        Node temp = head;
        int pos = 1;

        while (temp != null) {
            if (temp.data == key) {
                System.out.println("Element found at position: " + pos);
                return;
            }
            temp = temp.next;
            pos++;
        }

        System.out.println("Element not found");
    }
}

public class PreorderDemo {
    public static void main(String[] args) {

        DoublyLinkedList dll = new DoublyLinkedList();

        dll.insertAtEnd(10);
        dll.insertAtEnd(20);
        dll.insertAtEnd(30);

        dll.displayForward();
        dll.displayBackward();

        dll.insertAtBeginning(5);
        dll.insertAtPosition(15, 3);

        dll.displayForward();

        dll.search(20);

        dll.deleteBeginning();
        dll.deleteEnd();
        dll.deletePosition(2);

        dll.displayForward();
        dll.displayBackward();
    }
}
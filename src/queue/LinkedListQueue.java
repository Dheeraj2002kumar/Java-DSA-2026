package queue;

public class LinkedListQueue {
    static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }

    static class LLQueue{
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty(){
            return head == null && tail == null;
        }

        // enqueue
        public static void add (int data){
            Node newNode = new Node(data);

            if (tail == null){
                tail = head = newNode;
                return;
            }

            tail.next = newNode;
            tail = newNode;
        }

        // dequeue - O(1)
        public static int remove(){
            if (isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }

            int front = head.data;
            if (head == tail){
                tail = null;
            }

            head = head.next;
            return front;
        }

        // peek
        public static int peek(){
            if (isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }

            return head.data;
        }
    }

    public static void main(String[] args) {
        LLQueue llq= new LLQueue();
        llq.add(1);
        llq.add(2);
        llq.add(3);
        llq.add(4);
        llq.add(5);

        while (!llq.isEmpty()){
            System.out.println(llq.peek());
            llq.remove();
        }
    }
}

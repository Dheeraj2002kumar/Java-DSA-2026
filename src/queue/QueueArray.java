package queue;

public class QueueArray {
    static class Queue{
        static int[] arr;
        static int size;
        static int rear = -1;

        Queue(int n){
            arr = new int[n];
            size = n;
        }

        public static boolean isEmpty(){
            return rear == -1;
        }

        // enqueue
        public static void add(int data){
            if (rear == size -1){
                System.out.println("full queue");
                return;
            }

            rear++;
            arr[rear] = data;
        }

        // dequeue
        public static int remove(){
            if (isEmpty()){
                System.out.println("Empty queue");
                return -1;
            }

            int front = arr[0];
            for (int i = 0; i < rear; i++){
                arr[i] = arr[i+1];
            }

            rear--;
            return front;
        }

        // peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Empty queue");
            }

            return arr[0];
        }
    }

    static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.add(1);
        queue.add(2);
        queue.add(3);

        while (!queue.isEmpty()) {
            System.out.println(queue.peek());
            queue.remove();
        }
    }
}

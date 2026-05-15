package stack;

import java.util.ArrayList;

public class StackArray {
    static class StackArr{
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty(){
            return list.isEmpty();
        }

        public static void push(int data){
            list.add(data);
        }

        public static int pop(){
            if (isEmpty()){
                return -1;
            }
            int top = list.getLast();
            list.removeLast();
            return top;
        }

        public static int peek(){
            if (isEmpty()){
                return -1;
            }

            return list.get(list.size() - 1);
        }

        public boolean isEmpt() {
            return list.isEmpty();
        }
    }

    public static void main(String[] args){
        StackArr s = new StackArr();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while (!s.isEmpt()){
            System.out.println(s.peek());
            s.pop();
        }

    }
}

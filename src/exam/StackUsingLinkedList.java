package exam;

import java.util.LinkedList;

public class StackUsingLinkedList {
    LinkedList<Integer> stack = new LinkedList<>();

    public void push(int value){
        stack.addFirst(value);
        System.out.println(value + " Pushed to the stack");
    }

    public void pop(){
        if(stack.isEmpty()){
            System.out.println("Stack Underflow");
            return;
        }

        int value = stack.removeFirst();
        System.out.println(value + " Popped from the stack");
    }

    public void display(){
        if(stack.isEmpty()) System.out.println("Stack Empty");

        System.out.println("Stack Element: " + stack);
    }

    public static void main(String[] args){
        StackUsingLinkedList stack = new StackUsingLinkedList();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        stack.display();
        stack.pop();
        stack.display();
    }
}

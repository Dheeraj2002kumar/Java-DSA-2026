package exam;

import java.util.LinkedList;
import java.util.Queue;

public class BFSExam {
    public static void main(String[] args){
        Queue<Integer> queue = new LinkedList<Integer>();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);

        System.out.println(queue);
        while(!queue.isEmpty()){
            System.out.print(queue.poll() + " ");
        }
    }
}

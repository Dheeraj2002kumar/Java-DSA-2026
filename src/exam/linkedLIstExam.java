package exam;

import java.util.LinkedList;

public class linkedLIstExam {
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println("LinkedList: " + list);

        list.remove(Integer.valueOf(3));
        System.out.println("LinkedList: " + list);

        int target = 5;
        if(list.contains(target)){
            System.out.println(target + " is found");
        } else System.out.println(target + " is not fount");
    }
}

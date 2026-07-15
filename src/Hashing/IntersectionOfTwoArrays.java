/*
Intersection of 2 arrays

arr1 = {7, 3, 9}
arr2 = {6, 3, 9, 2, 9, 4}

intersection = 2 (3, 9)
 */

package Hashing;

import java.util.HashSet;

public class IntersectionOfTwoArrays {
    public static int intersection(int[] arr1, int[] arr2){
        HashSet<Integer> set = new HashSet<>();
        int count = 0;

        for (int i = 0; i < arr1.length; i++)
            set.add(arr1[i]);

        for(int i = 0; i < arr2.length; i++){
            if(set.contains(arr2[i])){
                count++;
                set.remove(arr2[i]);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr1 = {7, 3, 9};
        int[] arr2 = {6, 3, 9, 2, 9, 4};
        System.out.println(intersection(arr1, arr2));
    }
}

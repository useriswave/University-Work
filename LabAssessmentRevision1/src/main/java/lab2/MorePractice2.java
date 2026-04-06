package lab2;

import java.util.ArrayList;

public class MorePractice2 {
    public static void main(String[] args) {
        var list = new ArrayList<Integer>();
        int[] numsToAdd = {4, 9, 2, 9, 1};

        for(int nta : numsToAdd) {
            list.add(nta);
        }

        System.out.println("Before: " + list);

        System.out.println(topList(list));
    }
    public static ArrayList<Integer> topList(ArrayList<Integer> nos) {
        var list = new ArrayList<Integer>();
        int largest = nos.getFirst();

        for (int n : nos) {
            if (n >= largest) {
                largest = n;
            }
        }
        int largestIndex = 0;
        for(int n : nos) {
            if(n == largest) {
                list.add(largestIndex);
            }
            largestIndex++;
        }
        return list;
    }
}

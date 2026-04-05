package lab1;

import java.util.ArrayList;

public class Q4 {
    public static void main(String[] args) {
        var list1 = new ArrayList<Integer>();
        var list2 = new ArrayList<Integer>();

        int[] items1 = {1,2,3,4};
        int[] items2 = {10,20,30,40};

        for(int n : items1) {
            list1.add(n);
        }
        for(int n : items2) {
            list2.add(n);
        }

        System.out.println(mergeLists(list1, list2));
    }

    public static ArrayList<Integer> mergeLists(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
        var nList = new ArrayList<Integer>();
        for(int n : arr1) {
            nList.add(n);
        }
        for(int n : arr2) {
            nList.add(n);
        }
        return nList;
    }
}
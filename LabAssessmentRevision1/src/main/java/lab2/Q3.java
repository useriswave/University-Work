package lab2;

import java.util.ArrayList;

public class Q3 {
    public static void main(String[] args) {
        var list = new ArrayList<Integer>();

        int[] nta = {5, 1, 2, 2, 3, 5, 4, 1};

        for (int n : nta) {
            list.add(n);
        }

        System.out.println(removeDuplicates(list));
    }

    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> arr) {
        var newList = new ArrayList<Integer>();
        for (int num : arr) {
            if (!newList.contains(num)) {
                newList.add(num);
            }
        }
        return newList;
    }
}


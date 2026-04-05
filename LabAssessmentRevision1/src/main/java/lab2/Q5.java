package lab2;

import java.util.ArrayList;

public class Q5 {
    public static void main(String[] args) {
        var list = new ArrayList<String>();
        String[] wToAdd = {"A", "B", "C", "D"};

        for(String w : wToAdd) {
            list.add(w);
        }

        System.out.println(reverseList(list));
    }

    public static ArrayList<String> reverseList(ArrayList<String> arr) {
        var nList = new ArrayList<String>(0);
        for(int i = arr.size()-1; i >= 0; i--) {
            nList.add(arr.get(i));
        }
        return nList;
    }
}

package lab1;

import java.util.ArrayList;
import java.util.Collections;

public class Q2 {
    public static void main(String[] args) {
        var list = new ArrayList<String>();

        String[] words = {"Hello","Hey","Dog","Apple","Restaurant","Red","Stove"};

        String key = "Stove";

        Collections.addAll(list, words);

        System.out.println(findMyString(list, key));
    }

    public static int findMyString(ArrayList<String> arr, String key) {
        if(arr.contains(key))
            return arr.indexOf(key);

        return -1;
    }
}


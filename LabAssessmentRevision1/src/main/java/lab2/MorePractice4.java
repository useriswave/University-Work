package lab2;

import java.util.ArrayList;
import java.util.Collections;

public class MorePractice4 {
    public static void main(String[] args) {
        var list = new ArrayList<String>();
        int size = 4;
        String[] wta = {"cat", "house", "hi", "apple"};

        Collections.addAll(list, wta);

        System.out.println(remove(list, size));
    }

    public static ArrayList<String> remove(ArrayList<String> words, int size) {
        var list = new ArrayList<String>();
        for(String w : words) {
            if(w.length() >= size)
                list.add(w);
        }
        return list;
    }
}



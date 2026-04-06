package mockassessments.two;

import java.util.ArrayList;
import java.util.Collections;

public class Q1 {
    public static void main(String[] args) {
        String[] wta = {"hi", "apple", "car", "university", "to"};
        var list = new ArrayList<String>();
        int minLength = 3;

        Collections.addAll(list, wta);
        System.out.println(removeShortWords(list, minLength));
    }
    public static ArrayList<String> removeShortWords(ArrayList<String> words, int minLength) {
        var list = new ArrayList<String>();
        for(String w : words) {
            if(w.length() >= minLength) {
                list.add(w);
            }
        }
        return list;
    }
}

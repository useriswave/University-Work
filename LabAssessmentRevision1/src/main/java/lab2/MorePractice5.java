package lab2;

import java.util.ArrayList;
import java.util.Collections;

public class MorePractice5 {
    public static void main(String[] args) {
        var list = new ArrayList<Integer>();
        Integer[] nta = {3, -1, 0, 7, -5};

        Collections.addAll(list, nta);

        System.out.println(positivesOnly(list));

    }

    public static ArrayList<Integer> positivesOnly(ArrayList<Integer> nos) {
        var list = new ArrayList<Integer>();
        for(int i = 0; i < nos.size(); i++) {
            if(nos.get(i) > 0) {
                list.add(nos.get(i));
            }
        }
        return list;
    }
}

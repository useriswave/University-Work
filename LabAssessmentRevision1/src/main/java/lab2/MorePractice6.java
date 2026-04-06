package lab2;

import java.util.ArrayList;
import java.util.Collections;

public class MorePractice6 {
    public static void main(String[] args) {
        Integer[] nta = {2, 5, 7};
        var list = new ArrayList<Integer>();
        int num = 3;
        Collections.addAll(list, nta);
        adder(list, num);
        System.out.println(list);
    }

    public static void adder(ArrayList<Integer> nos, int num) {
        for(int i = 0; i < nos.size(); i++) {
            nos.set(i, nos.get(i)+num);
        }
    }
}

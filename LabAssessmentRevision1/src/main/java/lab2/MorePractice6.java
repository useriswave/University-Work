package lab2;

import java.util.ArrayList;
import java.util.Collections;

public class MorePractice6 {
    public static void main(String[] args) {
        Integer[] nta = {2, 5, 7};
        var nos = new ArrayList<Integer>();
        int num = 3;
        Collections.addAll(nos, nta);
        adder(nos, num);
        System.out.println(nos);
    }

    public static void adder(ArrayList<Integer> nos, int num) {
        for(int i = 0; i < nos.size(); i++) {
            nos.set(i, nos.get(i)+num);
        }
    }
}

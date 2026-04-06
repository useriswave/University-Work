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

        System.out.println(nos);
        for(int i = 0; i < nos.size(); i++) {
            System.out.println(nos.get(i));
            nos.set(nos.indexOf(nos.get(i)), nos.get(i)+num);
        }
    }
}

package lab2;

import java.util.ArrayList;
import java.util.Collections;

public class MorePractice7 {
    public static void main(String[] args) {
        var list = new ArrayList<Integer>();
        Integer[] nta = {-2, 5, 0, 3, -1};

        Collections.addAll(list, nta);
        System.out.println(sumPositive(list));
    }

    public static int sumPositive(ArrayList<Integer> nos) {
        int sum = 0;
        for(int n : nos) {
            if(n >= 0) {
                sum += n;
            }
        }
        return sum;
    }
}

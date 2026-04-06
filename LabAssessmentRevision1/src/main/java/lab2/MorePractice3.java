package lab2;

import java.util.ArrayList;

public class MorePractice3 {
    public static void main(String[] args) {
        int n = 5;

        System.out.println(squares(n));
    }

    public static ArrayList<Integer> squares(int num) {
        var list = new ArrayList<Integer>();
        for(int i = 1; i <= num; i++) {
            list.add((int) Math.pow(i, 2));
        }
        return list;
    }
}

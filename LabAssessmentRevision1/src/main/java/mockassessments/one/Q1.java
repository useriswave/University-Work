package mockassessments.one;

import java.util.ArrayList;

public class Q1 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(buildEvenList(n));
    }

    public static ArrayList<Integer> buildEvenList(int n) {
        var list = new ArrayList<Integer>();
        if(n >= 2) {
            for(int i = 2; i <= n; i+=2) {
                list.add(i);
            }
        }
        return list;
    }
}

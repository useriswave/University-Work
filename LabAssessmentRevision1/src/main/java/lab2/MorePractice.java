package lab2;

import java.util.ArrayList;
import java.util.Random;

public class MorePractice {
    public static void main(String[] args) {
        var r = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        list2.add(1);
        list2.add(2);
        list2.add(3);

        list2.add(list2.get(list2.indexOf(1)), 0);

        System.out.println(list2);

        for(int i = 0; i < 5; i++) {
            list.add(r.nextInt(-5, 6));
        }

        System.out.println(list);

        System.out.println(removeNegativeNumbers(list));
    }

    public static ArrayList<Integer> removeNegativeNumbers(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 0) {
                list.remove(list.get(i));
            }
        }
        return list;
    }
}

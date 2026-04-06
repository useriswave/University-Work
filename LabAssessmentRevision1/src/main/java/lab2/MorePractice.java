package lab2;

import java.util.ArrayList;
import java.util.Random;

public class MorePractice {
    public static void main(String[] args) {
        var r = new Random();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < 5; i++) {
            list.add(r.nextInt(-5, 6));
        }

        insertZeros(list);
        System.out.println(list);

        System.out.println(removeNegativeNumbers(list));
    }

    public static void insertZeros(ArrayList<Integer> list) {
        for(int i = 0; i < list.size(); i+=2) {
            list.add(i+1, 0);
        }
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

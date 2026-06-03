package session2.arrayliststuff;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(3);
        list.add(32);
        list.add(46);
        list.add(0, 999);
        list.set(0, 888);
        list.add(46);
        list.add(32);
        list.add(92);
        list.add(92);
        list.add(11);

        System.out.println(list);
        list = removeDuplicates(list);
        System.out.println(list);
    }

    public static <T> ArrayList removeDuplicates(ArrayList<T> arr)
    {
        var clean = new ArrayList<T>();

        for (T num : arr) {
            if (!clean.contains(num))
                clean.add(num);
        }

        return clean ;
    }
}

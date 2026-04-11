package com.me.dynamicarrays.main;

import com.me.dynamicarrays.array.Array;

public class Main {
    public static void main(String[] args) {
        Array array = new Array();

        array.add(59);
        array.add(382);
        array.add(4895);

        System.out.println(array);

        System.out.println("First Element:" + array.getFirst());
        System.out.println("Last Element:" + array.getLast());

        array.insert(2, 60);
        array.removeByIndex(1);
        array.remove(array.get(0));

        System.out.println(array.get(1));
        System.out.println(array);

        array.clear();
        System.out.println(array);
    }
}

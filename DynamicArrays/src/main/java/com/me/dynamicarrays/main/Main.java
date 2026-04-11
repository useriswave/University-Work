package com.me.dynamicarrays.main;

import com.me.dynamicarrays.array.Array;

public class Main {
    public static void main(String[] args) {
        Array array = new Array();

        array.add(59);
        array.add(382);
        array.add(4895);

        array.insert(2, 60);
        array.removeByIndex(1);
        array.remove(array.get(0));

        System.out.println(array.get(1));
        System.out.println(array);
        System.out.println(array.getFirst());

        array.clear();
        System.out.println(array);

    }
}

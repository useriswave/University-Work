package com.me.dynamicarrays.main;

import com.me.dynamicarrays.array.Array;


public class Main {
    public static void main(String[] args) {
        Array array = new Array();

        array.add(59);
        array.add(29);
        array.add(3);

        array.insert(1, 500);
        array.insert(2, 847);

        array.removeByIndex(2);

        System.out.println(array);
    }
}

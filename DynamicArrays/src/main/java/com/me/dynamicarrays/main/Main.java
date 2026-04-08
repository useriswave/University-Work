package com.me.dynamicarrays.main;

import com.me.dynamicarrays.array.Array;

public class Main {
    public static void main(String[] args) {
        Array array = new Array();

        array.add(59);
        array.add(382);

        System.out.println(array.get(1));
        System.out.println(array);
    }
}

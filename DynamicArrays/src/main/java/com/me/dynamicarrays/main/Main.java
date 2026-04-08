package com.me.dynamicarrays.main;

import com.me.dynamicarrays.array.Array;


public class Main {
    public static void main(String[] args) {
        Array array = new Array();
        array.insert(59);
        array.insert(29);
        array.insert(3);
        array.remove(4);

        System.out.println(array);
    }
}

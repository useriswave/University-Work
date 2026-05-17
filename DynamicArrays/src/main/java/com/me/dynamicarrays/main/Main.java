package com.me.dynamicarrays.main;

import com.me.dynamicarrays.array.Array;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        Array array = new Array();

        for (int i = 0; i < r.nextInt(5, 21); i++) {
            array.add(r.nextInt(0, 51));
        }

        System.out.println("Before sort: " + array);

        array.sort();

        System.out.println("After sort:  " + array);
    }
}

package com.me.dynamicarrays.main;

import com.me.dynamicarrays.array.Array;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        Array array = new Array();

        for(int i = 0; i < 10; i++) {
            array.add(r.nextInt(0, 50));
        }

        System.out.println("Before sort: " + array);

        array.sort();

        System.out.println("After sort:  " + array);
    }
}

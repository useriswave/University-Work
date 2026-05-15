package org.example.day3.ArrayStuff;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        int len = r.nextInt(10, 21);

        Integer[] arr1 = new Integer[len];
        Integer[] arr2 = new Integer[len];

        boolean arraysShouldBeEqual = r.nextBoolean();

        for(int i = 0; i < len; i++) {
            arr1[i] = r.nextInt(0, 50);
        }

        if(!arraysShouldBeEqual) {
            for(int i = 0; i < len; i++) {
                arr2[i] = r.nextInt(0, 50);
            }
        }
        else {
            arr2 = arr1;
        }

        boolean result = ArrayUtils.compareLists(arr1, arr2);
        System.out.println("Should be equal? " + arraysShouldBeEqual);
        System.out.println("Are they equal? " + result);

        System.out.println("arr1: " + Arrays.toString(arr1));
        System.out.println("arr2: " + Arrays.toString(arr2));
    }
}

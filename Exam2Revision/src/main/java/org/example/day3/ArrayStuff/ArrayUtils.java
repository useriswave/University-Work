package org.example.day3.ArrayStuff;

import java.util.Random;

public class ArrayUtils<T> {
    private static Random r = new Random();
    public static <T> boolean compareLists(T[] arr1, T[] arr2) {
        if(arr1.length != arr2.length) {
            throw new RuntimeException("Array lengths cannot be different from each other");
        }

        for(int i = 0; i < arr1.length; i++) {
            if(arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }
}

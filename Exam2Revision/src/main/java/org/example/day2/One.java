package org.example.day2;

import java.util.Arrays;

public class One {
    public static void main(String[] args) {
        int[][] arr = {
                {32, 64, 213},
                {0, 5},
                {9},
                {94, 59, 289, 8249, 5839}
        };

        System.out.println("Before:");
        System.out.println(Arrays.deepToString(arr));
        int[][] swapped = swapOuter(arr);
        System.out.println("After:");
        System.out.println(Arrays.deepToString(swapped));
    }

    public static int[][] swapOuter(int[][] arr) {
        int[][] swapped = new int[arr.length][];
        for (int i = 0; i < arr.length; i++) {
            swapped[i] = new int[arr[i].length];
        }
        for(int i = 0; i < arr.length; i++) {
            int left = i;
            int right = arr.length - i - 1;

            while(left < right) {
                swapped[right] = arr[left];
                swapped[left] = arr[right];

                left++;
                right--;
            }
        }
        return swapped;
    }
}

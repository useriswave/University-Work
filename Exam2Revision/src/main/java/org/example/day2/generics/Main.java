package org.example.day2.generics;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        int arrSize = r.nextInt(5, 20);

        int[] arr = new int[arrSize];

        for(int i = 0; i < arrSize; i++) {
            arr[i] = r.nextInt(0, 100);
        }

        System.out.println("Before:");
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println("After:");
        System.out.println(Arrays.toString(arr));
        System.out.println("After Reverse:");
        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void sort(int[] arr) {
        for(int i =0; i < arr.length -1 ; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void reverse(int[] arr) {
            int left = 0;
            int right = arr.length - 1;

            while(left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
    }
}

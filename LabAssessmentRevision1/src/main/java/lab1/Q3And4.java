package lab1;

import java.util.Arrays;

public class Q3And4 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {1, 2, 3};

        System.out.println(Arrays.toString(addArrays(arr1, arr2)));
    }

    public static int[] addArrays(int[] arr1, int[] arr2) {
        int[] extendedList;
        int[] list2;
        if(arr1.length > arr2.length) {
           extendedList = new int[arr1.length];
           list2 = arr1;
            for(int i = 0; i < extendedList.length; i++) {
                if(i >= (arr2.length)) {
                    extendedList[i] = 0;
                }
                else {
                    extendedList[i] = arr2[i];
                }
            }
        }
        else if(arr2.length > arr1.length) {
            extendedList = new int[arr2.length];
            list2 = arr2;
            for(int i = 0; i < extendedList.length; i++) {
                if(i >= (arr1.length)) {
                    extendedList[i] = 0;
                }
                else {
                    extendedList[i] = arr1[i];
                }
            }
        }
        else {
            extendedList = arr1;
            list2 = arr2;
        }

        return addArraysEqualSize(extendedList, list2);
    }

    public static int[] addArraysEqualSize(int[] arr1, int[] arr2) {
        if(arr1.length != arr2.length) {
            return null;
        }
        int[] addedArrays = new int[arr1.length];

        for(int i = 0; i < addedArrays.length; i++) {
            addedArrays[i] += (arr1[i]+arr2[i]);
        }
        return addedArrays;
    }
}

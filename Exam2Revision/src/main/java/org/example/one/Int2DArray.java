package org.example.one;
// exam 2 AND finals AND lab 11
import java.util.Arrays;

public class Int2DArray {
    public static void main(String[] args) {
        int[][] arr = {{3, 5, 1, 53, 23, 35, 24, 31, 3}, {53, 6, 21}, {8, 5, 0}};
        reverseElements(arr);
        System.out.println(Arrays.deepToString(arr));
    }

    public static int getSum(int[][] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }

    public static void swapAllElements(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < arr.length; k++) {
                for(int j = 0; j < arr.length-1; j++) {
                    if(arr[k][j] > arr[k][j+1]) {
                        int temp = arr[k][j];
                        arr[k][j] = arr[k][j+1];
                        arr[k][j+1] = temp;
                    }
                }
            }
        }
    }

    public static void reverseElements(int[][] arr) {
        for(int i = 0; i < arr.length; i++) {
            // index variables
            int left = 0;
            int right = arr[i].length - 1;

            while(left < right) {
                int temp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] = temp;

                right--;
                left++;
            }
        }
    }

}
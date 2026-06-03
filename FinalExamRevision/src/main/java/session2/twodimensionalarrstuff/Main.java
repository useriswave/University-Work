package session2.twodimensionalarrstuff;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args)
    {
        Random r = new Random();
        int start = 5, end = 11;
        int size = r.nextInt(start, end);
        int[][] arr = new int[size][];

        for (int i = 0; i < size; i++) {
            arr[i] = new int[r.nextInt(start, end)];
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = r.nextInt(21);
            }
        }

        System.out.println(Arrays.deepToString(arr));
        System.out.println(returnGreatestInList(arr));
    }

    public static int returnGreatestInList(int[][] arr)
    {
        int totalLargest = 0;

        for (int i = 0; i < arr.length; i++) {
            int largest = arr[i][0];

            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > largest)
                    largest = arr[i][j];
            }

            if (largest > totalLargest)
                totalLargest = largest;
        }

        return totalLargest;
    }

    public static void sortArraysAscending(int[][] arr)
    {

    }
}


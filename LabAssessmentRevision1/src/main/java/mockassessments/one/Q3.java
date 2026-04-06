package mockassessments.one;

// the question assumes that both arrays are of equal size

import java.util.Arrays;

public class Q3 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7,8};
        System.out.println(Arrays.toString(multiplyArray(arr1, arr2)));
    }

    public static int[] multiplyArray(int[] arr1, int[] arr2) {
        int[] product = new int[(arr1.length+arr2.length) / 2];
        for(int i = 0; i < product.length; i++) {
            product[i] = arr1[i]*arr2[i];
        }
        return product;
    }
}

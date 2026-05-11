package org.example;

import java.util.Arrays;

public class String2DArray {
    public static void main(String[] args) {
        String[][] words = {{"racecar", "kayak", "jerry"}, {"Improvement", "Black", "Google", "Apple"}, {"rows", "mom"}};
        boolean[][] results = isPalindrome(words);
        System.out.println("WORDS:");
        System.out.println(Arrays.deepToString(words));
        System.out.println("RESULTS:");
        System.out.println(Arrays.deepToString(results));
    }

    public static boolean[][] isPalindrome(String[][] words) {
        boolean[][] result = new boolean[words.length][];
        for(int i = 0; i < words.length; i++) {
            result[i] = new boolean[words[i].length];
        }

        for(int i = 0; i < words.length; i++) {     // rows
            for (int j = 0; j < words[i].length; j++) {    // columns
                String rev = "";
                for(int k = 0; k < words[i][j].length(); k++) {     // characters
                    rev += words[i][j].charAt(words[i][j].length() - 1 - k);
                }
                result[i][j] = rev.equalsIgnoreCase(words[i][j]);
            }
        }
        return result;
    }
}

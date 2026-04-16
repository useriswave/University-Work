package com.me.palindrome.utils;

public class StringUtils {
    private StringUtils() {}

    public static String removeSpaces(String word) {
        return word.trim().replaceAll(" ", "");
    }

    public static boolean isValid(String word) {
        for(int i = 0; i < word.length(); i++) {
            if(!Character.isLetter(word.charAt(i)))
                return false;
        }
        return true;
    }
}

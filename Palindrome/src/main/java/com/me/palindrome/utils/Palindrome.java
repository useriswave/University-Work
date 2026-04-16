package com.me.palindrome.utils;

public class Palindrome {

    private Palindrome() {}

    public static boolean isPalindrome(String word) {
        var sb = new StringBuilder();

        for(int i = 0; i < word.length(); i++) {
            sb.append(word.charAt(word.length() - i - 1));
        }

        return sb.toString().equalsIgnoreCase(word);
    }
}

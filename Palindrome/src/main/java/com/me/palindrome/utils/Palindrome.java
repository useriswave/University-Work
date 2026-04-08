package com.me.palindrome.utils;

public class Palindrome {

    private Palindrome() {}

    public static boolean isPalindrome(String word) {
        String reversed = "";
       for(int i = word.length() - 1; i >= 0; i--)  {
           reversed += word.charAt(i);
       }

       return reversed.equalsIgnoreCase(word);
    }
}

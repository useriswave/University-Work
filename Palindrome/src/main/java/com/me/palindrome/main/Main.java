package com.me.palindrome.main;

import com.me.palindrome.prompt.Prompt;
import com.me.palindrome.utils.Palindrome;
import com.me.palindrome.utils.StringUtils;

public class Main {
    public static void main(String[] args) {
        while(true) {
            String word = Prompt.ask("Enter a word: ");
            word = StringUtils.removeSpaces(word);

            if(!StringUtils.isValid(word)) {
                System.out.printf("Invalid entry for \"%s\".\n", word);
            }
            else {
                String result = Palindrome.isPalindrome(word) ? "is a palindrome" : "is not a palindrome";
                System.out.printf("\"%s\" %s!", word, result);
                break;
            }
        }
    }
}
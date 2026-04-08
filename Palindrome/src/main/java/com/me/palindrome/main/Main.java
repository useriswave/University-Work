package com.me.palindrome.main;

import com.me.palindrome.utils.Palindrome;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = "";
        boolean isValid = false;

        while(!isValid) {
            System.out.print("Enter a word: ");
            word = sc.nextLine();

            if(!validateWord(word)) {
                System.out.println("Invalid entry. Please enter a valid word!");
                continue;
            }
            isValid = true;
        }
        word = cleanWord(word);
        if(Palindrome.isPalindrome(cleanWord(word))) {
            System.out.printf("The word \"%s\" is a palindrome!\n", word);
        }
        else {
            System.out.printf("The word \"%s\" is NOT a palindrome!\n", word);
        }
    }

    public static boolean validateWord(String word) {
        for(int i = 0; i < word.length(); i++) {
            if(!Character.isLetter(word.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static String cleanWord(String word) {
        return word.trim().replaceAll(" ", "");
    }
}

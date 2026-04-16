package com.me.palindrome.prompt;

import java.util.Scanner;

public class Prompt {
    private static final Scanner SCANNER = new Scanner(System.in);
    private Prompt() {}

    public static String ask(String question) {
        System.out.print(question);
        return SCANNER.nextLine();
    }

    public static void close() {
        SCANNER.close();
    }
}

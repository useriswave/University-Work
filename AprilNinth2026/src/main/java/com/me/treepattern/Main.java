package com.me.treepattern;

public class Main {
    public static void main(String[] args) {
        int height = 10;
        int trunkHeight = 3;
        treePattern(height, trunkHeight);
    }

    private static void treePattern(int height, int trunkHeight) {
        for(int i = 0; i < height; i++) {
            for(int j = i; j < height; j++) {
                System.out.print(' ');
            }
            for(int j = 0; j < i; j++) {
                System.out.print('\\');
            }
            for(int j = 0; j <= i; j++) {
                if(j == 0)
                    System.out.print('|');
                else
                    System.out.print('/');
            }
            System.out.println();
        }
        trunk(height*2, trunkHeight);
    }

    private static void trunk(int totalWidth, int trunkHeight) {
        for(int i = 0; i < trunkHeight; i++) {
            for(int j = 0; j < totalWidth+2;j++) {
                if(i == trunkHeight-1 && (j == (totalWidth / 2) - 2|| j == (totalWidth / 2) + 2)) {
                    System.out.print('_');
                }
                else if(j >= (totalWidth / 2) - 1 && j <= (totalWidth / 2) + 1) {
                    System.out.print("|");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
package lab1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int d = sc.nextInt();

        eye(d);
    }

    public static void eye(int d) {
        for(int i = 0; i < d; i++) {
            for(int j = 0; j < d; j++) {
                if(i == j) {
                    System.out.print(1 + " ");
                }
                else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }
}

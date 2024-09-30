package com.sstech.workshop.dsa.training.pattern;

import java.util.Scanner;

/*

123
123
123

 */
public class P03SquareNumberPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}

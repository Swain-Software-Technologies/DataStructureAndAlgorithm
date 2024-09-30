package com.sstech.workshop.dsa.training.pattern;

import java.util.Scanner;

/*
    1
   22
  333
 4444
 */
public class P07Pattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int row = 1; row <= n; row++) {
            for (int wspace = 1; wspace <= n - row; wspace++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print(row);
            }
            System.out.println();
        }
    }
}

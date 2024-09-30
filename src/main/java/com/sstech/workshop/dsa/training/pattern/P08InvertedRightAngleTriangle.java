package com.sstech.workshop.dsa.training.pattern;

import java.util.Scanner;

/*
 * * * *
 * * *
 * *
 *
 */
public class P08InvertedRightAngleTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int row = n; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

package com.sstech.workshop.dsa.training.pattern;

/*

111
222
333

* */

import java.util.Scanner;

public class P02SquareNumPattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print(row);
            }
            System.out.println();
        }

    }
}

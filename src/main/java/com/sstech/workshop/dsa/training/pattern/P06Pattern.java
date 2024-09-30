package com.sstech.workshop.dsa.training.pattern;

import java.util.Scanner;

/* n=3
    1
   12
  123
 */
public class P06Pattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int row = 1; row <= n; row++) {
            for (int wspace = 1; wspace <= n - row; wspace++) {
                System.out.print(" ");
            }
            for (int col=1; col<=row;col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}

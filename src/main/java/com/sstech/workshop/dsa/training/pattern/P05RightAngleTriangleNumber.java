package com.sstech.workshop.dsa.training.pattern;

import java.util.Scanner;

/*
1
12
123
1234
 */
public class P05RightAngleTriangleNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}

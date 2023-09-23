/*
 * @CopyRight to SSLab Pvt. Ltd. 2020. You should not disclose the information outside .
 * Otherwise Terms & Condition will be apply .
 */
package com.sstech.workshop.dsa.iitkanpur;

import java.util.Scanner;

/**
 * 
 * @author STRINATH Sep 23, 2023
 *
 * @Description: 
 */
public class SecondLargest {

	public static int findSecondLargest(int arraySize, int numArrys[]) {
		int i, j, temp;
        if (arraySize < 2) {
            return -1;
        }
        for (i = 0; i < arraySize; i++) {
            for (j = i + 1; j < arraySize; j++) {
                if (numArrys[j] < numArrys[i]) {
                    temp = numArrys[i];
                    numArrys[i] = numArrys[j];
                    numArrys[j] = temp;
                }
            }
        }
        for (i = arraySize - 2; i >= 0; i--) {
            if (numArrys[i] != numArrys[arraySize - 1]) {
                return numArrys[i];
            }
        }
        return -1;
	}
	
	public static void main(String[] args) {
		System.out.println("Enter Size of an Array");
		Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        System.out.println("Enter arrays element");
        int[] numArrys = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
        	numArrys[i] = scanner.nextInt();
        }
        System.out.println(findSecondLargest(arraySize, numArrys));
	}
}

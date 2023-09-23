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
public class SumOfMinMaxElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Enter the size of array");
		Scanner sc = new Scanner(System.in);
		int arrSize = sc.nextInt();
		int numArray[] = new int[arrSize];
		System.out.println("Enter the array element");
		for (int i = 0; i < arrSize; i++) {
			numArray[i] = sc.nextInt();
		}
		System.out.println(calculateSumOfMinMaxElemet(numArray));
	}

	/**
	 * @param numArray
	 * @return
	 */
	private static int calculateSumOfMinMaxElemet(int[] numArray) {
		
		int maxElement = numArray[0], minElement = numArray[0];
		int arryLength = numArray.length;
		
		for (int i = 1; i < arryLength; i++) {
			if (numArray[i] > maxElement)
				maxElement = numArray[i];
			if (numArray[i] < minElement)
				minElement = numArray[i];
		}
		
		int sum = maxElement + minElement;
		return sum;
	}

}

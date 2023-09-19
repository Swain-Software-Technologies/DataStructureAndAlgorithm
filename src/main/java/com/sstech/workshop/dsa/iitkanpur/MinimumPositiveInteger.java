/*
 * @CopyRight to SSLab Pvt. Ltd. 2020. You should not disclose the information outside .
 * Otherwise Terms & Condition will be apply .
 */
package com.sstech.workshop.dsa.iitkanpur;

/**
 * 
 * @author STRINATH Sep 19, 2023
 *
 * @Description: For a given number N (0 < N <= 100), little Johnny wants to
 *               find out the minimum positive integer X divisible by N, where
 *               the sum of digits of X is equal to N, and X is not equal to N.
 *               Note: If such a number X does not exist, then output should be
 *               -1. Input Specification: input1: An integer N Output
 *               Specification: Return the minimum positive integer X
 */
public class MinimumPositiveInteger {

	public static int calculateSumOfDigits(int number) {
		int sumOfDigits = 0;
		/*while(number > 0) {
			sumOfDigits = sumOfDigits + number % 10; // Finding out the remainder
			number = number / 10; 
		}*/
		String numberString = String.valueOf(number);
		for(int i = 0; i < numberString.length(); i++) {
			sumOfDigits = sumOfDigits + Integer.parseInt(String.valueOf(numberString.charAt(i)));
		}
		return sumOfDigits;
	}
	
	public static int calculateDivisor(int number) {
        for (int i = number + 1; i < number * 1000000; i++) {
            if (i % number == 0 && calculateSumOfDigits(i) == number) {
                return i;
            }
        }
        return -1;
    }
}

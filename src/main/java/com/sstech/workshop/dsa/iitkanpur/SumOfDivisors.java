/*
 * @CopyRight to SSLab Pvt. Ltd. 2020. You should not disclose the information outside .
 * Otherwise Terms & Condition will be apply .
 */
package com.sstech.workshop.dsa.iitkanpur;

/**
 * 
 * @author STRINATH Sep 23, 2023
 *
 * @Description: 
 */
public class SumOfDivisors {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num=6;
		System.out.println(calculateSumOfDivisors(num));
	}

	/**
	 * @param num
	 * @return
	 */
	private static int calculateSumOfDivisors(int num) {

		 int sumOfDivisors = 0;
		 
	        for (int i = 1; i * i <= num; i++) {
	            if (num % i == 0) {
	                sumOfDivisors = sumOfDivisors + i;
	                if (num / i != i) {
	                    sumOfDivisors += num / i;
	                }
	            }
	        }
	        return sumOfDivisors;
	}

}

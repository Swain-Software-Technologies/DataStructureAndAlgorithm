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
public class MaxOccuringCharacter {

	/**
	 * @param str
	 * @return
	 */
	private static char getMaxOccuringChars(String str) {
		
		// Create array to keep the count of individual
        int count[] = new int[256];
 
        // Construct character count array from the input string
        int len = str.length();
        
        for (int i = 0; i < len; i++)
            count[str.charAt(i)]++;
 
        int max = -1;
        char maxChar = ' ';
 
        // Traversing through the string and maintaining
        // the count of each character
        for (int i = 0; i < len; i++) {
            if (max < count[str.charAt(i)]) {
                max = count[str.charAt(i)];
                maxChar = str.charAt(i);
            }
        }
 
        return maxChar;
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String str = "Satyajit Dash";
		System.out.println(getMaxOccuringChars(str));
	}

}

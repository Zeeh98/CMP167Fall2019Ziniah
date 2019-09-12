/*
 * Author: Ziniah Haynes 
 */

package Week3;

import java.util.Scanner;

public class AddThree {
	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		// Introduce the problem
		System.out.println("Welcome this program generates the sum of three numbers");
		
		// Ask the user for the inputs
		System.out.println("Enter 3 numbers");
		
		// Wait for the user's inputs and store
		int num1 = scnr.nextInt();
		int num2 = scnr.nextInt();
		int num3 = scnr.nextInt();
		
		// Calculate
		int result = num1 + num2 + num3;
		
		// Display result
		System.out.print("Result is " + result)
		;
		
	}

}

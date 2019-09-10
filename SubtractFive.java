/**
 * Author: Ziniah Haynes
 */
package Week3;

import java.util.Scanner;

public class SubtractFive {
	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		//Introduce the program
		System.out.println("Welcome this program generates the difference between five numbers.");
		
		//Ask the user for their outputs
		System.out.println("Enter 5 numbers");
		
		//Wait for the users output.
		int num1 = scnr.nextInt();
		int num2 = scnr.nextInt();
		int num3 = scnr.nextInt();
		int num4 = scnr.nextInt();
		int num5 = scnr.nextInt();
		
		//Calculate
		int result = num5 - num4 - num3 - num2 -num1;
		
		//Display result
		System.out.println("Result is " +  result);
		
		
	}

}

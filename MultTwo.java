/** 
 * Author: Ziniah Haynes
 * 
 */


package Week3;

import java.util.Scanner;
public class MultTwo {
	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
			// Introduce the program.
		    System.out.println("Welcome this program\ngenerates products of two numbers");
		    
		    // Ask the user for the inputs
		    System.out.println("Enter 2 numbers");
		    
		    // Wait for the user's inputs and store
		    int num1 = scnr.nextInt();
		    int num2 = scnr.nextInt();
		    
		    // Calculate 
		    int result = num1 * num2;
		    
		    // Display result
		    System.out.print("Result is " + result);
		
	}

}

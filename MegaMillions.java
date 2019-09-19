import java.util.Scanner;
package Week2;

/**
 * 
 * Author: Ziniah Haynes
 * Description:
 * Date: September 3,2019
 * 
 */

//- import the Scanner.
import java.util.Random;
public class MegaMillions {
	
	public static void main(String [] args) {
		Random randGen = new Random();
		Scanner scnr = new Scanner(System.in);
		
		//Declare variable to hold the amount of dollars.
		int dollar;

		//Declare variable for the cost of ticket.
		int ticketCost;
		
		//Prompt the user for the amount of dollars to bet on.
		System.out.println("Enter the amount of dollars to bet on: ");

		//Store the amount into amount of dollar variables.
		dollar = scnr.nextInt();
		
		//Prompt the user to enter six numbers 
		System.out.println("Enter six numbers");
		
		//Create a variable for each value.
		int num1;
		int num2;
		int num3;
		int num4;
		int num5;
		int num6;
		//Randomly generate six numbers and compare them.
		System.out.println(randGen.nextInt(60)+1);
		
		
		
	}
	
	

}

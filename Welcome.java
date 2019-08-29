package CLASSWORK;
import java.util.Scanner;

public class Welcome {
	
	public static void main (String[] args) {
		
		// CREATE A WELCOME MESSAGE AND STORE IN VARIABLE. //
		// THEN OUTPUT THE WELCOME MESSAGE. // 
		 
		String welcome = "Welcome to Java World";
		System.out.println(welcome);
		
		//GETTING INPUT FROM THE USER.//
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your name? I am a program");
		
		
		String name= input.nextLine();
		System.out.print("Nice to meet you, "+name+"");
		
	}

}

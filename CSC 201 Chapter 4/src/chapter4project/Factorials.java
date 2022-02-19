// Mohammad Khan
// Due Date 6/30/2021
// Chapter 4 P.17
// Write a program that asks the user for an integer and then prints out all its factors.
package chapter4project;

import java.util.Scanner;

public class Factorials {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); // Create Scanner object.
		
		System.out.println("Enter an integer value: ");
		
		int anIntegervalue = scan.nextInt(); // Scan Integer from user.
		
		int startingFactor = 2; // Declare a variable for starting factor.
		
		// If the integer value provided is greater than 1, then print out the integer's factors.
		if (anIntegervalue > 1) 
		{
			// Continues to factor the integer's until it does equal to 1.
			while (anIntegervalue != 1) 
			{
				// As long as the remainder of the user's input is equal to 0, its list of starting factors are printed out. 
				if (anIntegervalue % startingFactor == 0) 
				{
				System.out.print(startingFactor + "\n   ");
				
				anIntegervalue /= startingFactor;
			    }
				// Increment starting factor by 1.
				else 
				{
					startingFactor = startingFactor + 1;
				}
		    }     
        }
		
		// The integer value that the user has chosen is invalid because the number is not greater than 1.
		else  
		{
			System.out.println("This number cannot be used for this calculations.");
        }
	}
}

// Mohammad Khan
// Due Date 7/21/2021
// Project P.13 Chapter 7
// Write a program that asks the user to input a set of floating-point values. After 2 chances the program will quit.
package chapter7;

import java.util.Scanner;
import java.util.InputMismatchException;

public class SumofFloatingPoint {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // Create Scanner object.
		
		double userInputs = 0.0; // Declare variable for user input.
		
		double theSum = 0.0; // Declare variable for the sum.
		
		int attempt = 1; //  Declare variable for the starting attempt.
		
		int correctattempt = 1; // Declare variable for correct attempt.
		
		
		// Loop will read the user's input and will end if the user has entered a value that isn't a number after 2 attempts.
		while (attempt <= 2) 
		{
			System.out.print("Enter a floating point value: ");
			try 
			{
				userInputs = scan.nextDouble();
				theSum += userInputs;
				correctattempt++;
				 if (correctattempt >= 3)
					break;
			}
			catch(InputMismatchException exception) 
			{
				System.out.println("User has enter an input that wasn't a number.");
				attempt++;
				scan = new Scanner(System.in);
				continue;
			}
		}
		System.out.println(theSum);	
	}
}

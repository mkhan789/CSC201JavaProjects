// Mohammad Khan
// Due Date 7/7/2021
// Chapter 5 P.14
// Write a method that returns the English name for a point in time.
package chapter5project;

import java.util.Scanner; 

public class TheTime {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // Create Scanner object.
		
		System.out.println("Pick an hour from 1 to 12: ");
		
		int hours = scan.nextInt(); // Scan integer for user.
		
		System.out.println("Pick a minute from 0 to 59: ");
		
		int minutes = scan.nextInt(); // Scan integer for user.
		
		System.out.println(getTimeName(hours, minutes)); // Print out the getTimeName method.
	}
	/**
	 Computes the time to the English name.
	 @param hours a positive integer that is >= 1 && <= 12.
	 @param minutes a positive integer that is >= 0 && <= 59.
	 @return the name of time.
	 */
	public static String getTimeName(int hours, int minutes) {
	
		String theTime = ""; // Declare variable for the time.
		
		// If the user has provided hours that're between 1 and 12 and the minutes that're between 0 and 59, then it will display the English time name.
		if ((hours >= 1 && hours <= 12) && (minutes >= 0 && minutes <= 59))
		{
			// Converts hours and minutes to string.
			String hourAndminute [] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", 
									  "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty",
									  "twenty-one", "twenty-two", "twenty-three", "twenty-four", "twenty-five", "twenty-six", "twenty-seven",
									  "twenty-eight", "twenty-nine", "thirty", "thirty-one", "thirty-two", "thirty-three", "thirty-four", "thirty-five", "thirty-six",
									  "thirty-seven", "thirty-eight", "thirty-nine", "forty", "forty-one", "forty-two", "forty-three", "forty-four", "forty-five", "forty-six",
									  "forty-seven", "forty-eight", "forty-nine", "fifty", "fifty-one", "fifty-two", "fifty-three", "fifty-four", "fifty-five", "fifty-six",
									  "fifty-seven", "fifty-eight", "fifty-nine"};
			
			if (minutes >= 1 && minutes <= 9)
				theTime = "It is " + hourAndminute [hours] + " o' " + hourAndminute [minutes] + ".";
			else if (minutes == 0)
				theTime = "It is " + hourAndminute [hours] + " o' clock.";
			else if (minutes == 30)
				theTime =  "It is half past " + hourAndminute[hours] + ".";
			else if (minutes == 10)
				theTime = "It is ten minutes past " + hourAndminute[hours] + ".";
			else if (minutes == 45)
				theTime = "It is a quarter to " + hourAndminute[hours % 12 + 1] + ".";
			else if (minutes == 15)
				theTime = "It is a quarter after " + hourAndminute[hours] + ".";
			else
				theTime = "It is " + hourAndminute [hours] + " " + hourAndminute [minutes] + ".";
	    }
		
		// The hours and/or minutes that the user has provided is invalid.
		else
			System.out.println("The hour and/or minute the user picked is invalid.");
		
		return theTime; 
	}
}
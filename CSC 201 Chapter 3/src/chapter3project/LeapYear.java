// Mohammad Khan
// Due Date 6/23/2021
// Project P3.28
// Write a program that asks the user for a year and computes whether that year is a leap year.
/* A year with 366 days is called a leap year. Leap years are necessary to keep the calendar synchronized
 * with the sun because the earth revolves around the sun once every 365.25 days. Actually, that figure is
 * not entirely precise, and for all dates after 1582 the Gregorian correction applies. Usually years that are
 * divisible by 4 are leap years. However, years that are divisible by 100 are not leap years, but years that are divisible by 400 are leap years.
 */
package chapter3project;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); // Create Scanner a object.
		
		System.out.println("Choose a year that is after 1582."); 

		int aYear = scan.nextInt(); // Scan integer from the user.
		
		System.out.println(aYear); // Print out users input.
			
		// If the year chosen is less than 1583 the user is told it's invalid.
		if (aYear < 1583) 
		{                  			
			System.out.println("You cannot use a year that is less than 1583!!");
			
		}
	    // The year that user has provided is a leap year.
		else if (aYear % 4 == 0 && aYear % 400 == 0)
		{ 
			System.out.println("It is a leap year."); 
		}
		// The year that the user has provided is not a leap year.
		else 
		{
			System.out.println("It is not a leap year."); 
		}
	}
}

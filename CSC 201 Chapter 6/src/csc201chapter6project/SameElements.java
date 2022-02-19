// Mohammad Khan
// Due Date 7/14/2021
// Chapter 6 Project 6.11
// Write a method that checks whether two arrays have the same elements.
package csc201chapter6project;

import java.util.Arrays;

public class SameElements {

	public static void main(String[] args) {
		 int[] a = { 1, 4, 9, 16, 9, 7, 4, 9, 11}; // Declare variable for array a.
	     int[] b = { 11, 1, 4, 9, 16, 9, 7, 4, 9}; // Declare variable for array b.
	 
	     	// When the sameElements method returns true, it will print out that the arrays have the same elements.
	        if (sameElements(a, b))
	         System.out.println("The arrays have the same elements in some order, with the same multiplicities.");
	        // When the sameElements method returns false, it will print out that the arrays don't have the same elements.
	        else
	            System.out.println("The arrays don't have the same elements in some order, with the same multiplicities.");
	}
	
	/**
	Computes whether arrays a and b have the same elements or not.
	@param a integers with specified lengths and indexes.
	@param b integers with specified lengths and indexes.
	@return true
	*/
	public static boolean sameElements(int[] a, int[] b)
    {
	   // If the lengths for arrays a and b don't equal, then return false.
       if (a.length != b.length)
            return false;
 
        // Sort arrays a and b.
        Arrays.sort(a);
        Arrays.sort(b);
 
       // Compares arrays a and b to see if there is a difference for it to return false.
       for (int i = 0; i < a.length; i++)
            if (a[i] != b[i])
                return false;
 
       // If arrays a and b have the same elements, then return true.
       return true;
    }	
}

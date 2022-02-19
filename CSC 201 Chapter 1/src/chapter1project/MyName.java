// Mohammad Khan
// Due Date June 06, 2021
// Project 1.6
//  print my name in large letters

package chapter1project;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyName {

	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        double inputNumber, sum = 0.0;
	        int correctCount = 0, wrongCount = 0;

	        while(wrongCount <=1) {
	            System.out.println("Please enter a numeric floating value:");
	            try {
	                inputNumber = in.nextDouble();
	                correctCount++;
	                sum += inputNumber;
	                if(correctCount >= 2)
	                    break;
	            } catch(InputMismatchException e) {
	                wrongCount++;
	                in = new Scanner(System.in);
	                continue;
	            }
	        }
	        System.out.println(sum);
	    }
	}

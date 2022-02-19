// Mohammad Khan
// Project 9.2
// Due Date
// Add a class FillInQuestion to the question hierarchy of Section 9.1. Such a question is " The inventor of Java was _James Gosling_.

package csc201chapter9project;

import java.util.ArrayList;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Question {
	private String text;
	private String answer;
	
	// Create empty question and answer.
	public Question() 
	{
		text = "";
		answer = "";
	}
	
	/**
	 Set question text.
	 @param questionText text for the question.
	 */
	public void setText(String questionText) 
	{
		text = questionText;
	}

	/**
	 Set answer for question.
	 @param correctResponse the answer for the question.
	 */
	public void setAnswer(String correctResponse)
	{
		answer = correctResponse;
	}

	/**
	 Checks if response is correct.
	 @param response checking the response.
	 @return true for correct response and false for anything else.
	 */
	public boolean checkAnswer(String response) 
	{
		return response.equals(answer);
	}

	/**
	 Allows the user to see the question.
	 */
	public void display() 
	{
		System.out.println(text);
	}
	
	public static void main(String[] args) 
	{
		// This program will allow the user to see the answer ,which is surrounded by underscores, to the given question 
		String theQuestion = "The person who had invented Java is none other than _James Gosling_";
		Pattern pat = Pattern.compile("_(.*)_");
		Matcher mat = pat.matcher(theQuestion);
		
		if (mat.find()) 
		{
			System.out.println(theQuestion);
            String answer = mat.group(1);
            System.out.println(mat.group(1) + " is the answer.");
            theQuestion = theQuestion.replace(answer, "_______");
            System.out.println(theQuestion);
		}
	}
	}



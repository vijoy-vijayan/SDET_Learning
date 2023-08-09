package foundation.week5;

import org.junit.Test;

import java.util.Arrays;

import org.junit.Assert;




public class CW_MentorConnect_reverseString {

	/* 
Problem statement: 	

Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.

Example 1:

Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]


	Input 			----->  String[]	
	Output 			----->  String[]	


	Data Set:
		 Positive: 	---> Input: ["v","i","j","o","y"]		Output = ["y","o","j","i","v"]
		 Negative: 	---> Input: ["2","6","6","3"]			Output = ["3","6","6","2"]
		 Edge: 		---> Input: ["S","s"]					Output = ["s","S"]

	Pseudo Code:
	1. Get the String array and create a new output array with the same length of input
	2. Loop through the input array and copy all the characters from reverse to output array
	3. Return the output array

	 */

	@Test	
	public void positiveTest()
	{
		Assert.assertArrayEquals(new char[] {'y','o','j','i','v'}, reverseString(new char[] {'v','i','j','o','y'}));
		
	}
	
	@Test	
	public void negativeTest()
	{
		Assert.assertArrayEquals(new char[] {'2','6','6','3'}, reverseString(new char[] {'3','6','6','2'}));
	}
	
	@Test	
	public void edgeTest()
	{
		Assert.assertArrayEquals(new char[] {'S','s'}, reverseString(new char[] {'s','S'}));
	}

	public char[] reverseString(char[] s)
	{
		
		char[] outputArr=new char[s.length];
		
		int ctr=0;
		
		for (int i = s.length-1; i >= 0; i--,ctr++) {
			
			outputArr[ctr]=s[i];
		}
		
		return outputArr;
		
		//Getting Error in Leet code while executing
	}

}

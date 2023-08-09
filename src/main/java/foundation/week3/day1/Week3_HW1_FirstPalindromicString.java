package foundation.week3.day1;

import org.junit.Assert;
import org.junit.Test;

/* 
Link: https://leetcode.com/problems/find-first-palindromic-string-in-the-array/description/

Problem statement: 
Given an array of strings words, return the first palindromic string in the array. If there is no such string, return an empty string "".

A string is palindromic if it reads the same forward and backward.
 
 
Input 			----->  	String[]
Output 			----->  	String
 
 
Data Set:
	 Positive: 	Input: ["abc","car","ada","racecar","cool"]			---> 		Output = "ada"
	 Psitive: 	Input: ["notapalindrome","racecar"]					---> 		Output = "racecar"
	 Negative: 	Input: ["def","ghi"]								---> 		Output = ""
	 Edge: 		Input: ["madam","mam"]								---> 		Output = "madam"
 
Pseudo Code:
	 1. Get the input String array and iterate through it
	 2. Check for Palindrome for all the index
	 3. Return the string if its plaindrome
	 4 . Iterate through the end and return "" at the end 
 */

public class Week3_HW1_FirstPalindromicString {
	
	@Test
	public void positiveTest()
	{
		Assert.assertEquals("ada",getPalindromicString(new String[] {"abc","car","ada","racecar","cool"}));
		Assert.assertEquals("racecar",getPalindromicString(new String[] {"notapalindrome","racecar"}));		
	}
	
	@Test
	public void negativeTest()
	{
		Assert.assertEquals("",getPalindromicString(new String[] {"def","ghi"}));
	}
	
	@Test
	public void edgeTest()
	{
		Assert.assertEquals("madam",getPalindromicString(new String[] {"madam","mam"}));
	}
	
	public String getPalindromicString(String[] inputArr)
	{
		for(int i=0;i<inputArr.length;i++)
			if(isPalindrome(inputArr[i]))
				return inputArr[i];
		
		return "";
	}

	public boolean isPalindrome(String inputStr)
	{
		
		inputStr=inputStr.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
		
		if(inputStr.equals(""))
			return false;	
				
		
		for(int i=0;i<inputStr.length()/2;i++)
		{
			if(inputStr.charAt(i)!=(inputStr.charAt(inputStr.length()-1 -i)))
				return false;	
		}		

		return true;
	}

}

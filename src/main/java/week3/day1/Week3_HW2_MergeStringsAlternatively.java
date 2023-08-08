package week3.day1;

import org.junit.Assert;
import org.junit.Test;

/* 
Problem statement: 
You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.

Return the merged string.
 
 
Input 			----->  	String, String
Output 			----->  	String
 
 
Data Set:
	 Positive: 	Input: "abc" ,"pqr"			---> 		Output = "apbqcr"
	 Negative: 	Input: "ab", "pqrs"			---> 		Output = "apbqrs"
	 Edge: 		Input: "abcd", "pq"			---> 		Output = "apbqcd"
 
Pseudo Code:
	 1. Get the input String array and iterate through it
	 2. Check for Palindrome for all the index
	 3. Return the string if its plaindrome
	 4 . Iterate through the end and return "" at the end 
 */

public class Week3_HW2_MergeStringsAlternatively {
	
	@Test
	public void positiveTest()
	{
		Assert.assertEquals("apbqcr",getMergedString("abc" ,"pqr"));
				
	}
	
	@Test
	public void negativeTest()
	{
		Assert.assertEquals("apbqrs",getMergedString("ab", "pqrs"));
	}
	
	@Test
	public void edgeTest()
	{
		Assert.assertEquals("apbqcd",getMergedString("abcd", "pq"));
	}
	
	public String getMergedString(String inpStr1, String inpStr2)
	{
		int ctr=0;
		String TrailingVal="",MergedStr="";
			
		if(inpStr1.length()>inpStr2.length())
		{
			TrailingVal=inpStr1.substring(inpStr2.length());
			ctr=inpStr2.length();
		}
		else
		{
			TrailingVal=inpStr2.substring(inpStr1.length());
			ctr=inpStr1.length();
		}
		for(int i=0;i<ctr;i++)
		{
			MergedStr=MergedStr+inpStr1.charAt(i)+inpStr2.charAt(i);
		}
		
		return MergedStr.concat(TrailingVal);
	}

}

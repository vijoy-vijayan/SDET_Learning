package foundation.week3.day1;

import org.junit.Assert;
import org.junit.Test;

/* 
Problem statement: 
You are given a string s and an integer array indices of the same length. The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.

Return the shuffled string.
 
 
Input 			----->  	String, int[]
Output 			----->  	String
 
 
Data Set:
	 Positive: 	Input: "A man, a plan, a canal: Panama" 			---> 		Output = true
	 Negative: 	Input: 	"Testleaf"									---> 		Output = false
	 Edge: 		Input: 	"   "										---> 		Output = false



Pseudo Code:
	 1. Get the String and the integer array.. Duplicate the input String to TargetString
	 2. Alter the value of Target String in each iteration --> String can be altered with Substring option
	 3. Return finalString at the end 
	  
 */

public class Week3_CW2_ShufflingString {
	
	@Test
	public void positiveTest()
	{
		Assert.assertEquals("jivyo",getShuffledString_2("vijoy",new int[] {2,1,0,4,3}));
		Assert.assertEquals("leetcode",getShuffledString_2("codeleet",new int[] {4,5,6,7,0,2,1,3}));			
	}
	
	@Test
	public void negativeTest()
	{
		Assert.assertEquals("cBa",getShuffledString_2("aBc",new int[] {2,1,0}));
	}
	
	@Test
	public void edgeTest()
	{
		Assert.assertEquals("abc",getShuffledString_2("abc",new int[] {0,1,2}));

	}


	public String getShuffledString(String inputStr, int[] inputArr)
	{		
		String outputStr =inputStr.toLowerCase();
		
		for(int i=0;i<inputStr.length();i++)
			outputStr=outputStr.substring(0, inputArr[i])+inputStr.charAt(i)+outputStr.substring(inputArr[i]+1);
					
		return outputStr;
		
	}
	
	public String getShuffledString_2(String inputStr, int[] inputArr)
	{		
		char[] charArray = inputStr.toCharArray();
		
		for(int i=0;i<inputStr.length();i++)
			charArray[inputArr[i]]= inputStr.charAt(i);
					
		return String.valueOf(charArray);
		
	}

}

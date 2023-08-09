package foundation.week3.day1;

import org.junit.Assert;
import org.junit.Test;

/* 
Problem statement: 
You are given a string s of even length. Split this string into two halves of equal lengths, and let a be the first half and b be the second half.

Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'). Notice that s contains uppercase and lowercase letters.

Return true if a and b are alike. Otherwise, return false.
 
 
Input 			----->  	String
Output 			----->  	boolean
 
 
Data Set:
	 Positive: 	Input: "Leetcode" 			---> 		Output = true
	 Negative: 	Input: 	"VIJOYVijay"		---> 		Output = true
	 Negative: 	Input: 	"testleaf"			---> 		Output = false
	 Edge: 		Input: 	""					---> 		Output = false
 
Pseudo Code:
	 1. Get the input String and initialize counter for first half and second half
	 2. Iterate through its length/2 and compare character at i with the character at length-1-i ... First with last, second with Second last and so on
	 3. Return both counter comparison value at the end    
 
 */

public class Week3_CW3_StringHalvesAlike {
	
	@Test
	public void positiveTest()
	{
		Assert.assertEquals(true,isHalfStringVowelsAlike("Leetcode"));
		Assert.assertEquals(true,isHalfStringVowelsAlike("VIJOYVijay"));
		
	}
	
	@Test
	public void negativeTest()
	{
		Assert.assertEquals(false,isHalfStringVowelsAlike("testleaf"));
	}
	
	@Test
	public void edgeTest()
	{
		Assert.assertEquals(false,isHalfStringVowelsAlike(""));

	}


	public boolean isHalfStringVowelsAlike(String inputStr)
	{
		
		if(inputStr.equals(""))
			return false;
		
		inputStr=inputStr.toLowerCase();
		
		int ctrFirstHalf = 0,ctrSecondHalf=0;
		
		int indexFromLastChar;
		
		for(int i=0;i<inputStr.length()/2;i++)
		{
			System.out.println("i="+i);
			
			if(inputStr.charAt(i)=='a'  || inputStr.charAt(i)=='e' || inputStr.charAt(i)=='i' || inputStr.charAt(i)=='o' || inputStr.charAt(i)=='u')
			{
				ctrFirstHalf++;
			}
			
			indexFromLastChar=inputStr.length()-1-i;
			
			System.out.println("i="+indexFromLastChar);
			
			if(inputStr.charAt(indexFromLastChar)=='a'  || inputStr.charAt(indexFromLastChar)=='e' || inputStr.charAt(indexFromLastChar)=='i' || inputStr.charAt(indexFromLastChar)=='o' || inputStr.charAt(indexFromLastChar)=='u')
			{
				ctrSecondHalf++;
			}
			
		}
		
		System.out.println(ctrFirstHalf+" "+ctrSecondHalf);
		
		return ctrFirstHalf==ctrSecondHalf;
		
	}

}

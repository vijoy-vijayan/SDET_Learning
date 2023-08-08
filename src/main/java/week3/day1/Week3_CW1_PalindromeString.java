package week3.day1;

import org.junit.Assert;
import org.junit.Test;

/* 
Problem statement: 
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.
 
 
Input 			----->  	String
Output 			----->  	boolean
 
 
Data Set:
	 Positive: 	Input: "A man, a plan, a canal: Panama" 			---> 		Output = true
	 Negative: 	Input: 	"Testleaf"									---> 		Output = false
	 Edge: 		Input: 	"   "										---> 		Output = false
 
Pseudo Code:
	 1. Get the input array and Target value
	 2. Loop through the Nested loop for the Target and search for target value 
	 3. Return indices as array if match is found 
	 
	 * pcode:
     * 1. convert to lowercase
     * 2. regex 
     * 3. convert it a char array / User charAt index;
     * 4. lopp through all the indices and reverse the string
     * 5. compare both and return result.
     * 
     
 
 */

public class Week3_CW1_PalindromeString {
	
//	@Test
//	public void positiveTest()
//	{
//		Assert.assertEquals(true,checkPalindrome("A man, a plan, a canal: Panama"));
//		
//		
//	}
//	
//	@Test
//	public void negativeTest()
//	{
//		Assert.assertEquals(false,checkPalindrome("Testleaf"));
//	}
	
	@Test
	public void edgeTest()
	{
		Assert.assertEquals(false,checkPalindrome("   "));
//		Assert.assertEquals(true,checkPalindrome("A"));
	}


	public boolean checkPalindrome(String inputStr)
	{
		
		inputStr=inputStr.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println("STR:"+inputStr+"STR");
		
		if(inputStr.equals(""))
		{
			System.out.println("If condition");
			return false;	
		}
		
		
		for(int i=0;i<inputStr.length()/2;i++)
		{
			System.out.println("For Loop");
			if(inputStr.charAt(i)!=(inputStr.charAt(inputStr.length()-1 -i)))
			{
				return false;
			}
			
		}		

		return true;
	}

}

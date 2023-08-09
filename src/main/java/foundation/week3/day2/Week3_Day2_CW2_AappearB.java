package foundation.week3.day2;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

/* 
Link: https://leetcode.com/problems/check-if-all-as-appears-before-all-bs/description/

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
     */
     
 
 

public class Week3_Day2_CW2_AappearB {
	
//	@Test
//	public void positiveTest()
//	{
//		Assert.assertEquals(true,checkAbeforeB("aaabbb"));
//		
//		
//	}
//	
//	@Test
//	public void negativeTest()
//	{
//		Assert.assertEquals(false,checkAbeforeB("aababbb"));
//	}
//	
//	@Test
//	public void edgeTest()
//	{
////		Assert.assertEquals(false,checkPalindrome("   "));
//		
//		Assert.assertEquals(false,checkAbeforeB("aaa"));
//		Assert.assertEquals(true,checkAbeforeB("bbb"));
////		Assert.assertEquals(true,checkPalindrome("A"));
//	}
//
//
//	// Contains ba solution -- Best Solution
//
//	public void checkAbeforeB(String[] inputStr)
//	{
//		
//		List<String> list = Arrays.asList(inputStr);
//		
//		
//		
////		return false;
//
//	}

}



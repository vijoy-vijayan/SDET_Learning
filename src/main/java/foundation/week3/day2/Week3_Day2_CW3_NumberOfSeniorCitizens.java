package foundation.week3.day2;

import org.junit.Assert;
import org.junit.Test;

/* 
Link: https://leetcode.com/problems/number-of-senior-citizens/description/

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

public class Week3_Day2_CW3_NumberOfSeniorCitizens {

	@Test
	public void positiveTest()
	{
		Assert.assertEquals(2,getNoOfSeniorCitizens(new String[] {"a","b"}));


	}

//	@Test
//	public void negativeTest()
//	{
//		Assert.assertEquals(false,checkAbeforeB("aababbb"));
//	}
//
//	@Test
//	public void edgeTest()
//	{
//		//		Assert.assertEquals(false,checkPalindrome("   "));
//
//		Assert.assertEquals(false,checkAbeforeB("aaa"));
//		Assert.assertEquals(true,checkAbeforeB("bbb"));
//		//		Assert.assertEquals(true,checkPalindrome("A"));
//	}


	// Contains ba solution -- Best Solution

	public int getNoOfSeniorCitizens(String[] inpArr)
	{
		int ctr=0;
		for (int i = 0; i < inpArr.length; i++) {
			if(Integer.parseInt(inpArr[i].substring(11,13))>60)
				ctr++;
		}

		return ctr;


	}

}



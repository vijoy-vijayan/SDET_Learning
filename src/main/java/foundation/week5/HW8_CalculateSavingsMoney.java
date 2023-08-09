package foundation.week5;

import org.junit.Test;

import org.junit.Assert;




public class HW8_CalculateSavingsMoney {

	/* 
Problem Statement: Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.


	 */

	//	@Test
	//	public void positiveTest()
	//	{
	//		Assert.assertEquals("tes",getLongestPrefix(new String[] {"test","tesT","tess"}));
	//
	//	}
	//
	//	@Test
	//	public void negativeTest()
	//	{
	//		Assert.assertEquals("",getLongestPrefix(new String[] {"dog","racecar","car"}));
	//	}

	@Test
	public void edgeTest()
	{
		//		Assert.assertEquals(1,getSignOfProductArray(new int[] {1,1,-1,-1, 100}));

//		Assert.assertEquals(true,isValidParentheses("[()]"));
		
		System.out.println(findtotalSavings(10));
	}





	public int findtotalSavings(int n)
	{
		int ctr=0, quotient=n/7, remainder=n%7, endOfWeek=7;
		
		
		for (int i = 0; i < quotient+1; i++) {
			
			if(i==quotient)
				endOfWeek=remainder;
			
			for (int j = 1; j <= endOfWeek; j++) {
				ctr=ctr+i+j;
			}					
		}
		
		return ctr;
	}




}

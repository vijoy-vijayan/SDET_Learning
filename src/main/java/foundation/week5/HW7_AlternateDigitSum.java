package foundation.week5;

import org.junit.Test;

import org.junit.Assert;




public class HW7_AlternateDigitSum {

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
		
		System.out.println(findAlternateDigitSum(521));
	}





	public int findAlternateDigitSum(int n)
	{
		int swap=-1, res=0,ctr=0,rem, temp=n;
		
		while(temp>0)
		{
			temp=temp/10;
			ctr++;
		}
		
		if(ctr%2==0)
			temp=1;
		else
			temp=-1;
		
		while(n>0)
		{
			rem=n%10;
			
			temp=swap*temp;
			
			res=res+(rem*temp);
			
			n=n/10;
			
		}

		return res;
	}




}

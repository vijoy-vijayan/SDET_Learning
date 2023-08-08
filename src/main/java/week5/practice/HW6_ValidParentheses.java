package week5.practice;

import org.junit.Test;

import org.junit.Assert;




public class HW6_ValidParentheses {

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

		Assert.assertEquals(true,isValidParentheses("[()]"));
	}





	public boolean isValidParentheses(String s)
	{
		boolean flag=false;

		if((s.length()%2!=0))
			return flag;


		char[] dataSet= {'(',')','{','}','[',']'};

		char[] charArray = s.toCharArray();

		for(int i=0;i<charArray.length;i=i+2)
		{
			for (int j = 0; j < dataSet.length; j++) {

				if(charArray[i]==dataSet[j])
				{
					if(j%2!=0)
						return false;
					
					if(charArray[i+1]!=dataSet[j+1])
						return false;
				}
			}
		}

		return true;
	}




}

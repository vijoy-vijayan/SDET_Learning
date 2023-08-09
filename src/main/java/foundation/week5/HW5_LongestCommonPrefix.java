package foundation.week5;

import org.junit.Test;

import org.junit.Assert;




public class HW5_LongestCommonPrefix {

	/* 
	Problem statement: 	 
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".


	 */

	@Test
	public void positiveTest()
	{
		Assert.assertEquals("tes",getLongestPrefix(new String[] {"test","tesT","tess"}));

	}

	@Test
	public void negativeTest()
	{
		Assert.assertEquals("",getLongestPrefix(new String[] {"dog","racecar","car"}));
	}

	@Test
	public void edgeTest()
	{
		//		Assert.assertEquals(1,getSignOfProductArray(new int[] {1,1,-1,-1, 100}));

		Assert.assertEquals("fl",getLongestPrefix(new String[] {"flower","flow","flight"}));
	}





	public String getLongestPrefix(String[] strs)
	{
		int minLength=Integer.MAX_VALUE;

		String temp="";

		for(int i=0; i<strs.length;i++)
		{
			if(strs[i].length()==0)
				return temp;

			if(strs[i].length()<minLength)
				minLength=strs[i].length();
		}

		System.out.println(minLength);

		for (int i = 0; i <  minLength; i++) {			

			for (int j = 0; j < strs.length-1; j++) {

				if(strs[j].charAt(i)!=strs[j+1].charAt(i))
					return temp;

			}

			temp=temp+strs[0].charAt(i);

		}


		return temp;
	}




}

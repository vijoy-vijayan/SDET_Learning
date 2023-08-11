package foundation.week6;

import org.junit.Test;

import java.util.Arrays;

import org.junit.Assert;




public class CW_MentorConnect_MinimumSum {

	/* 

Link: https://leetcode.com/problems/minimum-sum-of-four-digit-number-after-splitting-digits/

Problem statement: 	

You are given a positive integer num consisting of exactly four digits. Split num into two new integers new1 and new2 by using the digits 
found in num. Leading zeros are allowed in new1 and new2, and all the digits found in num must be used.

For example, given num = 2932, you have the following digits: two 2's, one 9 and one 3. Some of the possible pairs [new1, new2] are 
[22, 93], [23, 92], [223, 9] and [2, 329]. Return the minimum possible sum of new1 and new2.

Example 1:

Input: num = 2932
Output: 52
Explanation: Some possible pairs [new1, new2] are [29, 23], [223, 9], etc.
The minimum sum can be obtained by the pair [29, 23]: 29 + 23 = 52


	Input 			----->  int	
	Output 			----->  int	


	Data Set:
		 Positive: 	---> Input: 2932		Output = 52
		 Negative: 	---> Input: 9290		Output = 38
		 Edge: 		---> Input: 1000		Output = 1

	Pseudo Code:
	1. Get the input number and split it using digits - Store it in int array
	2. Sort the array
	3. Return (arr[0]*1+arr[2]) + (arr[1]*1+arr[3]) 
	 */

	@Test	
	public void positiveTest()
	{
		Assert.assertEquals(52, getMinimumSum(2932));
	}
	
	@Test	
	public void negativeTest()
	{
		Assert.assertEquals(38, getMinimumSum(9290));
	}
	
	@Test	
	public void edgeTest()
	{
		Assert.assertEquals(01, getMinimumSum(1000));
		Assert.assertEquals(198, getMinimumSum(9999));
	}

	public int getMinimumSum(int num)
	{
		int[] res=new int[4];
		int ctr=0;
		while(num>0)
		{
			res[ctr]=num%10;
			num=num/10;
			ctr++;
		}
		
		Arrays.sort(res);
		
		return (res[0]*10+res[2])+(res[1]*10+res[3]);
	}
	
	public int getMinimumSum_2(int num)
	{
		char[] res = String.valueOf(num).toCharArray();
		
		Arrays.sort(res);
		
		return (res[0]-'0')*10+(res[2]-'0')+ (res[1]-'0')*10+(res[3]-'0');
	}

}

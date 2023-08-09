package foundation.week6;

import org.junit.Test;

import java.util.Arrays;

import org.junit.Assert;




public class HW16_AvgValueOfEvenNumbers {

	/* 
Leetcode link: https://leetcode.com/problems/three-divisors/

Problem statement: 	
Given an integer n, return true if n has exactly three positive divisors. Otherwise, return false.

An integer m is a divisor of n if there exists an integer k such that n = k * m.


	Input 			----->  int
	Output 			----->  boolean


	Data Set:
		 Positive: 	---> Input:4						Output =  true
		 Negative: 	---> Input: 2						Output =  false
		 Negative: 	---> Input: 9						Output =  false 
		 Edge: 		---> Input: 1						Output = false
		 Edge: 		---> Input: 10000					Output = false

	Pseudo Code:
	1. Loop through the number keeping i as 1. Initialise ctr=0
	2. Check for condition n/i==0.. If true increase ctr
	3. Track the ctr and check if ctr>3 and return false if it satisfies
	4. Iterate through all the numbers
	5. Return true if ctr==3

	 */

	@Test	
	public void positiveTest()
	{
		Assert.assertEquals(true, hasExactlyThreeDivisors(4));

//		Assert.assertEquals(6, getSecondLargestDigit(new int[] {9,2,5,0,6}));
	}


		@Test	
		public void negativeTest()
		{
			Assert.assertEquals(false, hasExactlyThreeDivisors(2));
			Assert.assertEquals(false, hasExactlyThreeDivisors(6));
			Assert.assertEquals(false, hasExactlyThreeDivisors(18));
		}
	
	
		@Test	
		public void edgeTest()
		{
			Assert.assertEquals(false, hasExactlyThreeDivisors(1));
			Assert.assertEquals(false, hasExactlyThreeDivisors(10000));
		}

	public boolean hasExactlyThreeDivisors(int n) {
		
		int ctr=1;
		
		for (int i = 2; i <= n; i++) {
			
			if(n%i==0)
			{
				ctr++;
				if(ctr>3)
					return false;
			}
			
		}
		
		return ctr==3;

	}




}

package foundation.week3.day2;

import java.util.Arrays;

import org.junit.Test;
import org.junit.Assert;

public class Week3_Day2_HW9_CountPrimes {

	/*

Link: https://leetcode.com/problems/count-primes/description/

Problem statement: 	 
	Given an integer n, return the number of prime numbers that are strictly less than n.

	Input 			----->  	int
	Output 			----->  	int


	Data Set:
		 Positive: 		---> Input: 10					Output = 4
		 Negative: 		---> Input: 0					Output = 0
		 Edge: 			---> Input: 1					Output = 0



Pseudo Code:
 1. Get the input n and initialise ctr=0, return 0 for n=<2 (0,1 Condition)
 2. Iterate through Nested For .. Outer Loop - Tracking Numbers ,Inner Loop - Prime number Logic 
 3. Increment ctr at the end of the inner loop
 4. Return ctr at the end



	 */
		@Test
		public void positiveTest()
		{
			Assert.assertEquals(5, getPrimeNumberCount(13));//return the number of prime numbers that are strictly less than n.
		}
	
		@Test
		public void negativeTest()
		{
			Assert.assertEquals(0, getPrimeNumberCount(0));
		}
	
		@Test
		public void edgeTest()
		{
			Assert.assertEquals(0, getPrimeNumberCount(1));
		}

	public int getPrimeNumberCount(int inputNum)
	{

		int ctr=0;
		
		for (int i = 2; i <= inputNum-1; i++) {//return the number of prime numbers that are strictly less than n.
			int j=2;
			for (; j <i; j++) {
				if(i%j==0)
					break;	
			}

			if(j==i)
				ctr++;

		}

		return ctr;


	}

}


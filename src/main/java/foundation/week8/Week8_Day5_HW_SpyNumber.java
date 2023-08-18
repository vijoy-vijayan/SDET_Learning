package foundation.week8;

import org.junit.Test;

import java.util.Arrays;

import org.junit.Assert;


public class Week8_Day5_HW_SpyNumber{

	/* 
Leetcode link: NA

Problem statement: 	
Find if number is Spy number. A number whose sum of digits is equal to its product of digits then its called as Spy number


	Input 			----->  int
	Output 			----->  boolean


	Data Set:
		 Positive: 		---> Input: 132							Output =  True	 
		 Positive: 		---> Input: 1124						Output =  True
		 Negative: 		---> Input: 123							Output =  False
		 Edge:  		---> Input: 5							Output = True



	Pseudo Code:
	1. Get the input integer and initialise sum=0, prod=1
	2. Loop through the number to separate its digits in while loop ... rem = num%10, num = num/10
	3. Update sum=sum+rem.... prod=prod*rem
	4. Compare sum and prod after loop and return the result  

	 */

	@Test	
	public void positiveTest()
	{

		//		Assert.assertEquals(4, getGoodPair(new int[] {1,2,3,1,1,3}));
		Assert.assertEquals(true, getSpyNumber(132));
		Assert.assertEquals(true, getSpyNumber(1124));
	}

	@Test	
	public void negativeTest()
	{
		Assert.assertEquals(false, getSpyNumber(999));
	}

	@Test	
	public void edgeTest()
	{
		Assert.assertEquals(true, getSpyNumber(5));
	}


	public boolean getSpyNumber(int num) {

		int sum=0,prod=1,rem;

		while(num>0) {
			rem=num%10;
			num=num/10;
			sum+=rem;
			prod*=rem;

		}
		
		return sum==prod;

	}

}

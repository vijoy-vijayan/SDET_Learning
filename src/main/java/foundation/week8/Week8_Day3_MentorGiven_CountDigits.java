package foundation.week8;

import org.junit.Test;

import java.util.Arrays;

import org.junit.Assert;


public class Week8_Day3_MentorGiven_CountDigits{

	/* 
Leetcode link: https://leetcode.com/problems/count-the-digits-that-divide-a-number/

Problem statement: 	
Given an integer num, return the number of digits in num that divide num.

An integer val divides nums if nums % val == 0.

	Input 			----->  int
	Output 			----->  int


	Data Set:
		 Positive: 	---> Input: 1234			Output =  1
		 Positive:  ---> Input: 1254			Output = 3
		 Edge: 		---> Input: 5				Output =  1
		 Edge: 		---> Input: 222				Output =  3


	Pseudo Code:
	1. Get the input and initialise sum=0, prod=1
	2. Iterate through the input in while loop to separate digits with condition input>0
	3. Calculate rem = input%10, input = input/10.. 
	4. Update Sum and prod .. sum=sum+rem, prod=prod*rem
	5. Repeat steps 2 to 4 until num becomes 0
	6. Return prod - sum


	 */

	@Test	
	public void positiveTest()
	{
		Assert.assertEquals(2, getCountOfDigits(1234));
		Assert.assertEquals(0, getCountOfDigits(7223));
	}


	@Test	
	public void edgeTest()
	{
		Assert.assertEquals(1, getCountOfDigits(5));
		Assert.assertEquals(4, getCountOfDigits(2222));
	}


	public int getCountOfDigits(int num) {

		int ctr=0,rem,temp=num;

		while(temp>0)
		{
			rem=temp%10;

			if(num%rem==0)
				ctr++;

			temp=temp/10;
		}


		return ctr;

	}


}

package foundation.week8;

import org.junit.Test;

import java.util.Arrays;

import org.junit.Assert;


public class Week8_Day2_Self_XOR{

	/* 
Leetcode link: Mentor Given

Problem statement: 	
Find difference between product of digits and sum of digits

input = number (Valid)

	Input 			----->  int
	Output 			----->  int


	Data Set:
		 Positive: 	---> Input: 1234			Output =  14
		 Negative:  ---> Input: 9000			Output = -9
		 Edge: 		---> Input: 5				Output =  0


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
		Assert.assertEquals(9, xorOperation(5,0));
	}


	//	@Test	
	//	public void negativeTest()
	//	{
	//		Assert.assertEquals(-9, getDifference_prodandSum(9000));
	//	}
	//
	//	@Test	
	//	public void edgeTest()
	//	{
	//		Assert.assertEquals(0, getDifference_prodandSum(5));
	//	}


	public int xorOperation(int n, int start) {

		int nums[]=new int[n];

		nums[0] = start + 2 * 0;
		int temp=nums[0];

		for(int i=1; i<n;i++)
		{
			nums[i] = start + 2 * i;
			temp=temp^nums[i];

		}

		return temp;

	}

	public int xorOperation_Optimized(int n, int start) {

		int temp=start + 2 * 0;

		for(int i=1; i<n;i++)
			temp=temp^(start + (2 * i));

		return temp;

	}
}

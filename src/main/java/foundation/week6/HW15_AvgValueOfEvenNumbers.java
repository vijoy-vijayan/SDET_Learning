package foundation.week6;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;



public class HW15_AvgValueOfEvenNumbers {

	/* 
Problem statement: 	 
Given an integer array nums of positive integers, return the average value of all even integers that are divisible by 3.

Note that the average of n elements is the sum of the n elements divided by n and rounded down to the nearest integer.

Example 1:
Input: nums = [1,3,6,10,12,15]
Output: 9
Explanation: 6 and 12 are even numbers that are divisible by 3. (6 + 12) / 2 = 9.

	Input 			----->  	int[]
	Output 			----->  	int

	Data Set:
		 Positive: 	---> Input: [3,6,9,12,15,16,18,20,22,24]		Output = 15
		 Negative: 	---> Input: [2,3,4,5,10,10,50,100]		Output = 0
		 Edge: 		---> Input: [6,300]		Output = 153

	Pseudo Code:
		 1. Get the input array and iterate through it. Initialise total=0, ctr=0
		 2. Check the element is divisible by 2 and 3 and add the value to total if true. 
		 3. Increment the counter
		 4. Retrun total/counter at the end

	 */

	@Test
	public void positiveTest()
	{
		Assert.assertEquals(15,averageValue(new int[] {3,6,9,12,15,16,18,20,22,24}));
	}

	@Test
	public void negativeTest()
	{
		Assert.assertEquals(0,averageValue(new int[] {2,3,4,5,10,10,50,100}));
	}

	@Test
	public void edgeTest()
	{		
		Assert.assertEquals(153,averageValue(new int[] {6,300}));
		Assert.assertEquals(996,averageValue(new int[] {996,996,996}));
		
		
	}



		public int averageValue(int[] nums) {
			
			int ctr=0, total=0;
			
			
			for(int i=0; i<nums.length;i++)
			{
			
				if((nums[i]%3==0)&&(nums[i]%2==0))
				{
					total=total+nums[i];
					ctr++;
				}
		        
		    }
			
			return ctr==0?0:total/ctr;
		
		
	}
	
	

}

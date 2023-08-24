package foundation.week9;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;


public class Week9_Day4_HW_ArrayPartition {

	/* 
Leetcode link: https://leetcode.com/problems/array-partition/

Problem statement: 	
Given an integer array nums of 2n integers, group these integers into n pairs 
(a1, b1), (a2, b2), ..., (an, bn) such that the sum of min(ai, bi) for all i is maximized. 
Return the maximized sum

	Input 			----->  int[]
	Output 			----->  int


	Data Set:
		 Positive: 	---> Input: [9,8,7,6,5,4]					Output =  18
		 Negative:  ---> Input: [1200,2500,1700,2000]			Output =  1600
		 Edge: 		---> Input: [9,9]							Output =  9


	Pseudo Code:
	1. Get the input array nums and initialize sum=0
	2. Sort the array
	3. Iterate through the loop from 0 to nums.lenght with the increment factor as 2
	4. Execute the statement sum+=nums[i]
	5. return sum
	 */

	@Test	
	public void positiveTest()
	{

		Assert.assertEquals(18, getSumOfPartitionedArray(new int[]{9,8,7,6,5,4}));
	}


	@Test	
	public void negativeTest()
	{
		Assert.assertEquals(3200, getSumOfPartitionedArray(new int[]{1200,2500,1700,2000}));
	}

	@Test	
	public void edgeTest()
	{
		Assert.assertEquals(9, getSumOfPartitionedArray(new int[]{9,9}));
		Assert.assertEquals(0, getSumOfPartitionedArray(new int[]{0,0}));
	}


	public int getSumOfPartitionedArray(int[] nums) {//O(N logN)
		
		int sum=0;
		
		Arrays.sort(nums);//O(N logN)
		
		for (int i = 0; i < nums.length; i=i+2) //O(N)			
			sum+=nums[i];
		
		return sum;

		

	}

}

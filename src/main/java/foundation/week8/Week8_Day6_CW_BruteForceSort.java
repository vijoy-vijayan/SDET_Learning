package foundation.week8;

import org.junit.Test;

import java.util.Arrays;

import org.junit.Assert;


public class Week8_Day6_CW_BruteForceSort{

	/* 
Leetcode link: https://leetcode.com/problems/number-of-good-pairs/description/

Problem statement: 	
Given an array of integers nums, return the number of good pairs.
A pair (i, j) is called good if nums[i] == nums[j] and i < j.

	Input 			----->  int[]
	Output 			----->  int


	Data Set:
		 Positive: 		---> Input: [1,2,3,1,1,3]							Output =  4		 
		 Negative: 		---> Input: [1,2,3]									Output =  0
		 Edge: 			---> Input: [1,1]									Output =  1
		 Edge:  		---> Input: [1,1,1,1]								Output = 6



	Pseudo Code:
	1. Get the input array. Initialise ctr=0
	2. Iterate through the nester array and compare i with j... i staring 0, j starting i+1
	3. Compare for the matches and increase the ctr if matched  
	4. Return the ctr at the end

	 */

//	@Test	
//	public void positiveTest()
//	{
//
//		//		Assert.assertEquals(4, getGoodPair(new int[] {1,2,3,1,1,3}));
//		Assert.assertEquals(4, findArrayDifferencenSum(new int[] {1,2,3,1,1,3}));
//
//	}

	//	@Test	
	//	public void negativeTest()
	//	{
	//		Assert.assertEquals(0, getGoodPair(new int[] {1,2,3}));
	//
	//	}
	//
	//	@Test	
	//	public void edgeTest()
	//	{
	//		Assert.assertEquals(1, getGoodPair(new int[] {1,1}));
	//		Assert.assertEquals(6, getGoodPair(new int[] {1,1,1,1}));
	//
	//	}


	public int getGoodPair(int[] nums) {

		int ctr=0;

		for (int i = 0; i < nums.length-1; i++) 		
			for (int j = i+1; j < nums.length; j++) {
				if(nums[i]==nums[j])
					ctr++;
			}		

		return ctr;

	}

	public int[] findArrayDifferencenSum(int[] arr1, int[] arr2) {

		int[] res=new int[arr2.length];

		for (int i = 0; i < res.length; i++) {

			int sum=0;

			for (int j = 0; j < res.length; j++) {

				if(j==i)
					continue;
				else
					sum=sum+arr2[j];				
			}

			res[i]=sum;
		}		
		return res;
	}

}

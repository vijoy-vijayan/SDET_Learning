package week5.practice;

import org.junit.Test;

import java.util.Arrays;

import org.junit.Assert;




public class CW_MentorConnect_findDuplicates {

	/* 
Problem statement: 	

Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

Example 1:

Input: nums = [1,2,3,1]
Output: true


	Input 			----->  int[]	
	Output 			----->  boolean	


	Data Set:
		 Positive: 	---> Input: [2,3,4,6,4]		Output = true
		 Positive: 	---> Input: [1,2,3,1]		Output = true
		 Negative: 	---> Input: [2,3,4,6]		Output = false
		 Edge: 		---> Input: [9,9]		Output = true

	Pseudo Code:
	1. Get the input array and sort it
	2. Loop through the array from 0 and check for its adjacent element with current value
	3. if both are same return true
	4. Return false at the end if there is no match 



	 */

	@Test	
	public void positiveTest()
	{
		Assert.assertEquals(true, findDuplicates(new int[] {2,3,4,6,4}));
		Assert.assertEquals(true, findDuplicates(new int[] {1,2,3,1}));
	}
	
	@Test	
	public void negativeTest()
	{
		Assert.assertEquals(false, findDuplicates(new int[] {2,3,4,6}));
	}
	
	@Test	
	public void edgeTest()
	{
		Assert.assertEquals(true, findDuplicates(new int[] {9,9}));
		Assert.assertEquals(true, findDuplicates(new int[] {-1,2,3,-1,-2,0,-2}));
	}

	public boolean findDuplicates(int[] nums)
	{


		Arrays.sort(nums);
		
		for (int i = 0; i < nums.length-1; i++) {
			
			if(nums[i]==nums[i+1])
				return true;
		}
		
		return false;
	}

}

package foundation.week3.day2;

import java.util.Arrays;

import org.junit.Test;
import org.junit.Assert;

public class Week3_Day2_HW2_MissingNumbers {
	
	/*
	Link : https://leetcode.com/problems/missing-number/description/
	
	Problem statement: 	 
	Given an array nums containing n distinct numbers in the range [0, n], 
	return the only number in the range that is missing from the array.
	 
	Input 			----->  	int[]
	Output 			----->  	int
	 
	 
	Data Set:
		 Positive: 	---> Input: [3,0,1]						Output = 2
		 Negative: 	---> Input: [9,8,7,5,4,3,2,1,0]			Output = 6
		 Edge: 		---> Input: [1]							Output = 0
		 Edge: 		---> Input: [0,1]						Output = 2
	 
	Pseudo Code:
		 1. Get the input array and sort it
		 2. Compare the array element with for loop counter during iteration
		 3. Return the for loop variable if not matched
		 4. Return the array length at the end if comes out of loop

	 */
	@Test
	public void positiveTest()
	{
		Assert.assertEquals(2, findMissingNumber(new int[] {3,0,1}));
	}
	
	@Test
	public void negativeTest()
	{
		Assert.assertEquals(6, findMissingNumber(new int[] {9,8,7,5,4,3,2,1,0}));
	}
	
	@Test
	public void edgeTest()
	{
		Assert.assertEquals(0, findMissingNumber(new int[] {1}));
		Assert.assertEquals(2, findMissingNumber(new int[] {0,1}));
	}

	public int findMissingNumber(int[] inputArr)
	{
		Arrays.sort(inputArr);
		for (int i = 0; i < inputArr.length; i++) {
			if(inputArr[i]!=i)
				return i;
			
		}
		
		return inputArr.length;
	}

	
	
	
}


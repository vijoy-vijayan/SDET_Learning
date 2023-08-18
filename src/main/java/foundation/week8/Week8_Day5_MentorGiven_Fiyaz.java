package foundation.week8;

import org.junit.Test;

import java.util.Arrays;

import org.junit.Assert;


public class Week8_Day5_MentorGiven_Fiyaz{

	/* 
Leetcode link: https://leetcode.com/problems/squares-of-a-sorted-array/

Problem statement: 	
Given an integer array nums sorted in non-decreasing order, 
return an array of the squares of each number sorted in non-decreasing order.

	Input 			----->  int[]
	Output 			----->  int[]


	Data Set:
		 Positive: 	---> Input: [-4,-1,0,3,10]					Output =  [0,1,9,16,100]
		 Positive:  ---> Input: [-7,-3,2,3,11]					Output = [4,9,9,49,121]
		 Edge: 		---> Input: [1]								Output =  [1]
		 Edge: 		---> Input: [-9,9,-8,8,1,2,0]				Output =  [0,1,4,64,64,81,81]


	Pseudo Code:
	1. Get the input array 
	2. Loop through the input array and store the square in the respective position 
	3. If the element is negative, arr[i]<0 --> arr[i]=arr[i]*arr[i]*-1
	4. Sort the array and return the sorted array

	 */

	@Test	
	public void positiveTest()
	{

		Assert.assertArrayEquals(new int[] {0,1,9,16,100}, getSquaresOfSortedArray(new int[] {-4,-1,0,3,10}));
		Assert.assertArrayEquals(new int[] {4,9,9,49,121}, getSquaresOfSortedArray(new int[] {-7,-3,2,3,11}));
		Assert.assertArrayEquals(new int[] {0,1,4,64,64,81,81}, getSquaresOfSortedArray(new int[] {-9,9,-8,8,1,2,0}));

	}

	
		@Test	
		public void edgeTest()
		{
			Assert.assertArrayEquals(new int[] {1}, getSquaresOfSortedArray(new int[] {1}));
			Assert.assertArrayEquals(new int[] {25,25,25,25}, getSquaresOfSortedArray(new int[] {5,5,5,-5}));

		}


	public int[] getSquaresOfSortedArray(int[] nums) {

		for (int i = 0; i < nums.length; i++) 		
			nums[i]=nums[i]*nums[i];
		
		Arrays.sort(nums);
		
		return nums;
		
	}
	
	public int[] getSquaresOfArray_WithoutSort(int[] nums) {
		
		int pointerRight=nums.length, pointerLeft=0;

		while(pointerRight>pointerLeft)
		{
			if(nums[pointerLeft]<0)
				if((nums[pointerLeft]*-1)>nums[pointerRight])
					nums[pointerRight]=nums[pointerRight]*nums[pointerRight];
					
		}
		
		return nums;
		
	}


}

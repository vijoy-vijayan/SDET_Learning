package week2.day2;

import org.junit.Assert;
import org.junit.Test;

/* 
Problem statement: 
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 
 Input = int[], int;
 Output = int[];
 
 Data Set:
 * Positive {1, 1, 2, 2, 2, 2, 3} target = 2 ---> Output = 2
 * Negative {5,5,6,8,9,9,9} target = 4 ---> Output = 0
 * Edge {1, 1, 1,1} target = 1 ---> Output = 4
 
 Pseudo Code:
 1. Get the input array and Target value
 2. Loop through the Nested loop for the Target and search for target value 
 3. Return indices as array if match is found 
 

 
 */

public class Week2_CW1_TwoSum {
	
	@Test
	public void positiveTest()
	{
		Assert.assertArrayEquals(new int[] {0, 2},getTargetSum(new int[] {1, 1, 2, 2, 2, 2, 3},3 ));
		
	}
	
	@Test
	public void negativeTest()
	{
		Assert.assertArrayEquals(new int[] {-1, -1},getTargetSum(new int[] {1, 4},3 ));
	}
	
	@Test
	public void edgeTest()
	{
		Assert.assertArrayEquals(new int[] {0, 3},getTargetSum(new int[] {-1,-5,-3, 0, 2, -6},-1 ));
	}


	public int[] getTargetSum(int[] inputArr, int target)
	{
		for(int i=0;i<inputArr.length-1;i++)
		{
			for(int j=i+1;j<inputArr.length;j++)
			{
			if(inputArr[i]+inputArr[j]==target)			
				return new int[] {i,j};
			}
		}		

		return new int[] {-1,-1};
	}

}

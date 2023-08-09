package foundation.week2.day2;

import org.junit.Assert;
import org.junit.Test;


/* 
Link: https://leetcode.com/problems/squares-of-a-sorted-array/

Problem statement: 
 Given an integer array nums sorted in non-decreasing order, 
 return an array of the squares of each number sorted in non-decreasing order.


Input 			----->  	int[]
Output 			----->  	int[]


Data Set:
	 Positive: 	Input: {-4,-1,0,3,10} 			---> 		Output = {0,1,9,16,100}
	 Negative: 	Input: {-7,-3,2,3,11}			---> 		Output = {4,9,9,49,121}
	 Edge: 		Input: {-1,0,1}					---> 		Output = {0,1,1}

Pseudo Code:

Idea: Always the negative number square is also going to be positive. So we can sort before the calculation
	 1. Get the input and sort irrespective of signs (Ignore minus sign)
	 2. Loop through all elements and findSquare and save in same array while sorting 
	 3. Return the same array back

 */

public class Week2_HW9_SquaresOfArray {

	@Test
	public void positiveTest()
	{
		Assert.assertArrayEquals(new int[] {0,1,9,16,100},getSquaresOfArray(new int[] {-4,-1,0,3,10}));
	}

	@Test
	public void negativeTest()
	{
		Assert.assertArrayEquals(new int[] {4,9,9,49,121},getSquaresOfArray(new int[] {-7,-3,2,3,11}));
	}

	@Test
	public void edgeTest()
	{
		Assert.assertArrayEquals(new int[] {0,1,1},getSquaresOfArray(new int[] {-1,0,1}));
	}


	public int[] getSquaresOfArray(int[] inputArr)
	{
		int temp=0;
		
		// Changing Negative number to Positive number
		for(int i=0;i<inputArr.length;i++)
		{
			if(inputArr[i]<0)
				inputArr[i]=-inputArr[i];
		}		

		//Sorting Logic
		for(int i=0;i<inputArr.length;i++)
		{
			for(int j=i+1;j<inputArr.length;j++)
			{
				if(inputArr[i]>inputArr[j])
				{
					temp=inputArr[i];
					inputArr[i]=inputArr[j];
					inputArr[j]=temp;
				}
			}
			inputArr[i]=inputArr[i]*inputArr[i];//Calculating Square during Sorting itself
		}		
		return inputArr;
	}
}

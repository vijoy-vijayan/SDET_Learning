package week2.day2;

import java.util.Collections;

import org.junit.Assert;
import org.junit.Test;

/* 
Problem statement: 
Given an integer array nums, move all 0's to the end of it 
while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.
 
 
Input 			----->  	int[]
Output 			----->  	int[]
 
 
Data Set:
	 Positive: 	Input: {0,1,0,3,12} 				---> 		Output = {1,3,12,0,0}
	 Negative: 	Input: {-1,0,23,0,0,55,-124,0,0}	---> 		Output = {-1,23,55,-124,0,0,0,0,0}
	 Edge: 		Input: 	{0}							---> 		Output = {0}
 
Pseudo Code:
	 1. Initialize counter to track Non Zero position
	 2. Loop through the array and check for non Zeroes
	 3. If i (Loop variable) and counter are same.. Dont update the current position with 0 
	 3. If non Zero, move the element to ctr position and update the current one with 0
	 4. Update the counter value 
	 5. Return input Array back
 
 */

public class Week2_HW3_MoveZeroes {
	
	@Test
	public void positiveTest()
	{

		Assert.assertArrayEquals(new int[] {1,3,12,0,0},moveZeroes(new int[] {0,1,0,3,12}));
		Assert.assertArrayEquals(new int[] {-1,23,55,-124,0,0,0,0,0},moveZeroes(new int[] {-1,0,23,0,0,55,-124,0,0}));
		Assert.assertArrayEquals(new int[] {1,2,3,4,5,0},moveZeroes(new int[] {1,2,3,0,4,5}));
		
	}
	
	@Test
	public void negativeTest()
	{		
		Assert.assertArrayEquals(new int[] {5,6,8,9},moveZeroes(new int[] {5,6,8,9}));
	}
	
	@Test
	public void edgeTest()
	{
		Assert.assertArrayEquals(new int[] {0},moveZeroes(new int[] {0}));
	}


	public int[] moveZeroes(int[] inputArr)
	{
		int counter_NonZero_Position=0;
		boolean flag=false;
	
		for(int i=0;i<inputArr.length;i++)
		{
			if(inputArr[i]!=0 )
			{
				inputArr[counter_NonZero_Position]=inputArr[i];
				
				if(counter_NonZero_Position!=i)
					inputArr[i]=0;
				
				counter_NonZero_Position++;
			}				
		}
		
		return inputArr;		

		
	}

}

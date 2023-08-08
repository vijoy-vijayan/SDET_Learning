package week2.day2;

import java.util.Arrays;
import java.util.Collections;

import org.junit.Assert;
import org.junit.Test;

/* 
Problem statement: 
 Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.
 
 
Input 			----->  	int[]
Output 			----->  	int
 
 
Data Set:
	 Positive: 	Input: {2,2,1}			---> 		Output = 1
	 Negative: 	Input: {4,1,2,1,2}		---> 		Output = 4
	 Edge: 		Input: {1}				---> 		Output = 1
 
Pseudo Code:
	 1. Get the input array and sort it
	 2. Iterated through the array and compare i, i+1 .. Return i if not matching
	 3. If matched, increase the iteration by 2 and continue
	 3. Return the matched number - Definitely one number will match as per the given statement 
 
 */

public class Week2_HW5_SingleNumber {
	
	@Test
	public void positiveTest()
	{
		Assert.assertEquals(1,findSingleNumber(new int[] {2,2,1}));
		Assert.assertEquals(4,findSingleNumber(new int[] {4,1,2,1,2}));
		Assert.assertEquals(9,findSingleNumber(new int[] {1,1,1,1,2,2,3,3,9}));
		
	}
	
	/* Not Applicable as per the input data set
	@Test
	public void negativeTest()
	{
		Assert.assertEquals(4,findSingleNumber(new int[] {1,1,1,1}));
	}*/
	
	@Test
	public void edgeTest()
	{
		Assert.assertEquals(1,findSingleNumber(new int[] {1}));
	}


	public int findSingleNumber(int[] inputArr)
	{
		
		if(inputArr.length==0)
			return -1;
		
		Arrays.sort(inputArr);
		//Written on the logic that the input will always have the single number in it
		for(int i=0;i<inputArr.length-1;i=i+2)
		{
			if(inputArr[i]!=inputArr[i+1])
				return inputArr[i];
						
		}
		
		return inputArr[inputArr.length-1];
		
	}

}

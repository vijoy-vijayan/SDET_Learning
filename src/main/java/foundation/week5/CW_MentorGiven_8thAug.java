package foundation.week5;

import org.junit.Test;

import java.util.Arrays;

import org.junit.Assert;




public class CW_MentorGiven_8thAug {

	/* 


Problem statement: 	
input Array = {7,3,4,2,9,6,10}, Find 2nd maximum

	Input 			----->  int[]
	Output 			----->  int


	Data Set:
		 Positive: 	---> Input:{7,3,4,2,9,6,10} 		Output =  9
		 Negative: 	---> Input: {2,2,2,2}				Output =  0
		 Edge: 		---> Input: {9} 					Output = 0

	Pseudo Code:
	1. Get the input Array and check for the size. Return 0 if size < 1
	2. Sort the Array and traverse through the array from the last to first
	3. Compare the adjacent elements starting from the last element i. e arr(length-1)
	4. Return the arr(i-1) element if there is mismatch between compared value 
	 */

	@Test	
	public void positiveTest()
	{
		Assert.assertEquals(9, getSecondLargestDigit(new int[] {7,3,4,2,9,6,10}));

		Assert.assertEquals(6, getSecondLargestDigit(new int[] {9,2,5,0,6}));
	}


	@Test	
	public void negativeTest()
	{
		Assert.assertEquals(0, getSecondLargestDigit(new int[] {2,2,2,2}));
	}


	@Test	
	public void edgeTest()
	{
		Assert.assertEquals(0, getSecondLargestDigit(new int[] {9}));
	}

	public int getSecondLargestDigit(int[] inputArr)
	{
		if(inputArr.length<2)
			return 0;

		Arrays.sort(inputArr);	

		for (int i = inputArr.length-1; i > 0; i--) {

			if(inputArr[i]!=inputArr[i-1])
				return inputArr[i-1];
		}

		return 0;
	}

	public int[] sortArr(int[] inpArr)
	{

		for (int i = 0; i < inpArr.length; i++) {
			
			for (int j = 0; j < inpArr.length; j++) {
				
			}

		}


		return inpArr;
	}



}

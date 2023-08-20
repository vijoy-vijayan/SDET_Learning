package foundation.week2.day1;

import org.junit.Assert;
import org.junit.Test;

/* 

Link : https://leetcode.com/problems/contains-duplicate/description/


 Problem statement: Given an integer array nums, return true if any value appears at least twice in the array, 
 and return false if every element is distinct.
 * 
 
 Input = int array
 Output = int
 
 Data Set:
 	Positive 	----> 		Input : {1, 1, 2, 2, 2, 2, 3} 		Output = true
 	Negative 	---->		Input : {1,2,3,4,5}					Output = false
 	Edge 	  	---->		Input : {1,2,3,4,5,1} 				Output = true
 
 Pseudo Code:
	 1. Get the input array
	 2. Create a nested loop and iterate through all elements
	 3. Return true if duplicate condition is satisfied
	 4. Return false at the end of the function 
 
 */

public class Week2_CW1_FindDuplicate {
	
	@Test
	public void positiveTest()
	{
		Assert.assertEquals(true,isDuplicatePresent(new int[] {1, 1, 2, 2, 2, 2, 3} ));
		Assert.assertEquals(true,isDuplicatePresent(new int[] {5,6,7,5,6,7} ));
		Assert.assertEquals(true,isDuplicatePresent(new int[] {5,6,7,9,8,7,8,0} ));
	}
	
	@Test
	public void negativeTest()
	{
		Assert.assertEquals(false,isDuplicatePresent(new int[] {1,2,3,4,5}));
	}
	
	@Test
	public void edgeTest()
	{
		Assert.assertEquals(true,isDuplicatePresent(new int[] {1,2,3,4,5,1} ));
	}

	//O(N2)
	public boolean isDuplicatePresent(int[] inputArr)
	{
		for(int i=0;i<inputArr.length-1;i++)
		{
			for(int j=i+1;j<inputArr.length;j++)
			{
			if(inputArr[i]==inputArr[j])			
				return true;
			}
		}		

		return false;
	}

}

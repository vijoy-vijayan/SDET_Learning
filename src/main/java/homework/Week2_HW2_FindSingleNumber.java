package homework;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

/*
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
You must implement a solution with a linear runtime complexity and use only constant extra space.

Example 1:  Input: nums = [2,2,1]...   Output: 1

Example 2:   Input: nums = [4,1,2,1,2].... Output: 4

Example 3:   Input: nums = [1]... Output: 1 

Input: an int Array
Output : int

Pseudo code:
1. Get the array and get it sorted
2. Return the only element if the array size is 1
3. Iterate through the array and then compare the current element with the next element
4. If false return the current element
5. Print last element if the array loops through until n-2 elements


 */
public class Week2_HW2_FindSingleNumber{
	
	@Test
	public void Positivetest()
	{
		Assert.assertEquals(1,FindTheSingle(new int[] {2,2,1}));
		Assert.assertEquals(4,FindTheSingle(new int[] {4,1,2,1,2}));
		
	}
	
	@Test
	public void Negativetest()
	{
		Assert.assertEquals(-1,FindTheSingle(new int[] {}));
	}
	
	@Test
	public void Edgetest()
	{
		Assert.assertEquals(8,FindTheSingle(new int[] {2,2,1,4,5,5,4,1,8}));
		Assert.assertEquals(9,FindTheSingle(new int[] {9}));
	}
	
	public int FindTheSingle(int[] arrInput)//4,1,2,1,2
	{
		Arrays.sort(arrInput);//1,1,2,2,4
		
		if(arrInput.length==1)
			return arrInput[0];
		
		if(arrInput.length==0)
			return -1;
		
		for(int i=0;i<arrInput.length-2;i=i+2)
		{			
			if(arrInput[i]!=arrInput[i+1])
				return arrInput[i];				
		}
				
		return arrInput[arrInput.length-1];
	}

}

package foundation.week1.day2;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

/*

Leet Code Link: https://leetcode.com/problems/contains-duplicate/description/  

Problem Statement:
Given an integer array nums, return true if any value appears at least twice in the array, 
and return false if every element is distinct.

Example 1:  Input: nums = [1,2,3,1]...   Output: true

Example 2:   Input: nums = [1,2,3,4].... Output: false

Example 3:   Input: nums = [1,1,1,3,3,4,3,2,4,2]... Output: true 

Input: an int Array
Output : Boolean

Pseudo code:
1. Get the array and get it sorted
2. Iterate through the array and then compare the current element with the next element
3. If matches return True and return
4. Return False at the end of the function

 */
public class Week2_HW1_FindDuplicate{
	
	@Test
	public void Positivetest()
	{
		Assert.assertEquals(true,isDuplicatePresent(new int[] {1,2,3,1}));
		Assert.assertEquals(false,isDuplicatePresent(new int[] {1,2,3,4}));
		Assert.assertEquals(true,isDuplicatePresent(new int[] {1,1,1,3,3,4,3,2,4,2}));
	}
	
	@Test
	public void Negativetest()
	{
		Assert.assertEquals(false,isDuplicatePresent(new int[] {}));
	}
	
	@Test
	public void Edgetest()
	{
		Assert.assertEquals(true,isDuplicatePresent(new int[] {1,1,1,1}));
	}
	
	//O(N)
	public boolean isDuplicatePresent(int[] arrInput)
	{
		Arrays.sort(arrInput);
		
		for(int i=0;i<arrInput.length-1;i++)
		{
			if(arrInput[i]==arrInput[i+1])
				return true;
		}
		
		return false;
	}

}

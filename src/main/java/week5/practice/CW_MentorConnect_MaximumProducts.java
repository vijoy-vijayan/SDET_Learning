package week5.practice;

import org.junit.Test;

import java.util.Arrays;

import org.junit.Assert;




public class CW_MentorConnect_MaximumProducts {

	/* 
Problem statement: 	
Given an integer array nums, find three numbers whose product is maximum and return the maximum product.

Example 1:

Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]


	Input 			----->  String[]	
	Output 			----->  String[]	


	Data Set:
		 Positive: 	---> Input: ["v","i","j","o","y"]		Output = ["y","o","j","i","v"]
		 Negative: 	---> Input: ["2","6","6","3"]			Output = ["3","6","6","2"]
		 Edge: 		---> Input: ["S","s"]					Output = ["s","S"]

	Pseudo Code:
	1. Get the String array and create a new output array with the same length of input
	2. Loop through the input array and copy all the characters from reverse to output array
	3. Return the output array

	 */

//	@Test	
//	public void positiveTest()
//	{
//		Assert.assertArrayEquals(new char[] {'y','o','j','i','v'}, reverseString(new char[] {'v','i','j','o','y'}));
//		
//	}
//	
//	@Test	
//	public void negativeTest()
//	{
//		Assert.assertArrayEquals(new char[] {'2','6','6','3'}, reverseString(new char[] {'3','6','6','2'}));
//	}
//	
//	@Test	
//	public void edgeTest()
//	{
//		Assert.assertArrayEquals(new char[] {'S','s'}, reverseString(new char[] {'s','S'}));
//	}

	public int getMaximumProducts(int[] nums)
	{
		
		Arrays.sort(nums);

        int res1=nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
        int res2=nums[nums.length-1]*nums[0]*nums[1];

        return res1>res2?res1:res2;
		
		//Getting Error in Leet code while executing
	}

}

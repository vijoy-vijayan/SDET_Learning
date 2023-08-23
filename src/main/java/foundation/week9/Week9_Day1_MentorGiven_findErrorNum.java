package foundation.week9;

import org.junit.Test;

import java.util.Arrays;

import org.junit.Assert;


public class Week9_Day1_MentorGiven_findErrorNum{

	/* 
Leetcode link: https://leetcode.com/problems/set-mismatch/

Problem statement: 	
You have a set of integers s, which originally contains all the numbers from 1 to n. 
Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set,
 which results in repetition of one number and loss of another number.

You are given an integer array nums representing the data status of this set after the error.

Find the number that occurs twice and the number that is missing and return them in the form of an array.

	Input	:  int[]
    Output	:  int[]

    Test Data:
        Postive: Input: 	[1,2,2,3,4]  		Output: [2,5]
        Negative:Input:  	[2,2,3]				Output: [2,1]
        Edge:	 Input:  	[2,2]				Output: [2,1]

    Pseudo code:
        1. Get the input array and initialize outputArray res with length 2
        2. Find the repeated element by iterating through a loop and update res[0] with the value
        3. Iterate through a nested loop having outer loop to track 1 to n and innter loop with orginal input array
        4. Compare input[j] with the numbers of outer looop and set flag if there is a match
        5. If flag is not set for any given iteration add that number of i to res array in res[1]
        6. Return res

	 */

	@Test	
	public void positiveTest()
	{

		Assert.assertArrayEquals(new int[]{3,5}, findErrorNums_Updated(new int[]{3,3,2,1,4}));
	}


	@Test	
	public void negativeTest()
	{
		Assert.assertArrayEquals(new int[]{2,1}, findErrorNums_Updated(new int[]{3,2,2}));
	}

	@Test	
	public void edgeTest()
	{
		Assert.assertArrayEquals(new int[]{2,1}, findErrorNums_Updated(new int[]{2,2}));
	}


	public int[] findSetMismatch(int[] nums) {

		int[] res=new int[2];

		Arrays.sort(nums);

		int temp;
		if((nums[0]==nums[1])&&(nums.length>=2)&&(nums[0]!=1))
			temp=nums[0]-1;
		else
			temp=nums[0];

		for(int i=temp; i<nums.length+temp; i++)
		{

			if(nums[i-temp]!=i)
			{
				if(i==temp)
					res[0]=nums[(i-temp)+1];
				else if(i==(nums.length+temp)-1)
					res[0]=nums[(i-temp)-1];
				else
				{
					if(nums[(i-temp)]==nums[(i-temp)-1])
						res[0]=nums[(i-temp)-1];
					else
						res[0]=nums[(i-temp)+1];
				}
				// res[0]=nums[i];
				res[1]=i;
				return res;

			}
		}

		return res;

	}

	public int[] findErrorNums(int[] nums) {

		int[] res=new int[2];

		Arrays.sort(nums);

		for(int i=0;i<nums.length-1;i++)
		{
			if(nums[i]==nums[i+1])
			{
				res[0]=nums[i];
				break;
			}
		}
		int ctr=0;

		for(int i=1;i<=nums.length;i++)
		{
			if(nums[ctr]!=i)
			{
				if((nums[ctr]==res[0])&&(nums[ctr+1]==i+1))
				{
					i--;
				}
				else
				{
					res[1]=i;
					break;
				}
			}

			ctr++;
		}

		return res;
	}


	public int[] findErrorNums_Updated(int[] nums) {

		int[] res=new int[2];

		Arrays.sort(nums);

		for(int i=0;i<nums.length-1;i++)
		{
			if(nums[i]==nums[i+1])
			{
				res[0]=nums[i];
				break;
			}
		}

		boolean flag=false;
		int ctr=0;
		
		for(int i=1;i<=nums.length;i++)
		{
			if(i==res[0])
				continue;

			for(int j=ctr;j<nums.length;j++)
			{
				if(nums[j]==i)
				{
					flag=true;
					ctr=j;
					break;
				}
			}

			if(!flag)
			{
				res[1]= i;
				break;
			}

			flag=false;
		}

		return res;
	}


}

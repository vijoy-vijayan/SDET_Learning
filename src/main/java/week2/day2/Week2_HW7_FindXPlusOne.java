package week2.day2;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

/* 
Problem statement: 
 Given an integer array arr, count how many elements x there are, 
   such that x + 1 is also in arr. 
   If there are duplicates in arr, count them separately.
   
   example 1: input = [1, 2, 3]
     output = 2
   explanation: when x is 1, we see x+1 (2) is present in input
       when x is 2, we see x+1 (3) is present in input
       when x is 3, we see x+1 (4) is not present in input
      so no of presence of x+1 is 2
   example 2: input = [1, 1, 3, 3, 5, 5, 7, 7]
     output = 0
     explanation: no occurence of x+1 for x
     
   example 3: input = [1, 1, 2]
     output = 2
     explanation: when x is 1, we see x+1 (2) is present in input
         when x is 1, we see x+1 (2) is present in input
         when x is 2, we see x+1 (3) is not present in input
 
 
Input 			----->  	int[]
Output 			----->  	int
 
 
Data Set:
	 Positive: 	Input: 	[1, 2, 3]										---> 		Output = 2
	 Negative: 	Input: 	[1, 1, 3, 3, 5, 5, 7, 7]						---> 		Output = 0
	 
	 Edge: 		Input: 	[1, 1, 2]										---> 		Output = 2
	 Edge: 		Input: 	[1, 1, 2,2,3,3,4,4,5,5,5,6]						---> 		Output = 11
 
Pseudo Code:
	 1. Get the input array and sort it.. Initialise finalCtr=0, ctr=1
	 2. Loop through the array and check for two conditions 1. If num is same and 2. num==num+1 
	 3. If num is same, then increase the ctr
	 4. Else check for x=x+1 .. If equal add the ctr+1 and assign to final ctr
	 3. Return finalCtr
	 
	 
	 1, 2, 3
	 
	 x=x+1
	 
	 
 
 */

public class Week2_HW7_FindXPlusOne {
	
	@Test
	public void positiveTest()
	{
		Assert.assertEquals(2,getXplusOne_Count(new int[] {1, 2, 3}));
		
	}
	
	@Test
	public void negativeTest()
	{
		Assert.assertEquals(0,getXplusOne_Count(new int[] {1, 1, 3, 3, 5, 5, 7, 7}));
	}
	
	@Test
	public void edgeTest()
	{
		Assert.assertEquals(2,getXplusOne_Count(new int[] {1, 1, 2}));
		Assert.assertEquals(11,getXplusOne_Count(new int[] {1, 1, 2,2,3,3,4,4,5,5,5,6}));
		
		Assert.assertEquals(4,getXplusOne_Count(new int[] {1, 1, 2,2}));
	}


	public int getXplusOne_Count(int[] inputArr)
	{
		int totalCount=0, ctr=1;
		
		Arrays.sort(inputArr);
		
		// 1, 1, 2
		
		for(int i=0;i<inputArr.length-1;i++)//i=1
		{
			if(inputArr[i]==inputArr[i+1])//1,1 ... ctr=2
				ctr++;
			else if(inputArr[i]+1==inputArr[i+1])
				{
					totalCount=totalCount+ctr;
					ctr=1;
				}
		}		

		return totalCount;
	}

}

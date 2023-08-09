package foundation.week2.day2;

import java.util.Arrays;
import java.util.Collections;

import org.junit.Assert;
import org.junit.Test;

/* 
Problem statement: 
Alice has n candies, where the ith candy is of type candyType[i]. Alice noticed that she started to gain weight, so she visited a doctor.

The doctor advised Alice to only eat n / 2 of the candies she has (n is always even). Alice likes her candies very much, and she wants to eat the maximum number of different types of candies while still following the doctor's advice.

Given the integer array candyType of length n, return the maximum number of different types of candies she can eat if she only eats n / 2 of them.
 
 
 
Input 			----->  	int[]
Output 			----->  	int
 
 
Data Set:
	 Positive: 	Input:  {1,1,2,2,3,3} 			---> 		Output = 3
	 Negative: 	Input:  {1,1,2,3}				---> 		Output = 2
	 Edge: 		Input: 	{6,6,6,6}				---> 		Output = 1
 
Pseudo Code:
	 1. Get the input array and sort it
	 2. Find the number of unique elements 
	 3. Get the half size by finding n/2
	 4. If size is greater than unique element return unique elements 
	 5. Else return size
 
 */

public class Week2_HW6_DistributeCandies {
	
	@Test
	public void positiveTest()
	{
		Assert.assertEquals(3,getDifferentCandies(new int[] {1,1,2,2,3,3}));
		
	}
	
	
	@Test
	public void negativeTest()
	{
		Assert.assertEquals(2,getDifferentCandies(new int[] {1,1,2,3}));
	}
	
	@Test
	public void edgeTest()
	{
		Assert.assertEquals(1,getDifferentCandies(new int[] {6,6,6,6}));
	}


	public int getDifferentCandies(int[] inputArr)
	{
		Arrays.sort(inputArr);
		
		//Collections.sort(inputArr);
		
		int ctr=1;
		
		//1,1,2,2,3,3
		
		for(int i=0;i<inputArr.length-1;i++)
		{
			if(inputArr[i]!=inputArr[i+1])
				ctr++;			
		}
		
		if(ctr>(inputArr.length/2))
			return inputArr.length/2;
		else
			return ctr;

		
	}

}

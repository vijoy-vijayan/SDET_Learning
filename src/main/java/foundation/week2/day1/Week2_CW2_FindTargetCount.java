package foundation.week2.day1;

import org.junit.Assert;
import org.junit.Test;

/* 
 Problem statement: 
 * Given a sorted array arr[] and a number x, write a function that counts the occurrences of x in arr[]. 
 * arr[] = {1, 1, 2, 2, 2, 2, 3,}, x = 2 output = 4
 
 Input = int[],int; //Let it be integer array for now, int target = x;
 Output = int;
 
 Data Set:
 * Positive {1, 1, 2, 2, 2, 2, 3} target = 2 ---> Output = 2
 * Negative {5,5,6,8,9,9,9} target = 4 ---> Output = 0
 * Edge {1, 1, 1,1} target = 1 ---> Output = 4
 
 Pseudo Code:
 * 1. Get the input array and Target value
 * 2. Loop through the input array and search for target value 
 * 3. Return counter 
 * 

 */

public class Week2_CW2_FindTargetCount {
	
	@Test
	public void positiveTest()
	{
		Assert.assertEquals(4,GetTargetCount(new int[] {1, 1, 2, 2, 2, 2, 3},2 ));
		Assert.assertEquals(1,GetTargetCount(new int[] {0,1,2,},0 ));
	}
	
	@Test
	public void negativeTest()
	{
		Assert.assertEquals(0,GetTargetCount(new int[] {5,5,6,8,9,9,9},4 ));
	}
	
	@Test
	public void edgeTest()
	{
		Assert.assertEquals(4,GetTargetCount(new int[] {1, 1, 1,1},1 ));
	}


	public int GetTargetCount(int[] inputArr, int target)
	{
		int ctr=0;

		for(int i=0;i<inputArr.length;i++)
		{
			if(inputArr[i]==target)			
				ctr++;			
		}		

		return ctr;
	}

}

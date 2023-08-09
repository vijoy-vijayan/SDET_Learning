package foundation.week3.day2;

import java.util.Arrays;
import java.util.Collections;

import org.junit.Test;
import org.junit.Assert;

public class Week3_Day2_HW7_UniqueNumberOfOccurences {

	/*

Link: https://leetcode.com/problems/unique-number-of-occurrences/description/

Problem statement: 	 
Given an array of integers nums, calculate the pivot index of this array.

The pivot index is the index where the sum of all the numbers strictly to the left of the index 
is equal to the sum of all the numbers strictly to the index's right.

If the index is on the left edge of the array, then the left sum is 0 
because there are no elements to the left. This also applies to the right edge of the array.

Return the leftmost pivot index. If no such index exists, return -1.


	Input 			----->  	int[]
	Output 			----->  	int


	Data Set:
		 Positive: 		---> Input: [1,7,3,6,5,6]						Output = 3
		 Negative: 		---> Input: [1,2,3]								Output = -1
		 Edge: 			---> Input: [2,1,-1]							Output = 0


Pseudo Code:
 1. Get the input array and iterate in Nested loop -- Outer loop for Pivot .. LeftSum=0, RIghtSum=0
 2. In the inner loop, write the logic before pivot index and After Pivot Index  .. i> j .. ELse
 3. After the end of inner loop check for the condition of sum matching.. Return Index if matches
 4. Return -1 at the end

	 */

	@Test
	public void positiveTest()
	{
		Assert.assertEquals(true, isOccurencesUnique(new int[] {1,2,2,1,1,3}));

	}

	//	@Test
	//	public void negativeTest()
	//	{
	//		Assert.assertEquals("abbdcfdhe", replaceAllDigits("a1b2c3d4e"));
	//	}
	//
	//	@Test
	//	public void edgeTest()
	//	{
	//		Assert.assertEquals("ac", replaceAllDigits("a2"));
	//	}

	public boolean isOccurencesUnique(int[] inputArr)	
	{

		Arrays.sort(inputArr);

		int ctr=1;

		for (int i = 0;i<inputArr.length-1;i++) {	

			if(inputArr[i]!=inputArr[i+1])
				ctr++;

		}

		int[] resultArr=new int[ctr];

		ctr=1;

		int rowCtr=0;

		for (int i = 0;i<inputArr.length-1;i++) {				
			
			if(inputArr[i]!=inputArr[i+1])
			{
				resultArr[rowCtr]=ctr;
				rowCtr++;
				ctr=0;				
			}
			
			
			
			ctr++;
			
			if(i==inputArr.length-2)
				resultArr[rowCtr]=ctr;
				
		}

		Arrays.sort(resultArr);

		for (int i = 0;i<resultArr.length-1;i++) {	

			if(resultArr[i]==resultArr[i+1])
				return false;

		}

		return true;
	}

}


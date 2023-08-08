package week3.day2;

import java.util.Arrays;

import org.junit.Test;
import org.junit.Assert;

public class HW4_PlusOne {

	/*

	Problem statement: 	 
	You are given a large integer represented as an integer array digits, 
	where each digits[i] is the ith digit of the integer. 
	The digits are ordered from most significant to least significant in left-to-right order. 
	The large integer does not contain any leading 0's.

	Increment the large integer by one and return the resulting array of digits.


	Input 			----->  	int[]
	Output 			----->  	int[]


	Data Set:
		 Positive: 		---> Input: [1,2,3]						Output = [1,2,4]
		 Negative: 		---> Input: [4,3,2,1]					Output = [4,3,2,2]
		 Edge: 			---> Input: [9]							Output = [1,0]
		 Edge: 			---> Input: [1,2,9]						Output = [1,3,0]


Pseudo Code:
 1. Get the input array and iterate in loop
 2. Read a digit at a time from right and check for the logic
 3. if last digit <9 .. Assign the value lastDigit+1 to current position of array and return
 4. Continue logic for all digits.. Create a new array and return if porgram comes out of loop 

	 */
	
	@Test
	public void positiveTest()
	{
		Assert.assertArrayEquals(new int[] {1,2,4}, getArrayPlusOne(new int[] {1,2,3}));
		Assert.assertArrayEquals(new int[] {1,1}, getArrayPlusOne(new int[] {1,0}));
		
//		System.out.println(findSecondLargestDigit("Sachin10Tendulkar"));

	}
//
//	@Test
//	public void negativeTest()
//	{
//		Assert.assertEquals(-1, findSecondLargestDigit("Sourav99"));
//	}
//
	@Test
	public void edgeTest()
	{
		Assert.assertArrayEquals(new int[] {1,0}, getArrayPlusOne(new int[] {9}));
		
		Assert.assertArrayEquals(new int[] {1,3,0}, getArrayPlusOne(new int[] {1,2,9}));
	}

	public int[] getArrayPlusOne(int[] inpArr)
	{
			for (int i = inpArr.length-1; i >= 0; i--) {// 1,9,9
				if(inpArr[i]<9)
				{
					inpArr[i]=inpArr[i]+1;
					return inpArr;
				}
				else
					inpArr[i]=0;
			}			
			
			int[] inpArrNew = new int[inpArr.length+1];
			inpArrNew[0]=1;
			
			return inpArrNew;


	}

}


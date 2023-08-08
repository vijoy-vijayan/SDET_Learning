package week5.practice;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;



public class HW12_ColorOfChessBoardSquare {

	/* 
Problem statement: 	 
A self-dividing number is a number that is divisible by every digit it contains.

For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
A self-dividing number is not allowed to contain the digit zero.

Given two integers left and right, return a list of all the self-dividing numbers in the range [left, right]

	Example 1:

		Input: jewels = "aA", stones = "aAAbbbb"
		Output: 3

	Input 			----->  	int, int
	Output 			----->  	boolean


	Data Set:
		 Positive: 	---> Input: 9, 12		Output = [9,11,12]
		 Positive: 	---> Input: 100, 125		Output = [111, 112, 121, 122, 124]
		 Negative: 	---> Input: 15, 19		Output = []
		 Edge: 		---> Input: 11,12		Output = [11,12]

	Pseudo Code:
		 1. Get the stones and Jewels .. Initialize Ctr=0
		 2. Get one stone from the given String - Stones and find its presence in the Jewels using String methods
		 3. Increase the ctr if there is a match
		 4. Repeat for all stones that you have 
		 5. Return the counter


	 */

//	@Test
//	public void positiveTest()
//	{
//		Assert.assertEquals(3,getStoneCount("aA", "aAAbbbb"));
//	}
//
//	@Test
//	public void negativeTest()
//	{
//		Assert.assertEquals(0,getStoneCount("pa", "Tester"));
//	}

	@Test
	public void edgeTest()
	{
//		List<Integer> check=[1,2,3];
//		Assert.assertArrayEquals(Arrays.asList([11,12]),getSelfDividingList(11,12));
		
		
		
		System.out.println(isChessSquareWhite("g5"));
		
		System.out.println(isChessSquareWhite_updated("g5"));
		
		
	}



	public boolean isChessSquareWhite(String coordinates)
	{
		boolean flag=false;
		
		char[] charArr= {'a','b','c','d','e','f','g','h'};
		
		char findRow=coordinates.charAt(0);
		
		int temp=0;
		
		for (int i = 0; i < charArr.length; i++) {
			
			if(charArr[i]==findRow)
				temp=i;		
			
		}
		System.out.println(temp);
		
		
		temp=temp+coordinates.charAt(1)-48;
		
		System.out.println(temp);

		return temp%2==0 ;
		
		
	}
	
	public boolean isChessSquareWhite_updated(String coordinates)
	{
		return (coordinates.charAt(0)+coordinates.charAt(1))%2==1;
	}
	
	

}

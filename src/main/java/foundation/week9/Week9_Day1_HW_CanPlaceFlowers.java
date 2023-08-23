package foundation.week9;

import org.junit.Test;

import java.util.Arrays;

import org.junit.Assert;


public class Week9_Day1_HW_CanPlaceFlowers{

	/* 
Leetcode link: https://leetcode.com/problems/can-place-flowers/

Problem statement: 	
You have a long flowerbed in which some of the plots are planted, and some are not. 
However, flowers cannot be planted in adjacent plots.

Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, 
return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.

	Input 			----->  int[],int
	Output 			----->  boolean


	Data Set:
		 Positive: 	---> Input: [1,0,0,0,1],1			Output =  true
		 Negative:  ---> Input: [1,0,0,0,1],2			Output =  false
		 Edge: 		---> Input: [0,0,0],2				Output =  true


	Pseudo Code:
	1. Get the flower bed array and the new flowers - n
	2. Iterate through the array and check for the adjacent empty spots
	3. from current postion - n,  left and right position has to be checked for 0--> n-1 , n+1 
	4. Decrease the new flowers if the above condition is true
	5. for edge condition i=0 and i= arr.lenght-1 one side need not be considered
	6. After iteration, CHeck for the flower count and return true if its zero


	 */

	@Test	
	public void positiveTest()
	{
		Assert.assertEquals(true, canPlantFlowers(new int[]{1,0,0,0,1},1));
	}


	@Test	
	public void negativeTest()
	{
		Assert.assertEquals(false, canPlantFlowers(new int[]{1,0,0,0,1},2));
	}

	@Test	
	public void edgeTest()
	{
		Assert.assertEquals(true, canPlantFlowers(new int[]{0,0,0},2));
		
		Assert.assertEquals(true, canPlantFlowers(new int[]{0},1));
	}


	public boolean canPlantFlowers(int[] flowerbed, int n) {

		if(n==0)
			return true;
		
		if(flowerbed.length==1)
		{
				if(flowerbed[0]==0)
					return true;
				else
					return false;
			
		}

		for (int i = 0; i < flowerbed.length; i++) {

			if(i==0)
			{
				if((flowerbed[i]==0)&&(flowerbed[i+1]==0))
				{
					n--;
					i++;
				}
			}
			else if(i==flowerbed.length-1)
			{
				if((flowerbed[i]==0)&&(flowerbed[i-1]==0))
					n--;
			}
			else if(flowerbed[i]==0)// 
			{
				if((flowerbed[i-1]==0)&&(flowerbed[i+1]==0))
				{
					n--;
					i++;
				}
			}

			if(n==0)
				return true;

		}

		return false;

	}


}

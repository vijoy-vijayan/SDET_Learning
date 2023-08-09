package foundation.week5;

import org.junit.Test;

import org.junit.Assert;




public class HW4_DayOfWeek {

	/* 
	Problem statement: 	 
There is a function signFunc(x) that returns:

1 if x is positive.
-1 if x is negative.
0 if x is equal to 0.
You are given an integer array nums. Let product be the product of all values in the array nums.

Return signFunc(product).


	 */

//	@Test
//	public void positiveTest()
//	{
//		Assert.assertEquals(1,getSignOfProductArray(new int[] {-1,-1,-1, -1}));
//		Assert.assertEquals(1,getSignOfProductArray(new int[] {-1,-2,-3,-4,3,2,1}));
//		Assert.assertEquals(0,getSignOfProductArray(new int[] {1,5,0,2,-3}));
//		Assert.assertEquals(-1,getSignOfProductArray(new int[] {-1,1,-1,1,-1}));
//		
//	}
//
//	@Test
//	public void negativeTest()
//	{
//		Assert.assertEquals(0,getSignOfProductArray(new int[] {0}));
//	}

	@Test
	public void edgeTest()
	{
//		Assert.assertEquals(1,getSignOfProductArray(new int[] {1,1,-1,-1, 100}));
		
		Assert.assertEquals(-1,getSignOfProductArray(new int[] {41,65,14,80,20,10,55,58,24,56,28,86,96,10,3,84,4,41,13,32,42,43,83,78,82,70,15,-41}));
	}





	public int getSignOfProductArray(int[] nums)
	{
		int ctr=0;
		for(int i=0; i<nums.length;i++)
		{
			if(nums[i]==0)
				return 0;
			
			if(nums[i]<0)
				ctr++;
			
			
		}


		return (ctr%2==0)?  1:-1;
	}




}

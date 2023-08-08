package week2.day1;

import org.junit.Assert;
import org.junit.Test;

/* 

Problem Statement:
	 You have n coins and you want to build a staircase with these coins. 
	 The staircase consists of k rows where the ith row has exactly i coins. 
	 The last row of the staircase may be incomplete.	
	 Given the integer n, return the number of complete rows of the staircase you will build.
 
 
 Input  ----> int
 Output ----> int
 
 Data Set:
 	Positive 	----> 		Input : 8 		Output = 3
 	Negative 	---->		Input : 0		Output = 0
 	Edge 	  	---->		Input : 6 		Output = 3
 
 Pseudo Code:
	 1. Get the number of coins
	 2. Initiate the counter for number of Rows as 0
	 3. Build step if the number of coins > 0
	 4. Increase the counter of Rows
	 5. Update the remaining coins value after each iteration as remaining coins = remainingCoins-completedRows;
	 6. Iterate until the remaining coins <=0
	 7. Return completedSteps 
 
 */

public class Week2_CW3_ArrangingCoins {
	
	@Test
	public void positiveTest()
	{
		Assert.assertEquals(9,FindRowsInStairCase(50));
		Assert.assertEquals(3,FindRowsInStairCase(8));
		
	}
	
	@Test
	public void negativeTest()
	{
		Assert.assertEquals(0,FindRowsInStairCase(0));
	}
	
	@Test
	public void edgeTest()
	{
		Assert.assertEquals(3,FindRowsInStairCase(6));
		Assert.assertEquals(4,FindRowsInStairCase(10));
	}


	public int FindRowsInStairCase(int noOfCoins)
	{
		int completedRows=0;
		
		while(noOfCoins>=0)
		{
			completedRows++;
			noOfCoins=noOfCoins-completedRows;	
			
			for(int i=0;i<completedRows;i++)
				System.out.print("*");				
			
			System.out.println();
		}		
		
		return completedRows-1;
	}

}

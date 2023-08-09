package foundation.week5;

import org.junit.Test;

import org.junit.Assert;




public class HW2_WaterBottles {

	/* 
	Problem statement: 	 
There are numBottles water bottles that are initially full of water. You can exchange numExchange empty water bottles from the market with one full water bottle.

The operation of drinking a full water bottle turns it into an empty bottle.

Given the two integers numBottles and numExchange, return the maximum number of water bottles you can drink.	
	Example 1:

		Input: jewels = "aA", stones = "aAAbbbb"
		Output: 3

	Input 			----->  	String, String
	Output 			----->  	boolean


	Data Set:
		 Positive: 	---> Input: "aA", "aAAbbbb"		Output = 3
		 Negative: 	---> Input: "pa", "Tester"		Output = 0
		 Edge: 		---> Input: "abC", "CbaabC"		Output = 6

	Pseudo Code:
		 1. Get the stones and Jewels .. Initialize Ctr=0
		 2. Get one stone from the given String - Stones and find its presence in the Jewels using String methods
		 3. Increase the ctr if there is a match
		 4. Repeat for all stones that you have 
		 5. Return the counter


	 */

	@Test
	public void positiveTest()
	{
		Assert.assertEquals(19,getMaximumWaterBottle_Enhanced(15, 4));
	}
	
	//	
	//	@Test
	//	public void negativeTest()
	//	 {
	//		Assert.assertEquals(0,getStoneCount("pa", "Tester"));
	//	 }
	//	
	//	@Test
	//	public void edgeTest()
	//	 {
	//		Assert.assertEquals(6,getStoneCount("abC", "CbaabC"));
	//	 }
	//	


	public int getMaximumWaterBottle(int numBottles, int numExchange)
	{
		int totalConsumedBottles=0,remainingBottles=0,emptyBottles=0;

		while(true)
		{
			totalConsumedBottles=totalConsumedBottles+numBottles;

			emptyBottles=numBottles+remainingBottles;

			if(emptyBottles/numExchange>0)
			{
				remainingBottles=emptyBottles%numExchange;
				numBottles=emptyBottles/numExchange;

			}
			else
				break;			

		}

		return totalConsumedBottles;
	}

	public int getMaximumWaterBottle_Enhanced(int numBottles, int numExchange)
	{
		
		if(numBottles<numExchange)
			return numBottles;
		
		int totalConsumedBottles=0,remainingBottles=0,emptyBottles=numBottles;

		while(emptyBottles/numExchange>0)
		{
			
			totalConsumedBottles=totalConsumedBottles+numBottles;

			emptyBottles=numBottles+remainingBottles;

			remainingBottles=emptyBottles%numExchange;
			numBottles=emptyBottles/numExchange;

		}


		return totalConsumedBottles;
	}

}

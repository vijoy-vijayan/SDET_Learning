package foundation.week2.day1;

import org.junit.Assert;
import org.junit.Test;

class Week2_HW3_StockMaximumProfit {
	
	/* Question: 
You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0
	 * 
	 * Input: int array, int
	 * 
	 * Output : int array
	 * 
	 * Pseudo code:
	 * Initialize the variable profit as 0 and the buy variable with the maximum value
	 * Iterate through the prices array
	 * If the current price is less than buy value assign the same to buy variable
	 
	 */

	@Test
	void Positivetest() {
		Assert.assertEquals(true,getTargetSum(13));
				
	}
	
	@Test
	void Negativetest() {
		Assert.assertEquals(false,getTargetSum(6));
	}
	
	@Test
	void Edgetest() {
		Assert.assertEquals(true,getTargetSum(1));
	}
	
	
	public int getTargetSum(int input)
	{
		
		int profit =0;
		
		
		
		return profit;
		
	}

}

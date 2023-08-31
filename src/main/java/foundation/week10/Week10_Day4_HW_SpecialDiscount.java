package foundation.week10;

import org.junit.Assert;
import org.junit.Test;


public class Week10_Day4_HW_SpecialDiscount {

	/* 
Leetcode link: https://leetcode.com/problems/final-prices-with-a-special-discount-in-a-shop/

Problem statement: 	
You are given an integer array prices where prices[i] is the price of the ith item in a shop.

There is a special discount for items in the shop. If you buy the ith item,
then you will receive a discount equivalent to prices[j] where j is the minimum index
such that j > i and prices[j] <= prices[i]. Otherwise, you will not receive any discount at all.

Return an integer array answer where answer[i] is the final price you will pay for the ith item of the shop,
considering the special discount.

	Input 			----->  int[]
	Output 			----->  int[]

	Data Set:
		 Positive: 	---> Input: [10,5,2,25,34]					Output =  [5,3,2,25,34]
		 Positive: 	---> Input: [28,24,20,16,16]					Output =  [4,4,4,0,16]
		 Negative: 	---> Input: [1,5,10]						Output =  [1,5,10]
		 Edge:  	---> Input: [100,10]						Output =  [90,10]
		 Edge:  	---> Input: [10000]							Output =  [10000]

	Pseudo Code:
	1. Get the integer array and initiate the output array with same length
	2. Loop through the input array with i=0 and check for its adjacent price with inner loop start with i+1
	3. Compare inp[i] with the condition if inp[i]>inp[j].. Update res[i]=inp[i]-inp[j]
	4. Continue for all items
	5. Add the last element in the result array directly as it cannot have any discount
	6. Return result at the end

	 */

	@Test
	public void positiveTest()
	{

		Assert.assertArrayEquals(new int[] {5,3,2,25,34}, getSpecialDiscount(new int[] {10,5,2,25,34}));
		Assert.assertArrayEquals(new int[] {4,4,4,0,16}, getSpecialDiscount(new int[] {28,24,20,16,16}));
		Assert.assertArrayEquals(new int[] {1,5,10}, getSpecialDiscount(new int[] {1,5,10}));
		Assert.assertArrayEquals(new int[] {90,10}, getSpecialDiscount(new int[] {100,10}));
		Assert.assertArrayEquals(new int[] {10000}, getSpecialDiscount(new int[] {10000}));

	}

	/*
	Negative: 	---> Input: [1,5,10]						Output =  [1,5,10]
	Edge:  	---> Input: [100,10]						Output =  [90,10]
	Edge:  	---> Input: [10000]							Output =  [10000]
	@Test
	public void negativeTest()
	{
		Assert.assertEquals("Why, are you", getSentenceAfterTruncating("Why, are you coming late to office? ",3));

	}
	@Test
	public void edgeTest()
	{
		Assert.assertEquals("Java", getSentenceAfterTruncating("Java",1));
	}


*/

	public int[] getSpecialDiscount(int[] prices) {



		for (int eachPrice = 0; eachPrice < prices.length; eachPrice++) {
			for (int adjPrice = eachPrice+1; adjPrice < prices.length; adjPrice++) {

				if(prices[eachPrice]>=prices[adjPrice]) {
					prices[eachPrice] = prices[eachPrice] - prices[adjPrice];
					break;
				}
				else {

				}
			}
		}

		return prices;
	}

}


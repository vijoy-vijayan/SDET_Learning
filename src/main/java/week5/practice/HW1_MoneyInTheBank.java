package week5.practice;

import org.junit.Test;

import org.junit.Assert;




public class HW1_MoneyInTheBank {

	/* 
	Problem statement: 	 
	You're given strings jewels representing the types of stones that are jewels, 
	and stones representing the stones you have. Each character in stones is a type of stone you have. 
	You want to know how many of the stones you have are also jewels.

	Letters are case sensitive, so "a" is considered a different type of stone from "A".
	
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
		Assert.assertEquals(3,getStoneCount("aA", "aAAbbbb"));
	 }
	
	@Test
	public void negativeTest()
	 {
		Assert.assertEquals(0,getStoneCount("pa", "Tester"));
	 }
	
	@Test
	public void edgeTest()
	 {
		Assert.assertEquals(6,getStoneCount("abC", "CbaabC"));
	 }
	
	
	
	public int getStoneCount(String jewels, String stones )
	{
		int ctr=0;
		
		for (int i = 0; i < stones.length(); i++) {
			if(jewels.indexOf(stones.charAt(i))>=0)
				ctr++;			
		}
		
		return ctr;
	}
	
}

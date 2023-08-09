package foundation.week3.day2;

import org.junit.Test;

import org.junit.Assert;




public class Week3_Day2_HW1_JewelsAndStones {

	/* 
Link: https://leetcode.com/problems/jewels-and-stones/description/

Problem statement: 	 

Hercy wants to save money for his first car. He puts money in the Leetcode bank every day.

He starts by putting in $1 on Monday, the first day. Every day from Tuesday to Sunday, he will put in $1 more than the day before. On every subsequent Monday, he will put in $1 more than the previous Monday.
Given n, return the total amount of money he will have in the Leetcode bank at the end of the nth day.
	
Example 3:

Input: n = 20
Output: 96
Explanation: After the 20th day, the total is (1 + 2 + 3 + 4 + 5 + 6 + 7) + (2 + 3 + 4 + 5 + 6 + 7 + 8) + (3 + 4 + 5 + 6 + 7 + 8) = 96.
	 
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
		Assert.assertEquals(96,calculateMoneyInTheBank(20));
		
		Assert.assertEquals(37,calculateMoneyInTheBank(10));
	 }
	
	@Test
	public void negativeTest()
	 {
		Assert.assertEquals(3,calculateMoneyInTheBank(2));
	 }
//	
	@Test
	public void edgeTest()
	 {
		Assert.assertEquals(28,calculateMoneyInTheBank(7));
	 }
	
	
	
	public int calculateMoneyInTheBank(int n)
	{
		int ctr=0, quotient=n/7, remainder=n%7, endOfWeek=7;
		
		
		for (int i = 0; i < quotient+1; i++) {
			
			if(i==quotient)
				endOfWeek=remainder;
			
			for (int j = 1; j <= endOfWeek; j++) {
				ctr=ctr+i+j;
			}					
		}
		
		return ctr;
	}
	
}

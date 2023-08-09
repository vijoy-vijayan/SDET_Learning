package foundation.week2.day2;

import org.junit.Assert;
import org.junit.Test;

/* 
Link: https://leetcode.com/problems/power-of-three/description/

Problem statement: 
 
Given an integer n, return true if it is a power of three. Otherwise, return false.

An integer n is a power of three, if there exists an integer x such that n == 3x.
 
Input 			----->  	int
Output 			----->  	boolean
 
 
Data Set:
	 Positive: 	---> Input: 27		Output = true
	 Negative: 	---> Input: -27		Output = false
	 Edge: 		---> Input: 1		Output = true
 
Pseudo Code:
	 1. Iterate through the the remainder as remainder is the deciding factor.. Condition - Remainder == 0 always
	 2. Divide the input num by 3 for all iteration and check for remainder
	 3. Return false inside the loop if the remainder is greater than 0
	 4. Handle the condition for 1 in the return statement . 
	 5. If final num==1 return true as 3^0==1 which will evaluate to true in remainder condtion
	 6. Return with expression of boolean
 
 */

public class Week2_HW10_POwerof3 {
	
	@Test
	public void positiveTest()
	{
		Assert.assertEquals(true,getTargetSum(27));
		Assert.assertEquals(false,getTargetSum(30));
		
	}
	
	@Test
	public void negativeTest()
	{
		Assert.assertEquals(false,getTargetSum(-27));
	}
	
	@Test
	public void edgeTest()
	{
		Assert.assertEquals(true,getTargetSum(1));
	}


	public boolean getTargetSum(int inputNum)
	{
		if (inputNum<1)
			return false;
		
		while(inputNum%2==0)
			inputNum=inputNum/2;
		
		return inputNum==1;
	}

}

package foundation.week2.day2;

import org.junit.Assert;
import org.junit.Test;

/* 
Link: https://leetcode.com/problems/climbing-stairs/

Problem statement: You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 
 
 
Input 			----->  	int
Output 			----->  	int
 
 
Data Set:
	 Positive: 	Input: 	2		---> 		Output = 2
	 Negative: 	Input: 	3		---> 		Output = 3
	 Edge: 		Input: 	1		---> 		Output = 1
 
Pseudo Code:
	 1. Possibilities of f(1) --> FirstStep=1, f(2) --> SecondStep =2 ((1,1),(2))
	 2. If n=3 ...  From Second Step, its like one step to Step3 f(1) .. From first step it takes two steps to Third step f(2)
	 3. f(3) = f(1)+f(2) = 1+2 = 3 --> f(n) = f(n-1)+f(n-2)
	 4. Create a variable for FIrst and Second Step firstSTep=1.. SecondStep=2 
	 5. Iterate through the loop and find the current step possibilities using formula --> previous step possibilty + Previous Second STep possilbity
	 6. return final num
 
 */

public class Week2_HW7_ClimbingStairs {
	
	@Test
	public void positiveTest()
	{
		Assert.assertEquals(3,getPossibilities_ClimbingStairs_withoutArray(3));
		Assert.assertEquals(8,getPossibilities_ClimbingStairs_withoutArray(5));
		
	}
	
//	@Test
//	public void negativeTest()
//	{
//		Assert.assertEquals(1,1);
//	}
//	
//	@Test
//	public void edgeTest()
//	{
//		Assert.assertEquals(1,1);
//	}


	public int getPossibilities_ClimbingStairs(int num)
	{
		int firstPreviousStep=1, secondPreviousStep=2;
		
		int tempArr[]=new int[num+1];
		
		tempArr[1]=firstPreviousStep;
		tempArr[2]=secondPreviousStep;
		
		for(int i=3;i<=num;i++)
		{
			tempArr[i]=tempArr[i-1]+tempArr[i-2];
		}	
		
		return tempArr[num];

		
	}
	
	public int getPossibilities_ClimbingStairs_withoutArray(int num)
	{
		int firstPreviousStep=1, secondPreviousStep=2;
		
		int totalPossibility = 1,temp;
		
		if(num==0 || num==1)
			return totalPossibility;
		
		for(int i=3;i<=num;i++)
		{
			totalPossibility=secondPreviousStep+firstPreviousStep;
			temp=secondPreviousStep;
			secondPreviousStep=totalPossibility;
			firstPreviousStep=temp;			
		}	
		
		return totalPossibility;
		
	}

}

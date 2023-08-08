package week5.practice;

import org.junit.Test;

import java.util.Arrays;

import org.junit.Assert;

public class CW_InternalConnect_8thAug {

	/* 

Input: n = 4 == 0 Week  4 Days
Output: 10
Explanation: After the 4th day, the total is 1 + 2 + 3 + 4 = 10.
Example 2:

Input: n = 10 == 1 Week 3 Days... 2 Weeks
Output: 37
Explanation: After the 10th day, the total is (1 + 2 + 3 + 4 + 5 + 6 + 7) + (2 + 3 + 4) = 37. Notice that on the 2nd Monday, Hercy only puts in $2.
Example 3:

Input: n = 20 == 2 Weeks 6 days...3 (0(7),1(7),2 (6)
Output: 96
Explanation: After the 20th day, the total is (1 + 2 + 3 + 4 + 5 + 6 + 7) + (2 + 3 + 4 + 5 + 6 + 7 + 8) + (3 + 4 + 5 + 6 + 7 + 8) = 96.


int res=0;

for(week=0 to n) --> Week COunter

for(i=1 to 7) --> Day counter

Week1:
(1,2,3,4,5,6,7)+0 : Expected : 1,2,3,4,5,6,7 

res=res+i+week;

Week2:

(1,2,3,4,5,6,7)+1 : Expected : 2,3,4,5,6,7,8 

Week3:

(1,2,3,4,5,6,7)+2 : Expected : 3,4,5,6,7,8,9

Input :  int
Output : int

Pseudo code:
1. Get the n and initialise the res as 0
2. Calculate the number of Weeks for the given ... n/7 
3. Created Nested For loop .. Outer loop - Track Week; Inner loop - TO Track days
4. Add the logic for consolidating results... res=res+i+week;
5. Return the res

*/

	@Test	
	public void positiveTest()
	{
//		Assert.assertEquals(9, getSecondLargestDigit(new int[] {7,3,4,2,9,6,10}));
//
//		Assert.assertEquals(6, getSecondLargestDigit(new int[] {9,2,5,0,6}));
		
		timeComplexity(5);
	}


//	@Test	
//	public void negativeTest()
//	{
//		Assert.assertEquals(0, getSecondLargestDigit(new int[] {2,2,2,2}));
//	}
//
//
//	@Test	
//	public void edgeTest()
//	{
//		Assert.assertEquals(0, getSecondLargestDigit(new int[] {9}));
//	}

	public int calculateMoney(int n)
	{
		
		int res=0;
		int noOfWeeks=n/7,noOfRemainingDays=n%7;//noOfWeeks=1; remainingDays=3;
		
		int weekEndDay=7;
		
		for (int week = 0; week < noOfWeeks+1; week++) {//2 ... 0, 1
			
			if(week==noOfWeeks)
				weekEndDay=noOfRemainingDays;
			
			for (int days = 1; days <=weekEndDay; days++) {// week = 1
				res=res+week+days;	//1+2+...7...28	...... 2+3+4+5+6+7+8	==28+35=63	
			}
			
		}
		
		System.out.println(res);
		
		return res;
	}
	
	public void timeComplexity(int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.println(i);
			
			for(int j=0;j<n;j++)
			{
				System.out.println(j);
			}
		}
		
		
		//o(n)* o(n) = n*n = n square 
		// n+n= 2(n)
	}	//2+2+2=4 == 3(2)
		//3*3 == 9 == 3 square




}

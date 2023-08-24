package foundation.week9;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;


public class Week9_Day4_MentoGiven_EmployeeTargetHours {

	/* 
Leetcode link: https://leetcode.com/problems/number-of-employees-who-met-the-target/description/

Problem statement: 	
There are n employees in a company, numbered from 0 to n - 1.
Each employee i has worked for hours[i] hours in the company.

The company requires each employee to work for at least target hours.

You are given a 0-indexed array of non-negative integers hours of length n and a non-negative integer target.

Return the integer denoting the number of employees who worked at least target hours.

	Input 			----->  int[],int
	Output 			----->  int


	Data Set:
		 Positive: 	---> Input: [5,2,6,8],5						Output =  3
		 Positive: 	---> Input: [2,2,2],1						Output =  3
		 Negative:  ---> Input: [5,5,5,6],7						Output =  0
		 Edge: 		---> Input: [8],7							Output =  1
		 Edge: 		---> Input: [0],5							Output =  0
		 Edge: 		---> Input: [8,8],0							Output =  2


	Pseudo Code:
	1. Get the input array hours,target and initialize ctr=0
	2. Iterate through the loop from 0 to hours.length
	4. Check for condition hours[i]>=target--> ctr++;
	3. Repeat step 3 for all the iteration and update ctr accordingly
	5. return ctr
	 */

	@Test	
	public void positiveTest()
	{

		Assert.assertEquals(3, getTargetReachedEmployees(new int[]{2,2,2},1));
		Assert.assertEquals(3, getTargetReachedEmployees(new int[]{5,2,6,8},5));
	}


	@Test	
	public void negativeTest()
	{
		Assert.assertEquals(0, getTargetReachedEmployees(new int[]{5,5,5,6},7));
	}

	@Test	
	public void edgeTest()
	{
		Assert.assertEquals(1, getTargetReachedEmployees(new int[]{8},7));
		Assert.assertEquals(0, getTargetReachedEmployees(new int[]{0},5));
		Assert.assertEquals(1, getTargetReachedEmployees(new int[]{8},0));
	}


	public int getTargetReachedEmployees(int[] hours, int target) {//O(N)
		
		int ctr=0;
		for (int eachHours:hours) //O(N)
		{
			if (eachHours >= target)
				ctr++;
		}
		return ctr;
	}

}

package foundation.week12;

import org.junit.Assert;
import org.junit.Test;


public class Week12_Day3_MentorGiven_TargetEmployees {

	/* 
Leetcode link: https://leetcode.com/problems/number-of-employees-who-met-the-target

Problem statement: 	
There are n employees in a company, numbered from 0 to n - 1. Each employee i has worked for hours[i] hours in the company.

The company requires each employee to work for at least target hours.

You are given a 0-indexed array of non-negative integers hours of length n and a non-negative integer target.

Return the integer denoting the number of employees who worked at least target hours.


	Input 			----->  int[]
	Output 			----->  int

	Data Set:
		 Positive: 	---> Input: [1,3,2,4,5],5			    Output =  1
		 Negative: 	---> Input: [1,2,3,4,5],6			    Output =  0
		 Edge: 	    ---> Input: [3,6,5,4,1],1			    Output =  5
		 Edge: 	    ---> Input: [1],1				        Output =  0



	Pseudo code:
    1. Get the input hours and Target. Initialise ctr=0
    2. Iterate through the array and check for the elemnts against Target
    3. Increase the ctr, if arr[i]>=Target
    4. Return ctr at the end


	 */

    @Test
    public void allTests() {

        //Positive
        Assert.assertEquals(1, numberOfEmployeesWhoMetTarget(new int[]{1,3,2,4,5},5));

        //Negative
        Assert.assertEquals(0, numberOfEmployeesWhoMetTarget(new int[]{1,2,3,4,5},6));
        //Edge
        Assert.assertEquals(5, numberOfEmployeesWhoMetTarget(new int[]{3,6,5,4,1},1));
        Assert.assertEquals(1, numberOfEmployeesWhoMetTarget(new int[]{1},1));

    }

    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int ctr=0;
        for(int i=0;i<hours.length;i++)
        {
            if(hours[i]>=target)
                ctr++;
        }
        return ctr;
    }
}


package foundation.week12;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class Week12_Day3_MentorGiven_GreatestNoOfCandies {

	/* 
Leetcode link: https://leetcode.com/problems/number-of-employees-who-met-the-target

Problem statement: 	
There are n employees in a company, numbered from 0 to n - 1. Each employee i has worked for hours[i] hours in the company.

The company requires each employee to work for at least target hours.

You are given a 0-indexed array of non-negative integers hours of length n and a non-negative integer target.

Return the integer denoting the number of employees who worked at least target hours.


	Input 			----->  int[],int
	Output 			----->  boolean[]


	Data Set:
		 Positive: 	---> Input: [1,3,2,4,5],1	    Output =  [false,false,false,true,true]
		 Negative: 	---> Input: [1,2,3],5			Output =  [true,true,true]
		 Edge: 	    ---> Input: [5],2				Output =  [true]


Pseudo code:
    1. Get the input array of Candies and Target
    2. Iterate through the array once and find the kid with most number of candies --> max
    3. Iterate the array again and check the target + arr[i] >= max
    4. If true --> add true to finalList.. Else False
    5. Return List at the end.


	 */

    @Test
    public void allTests() {

        /*
        Positive: 	---> Input: [1,3,2,4,5],1	    Output =  [false,false,false,true,true]
		 Negative: 	---> Input: [1,2,3],5			Output =  [true,true,true]
		 Edge: 	    ---> Input: [5],2				Output =  [true]
         */

        //Positive
        List<Boolean> booleans = kidsWithCandies(new int[]{1, 3, 2, 4, 5}, 1);
        Boolean[] actual = booleans.toArray(new Boolean[0]);

        Boolean[] expected= {false,false,false,true,true};

        Assert.assertArrayEquals(expected, actual);

        //Negative
        booleans = kidsWithCandies(new int[]{1,2,3}, 5);
        actual = booleans.toArray(new Boolean[0]);

        expected= new Boolean[]{true,true, true};

        Assert.assertArrayEquals(expected, actual);

        //Edge
        booleans = kidsWithCandies(new int[]{5}, 2);
        actual = booleans.toArray(new Boolean[0]);

        expected= new Boolean[]{true};

        Assert.assertArrayEquals(expected, actual);

    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> result=new ArrayList<Boolean>();

        int max=0;
        for(int i=0;i<candies.length;i++)
        {
            if(candies[i]>max)
                max=candies[i];
        }

        for(int j=0;j<candies.length;j++)
        {
            if((candies[j]+extraCandies)>=max)
                result.add(true);
            else
                result.add(false);
        }


        return result;
    }
}


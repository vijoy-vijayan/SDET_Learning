package foundation.week12;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;


public class Week12_Day1_HW_HeightChecker {

	/* 
Leetcode link: https://leetcode.com/problems/height-checker/description/

Problem statement: 	
A school is trying to take an annual photo of all the students. The students are asked to stand in a single file line in non-decreasing order by height. Let this ordering be represented by the integer array expected where expected[i] is the expected height of the ith student in line.

You are given an integer array heights representing the current order that the students are standing in. Each heights[i] is the height of the ith student in line (0-indexed).

Return the number of indices where heights[i] != expected[i].


	Input 			----->  int[]
	Output 			----->  int

	Data Set:
		 Positive: 	---> Input: [1,3,2,4,5]			    Output =  2
		 Negative: 	---> Input: [1,2,3,4,5]			    Output =  0
		 Edge: 	    ---> Input: [3,6,5,4,1]			    Output =  5
		 Edge: 	    ---> Input: [1]				        Output =  0



	Pseudo Code:
	1. Get the input array and copy the elements to new array
	2. Sort the elements of New array
	3. Itreate through an array and Cmpare elements of given array with sorted new array
	4. Increase the ctr if elemnts are not matching
	5. return ctr at the end



	Learning: Need to learn the methods of Arrays class

	 */

    @Test
    public void allTests() {

        //Positive
        Assert.assertEquals(2, heightChecker(new int[]{1, 3, 2, 4, 5}));

        //Negative
        Assert.assertEquals(0, heightChecker(new int[]{1, 2, 3, 4, 5}));

        //Edge
        Assert.assertEquals(5, heightChecker(new int[]{3, 6, 5, 4, 1}));
        Assert.assertEquals(0, heightChecker(new int[]{1}));

    }

    public int heightChecker(int[] heights) {//O(N LogN)

        int[] expected = Arrays.copyOf(heights, heights.length); // Create a copy of heights
        Arrays.sort(expected); // Sort the expected array in non-decreasing order

        int count = 0;

        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expected[i]) {
                count++;
            }
        }

        return count;
    }
}


package foundation.week13;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;


public class Week13_Day1_HW_MinimumDifference {

	/* 
Leetcode link: https://leetcode.com/problems/minimum-difference-between-highest-and-lowest-of-k-scores/description/

Problem Statement:
You are given a 0-indexed integer array nums, where nums[i] represents the score of the ith student. You are also given an integer k.

Pick the scores of any k students from the array so that the difference between the highest and the lowest of the k scores is minimized.

Return the minimum possible difference.

	Input 			----->  int[],int
	Output 			----->  int

	Data Set:
		 Positive: 	---> Input: arr = [2,2,2,2,5,5,5,8], k = 3, threshold = 4			Output =  3
		 Positive: 	---> Input: arr = [0,1,5,6,7], k = 2, threshold = 5			        Output =  3

		 Negative: 	---> Input: arr = [0,1,5,6,7], k = 2, threshold = 25			    Output =  0

		 Edge: 	    ---> Input: arr = [0], k = 1, threshold = 0			        Output =  1


	Pseudo Code:
	1. Get the input arr, k and intialise ptr and res as 0
	2. Sort the Array
	3. Iterate through the loop with condition while( pointer <= nums.length-k)
	4.
    5. return the res

	 */

    @Test
    public void allTests() {

        //Positive
        Assert.assertEquals(2, getMinimumDifference(new int[]{9,4,1,7}, 2));
        /*
        Assert.assertEquals(2, getcount_subArrayWithThreshold(new int[]{0, 1, 5, 6, 7}, 2, 5));
        Assert.assertEquals(0, getcount_subArrayWithThreshold(new int[]{0, 1, 5, 6, 7}, 2, 25));
        Assert.assertEquals(1, getcount_subArrayWithThreshold(new int[]{0}, 1, 0));

*/
        /*
        Positive: 	---> Input: arr = [2,2,2,2,5,5,5,8], k = 3, threshold = 4			Output =  3

        Positive: 	---> Input: arr = [0,1,5,6,7], k = 2, threshold = 5			        Output =  3

        Negative: 	---> Input: arr = [0,1,5,6,7], k = 2, threshold = 25			    Output =  0

        Edge: 	    ---> Input: arr = [0], k = 1, threshold = 0			        Output =  1
        */


    }

    public int getMinimumDifference(int[] nums, int k) {//9,4,1,7 .. 2

        int res = Integer.MAX_VALUE, ptr = 0;

        Arrays.sort(nums);

        while (ptr <= nums.length - k) {
            if (nums[ptr+k - 1] - nums[ptr] < res)
                res = nums[ptr+k - 1] - nums[ptr];
            ptr++;
        }
        return res;
    }
}


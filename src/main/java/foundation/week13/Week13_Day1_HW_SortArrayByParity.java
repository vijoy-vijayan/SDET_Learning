package foundation.week13;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;


public class Week13_Day1_HW_SortArrayByParity {

	/* 
Leetcode link: https://leetcode.com/problems/sort-array-by-parity/description/

Problem Statement:
Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.

Return any array that satisfies this condition.

	Input 			----->  int[]
	Output 			----->  int[]

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
        /*Assert.assertEquals(2, getMinimumDifference(new int[]{9,4,1,7}, 2));

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

    public int[] sortArrayByParity(int[] nums) {//9,4,1,7 .. 2

        int start=0,end= nums.length-1;
        int temp=0;

        while (start<end) {

            if(nums[start]%2!=0) {
                temp = nums[end];
                nums[end] = nums[start];
                nums[start] = temp;

                end--;

            }
            else
                start++;


        }
        return nums;
    }
}


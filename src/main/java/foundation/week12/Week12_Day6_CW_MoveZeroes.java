package foundation.week12;

import org.junit.Assert;
import org.junit.Test;


public class Week12_Day6_CW_MoveZeroes {

	/* 
Leetcode link: Class Work

Problem statement: 	
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
Note that you must do this in-place without making a copy of the array.


	Input 			----->  int[]
	Output 			----->  int[]

	Data Set:
		 Positive: 	---> Input: [0,1,2,3]			        Output =  [1,2,3,0]
		 Positive: 	---> Input: [5,9,3,0,1,2]			    Output =  [5,9,3,1,2,0]
		 Negative: 	---> Input: [1,2,3]			            Output =  [1,2,3]
		 Edge: 	    ---> Input: [1]		                    Output =  [1]
		 Edge: 	    ---> Input: [0]		                    Output =  [0]



	Pseudo Code:
	1. Get the input att and initialise ptr_zer0, ptr_nonZero = 0, rowTracker=0
	2. Iterate through the while loop with condition  ptr_zero+ptr_nonZero< arr.length
	3. if arr[rowTracker]>0... arr[ptr1]=arr[rowTracker]... ptr_zer0++
	4. if arr[rowTracker]==0... arr[length - ptr2]=arr[rowTracker]... ptr_nonZero++
	5. return arr at the end


	 */

    @Test
    public void allTests() {


        Assert.assertArrayEquals(new int[]{1, 2, 3, 0, 0}, MoveZeroes(new int[]{1, 0, 2, 0, 3}));
        Assert.assertArrayEquals(new int[]{5, 7, 0}, MoveZeroes(new int[]{0, 5, 7}));
        Assert.assertArrayEquals(new int[]{1, 0}, MoveZeroes(new int[]{1, 0}));
        Assert.assertArrayEquals(new int[]{1, 2, 3, 0}, MoveZeroes(new int[]{0, 1, 2, 3}));
        Assert.assertArrayEquals(new int[]{1, 2, 3}, MoveZeroes(new int[]{1, 2, 3}));
        Assert.assertArrayEquals(new int[]{5, 9, 3, 1, 2, 0}, MoveZeroes(new int[]{5, 9, 3, 0, 1, 2}));
        Assert.assertArrayEquals(new int[]{1}, MoveZeroes(new int[]{1}));
/*

        Positive: 	---> Input: [0,1,2,3]			        Output =  [1,2,3,0]
        Positive: 	---> Input: [5,9,3,0,1,2]			    Output =  [5,9,3,1,2,0]
        Negative: 	---> Input: [1,2,3]			            Output =  [1,2,3]
        Edge: 	    ---> Input: [1]		                    Output =  [1]
        Edge: 	    ---> Input: [0]		                    Output =  [0]
*/


    }


    public int[] MoveZeroes(int[] arr) {

        int ptr1 = 0, ptr2 = 0;//ptr1- To track Non Zero position, ptr2 - checks zeros and iterate through length
        boolean flag = false;

        while (ptr2 < arr.length) {//ptr2 - Checks for 0 through the array length -- O(N)

            if (arr[ptr2] == 0) { // Condition to check Zero
                ptr2++;
                flag = true;
            } else if ((arr[ptr2] != 0) && !flag) {// To Skip swapping in the initial iteration to check for zero
                ptr1++;
                ptr2++;
            } else if ((arr[ptr2] != 0) && flag) { // Swapping
                arr[ptr1] = arr[ptr2];
                arr[ptr2] = 0;
                ptr1++;
                ptr2++;
            }
        }
        return arr;
    }
}
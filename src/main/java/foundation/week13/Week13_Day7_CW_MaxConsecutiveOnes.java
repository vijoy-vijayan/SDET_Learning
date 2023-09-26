package foundation.week13;

import org.junit.Test;


public class Week13_Day7_CW_MaxConsecutiveOnes {

	/* 
Leetcode link:
https://leetcode.com/problems/max-consecutive-ones/description/


	Input 			----->  int[]
	Output 			----->  int

	Data Set:
		 Positive: 	---> Input: [1,1,0,1,1,1]	                Output =  3
		 Positive: 	---> Input: [0,0,1,1,0]                     Output =  2
		 Negative: 	---> Input: [0,0,0,0,0]                     Output =  0
		 Edge: 	    ---> Input: [1,1,1,1,1,1,1]			        Output=   7
		 Edge: 	    ---> Input: [1]				                Output =  1

	Pseudo Code:
	1. Get the input array and initialise left=0, right=0, resCount=0, tempCount=0
	2. Iterate through the length of the String with condition right<length
	3. Expand the right and check its value with the left value
	4. If both are same .. Increment the right value amd increment the ctr
	5. Else assign right to left and increment the right
	6. return the counter

	 */

    @Test
    public void allTests() {

        //Positive
     


    }

    public int getSmallestSubsequence(int[] nums) {//1,2,3,4,5  10

        int left = 0, right = 0, ctr = 0;

        while (right < nums.length) {
            if ((nums[right] == nums[left])&&(nums[right] ==1)) {
                ctr = Math.max(ctr, right - left + 1);
//                ctr = (right - left + 1 > ctr) ?  right - left + 1: ctr;
                right++;
            } else {
                left = right;
                right++;
            }
        }
        return ctr;
    }



}


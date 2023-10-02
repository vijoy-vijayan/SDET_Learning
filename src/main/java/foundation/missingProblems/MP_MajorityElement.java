package foundation.missingProblems;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;


public class MP_MajorityElement {

	/* 
Leetcode link: https://leetcode.com/problems/majority-element/description/


	Input 			----->  int[]
	Output 			----->  int

	Data Set:
		 Positive: 	---> Input: [3,2,3]			        Output = 3
		 Negative: 	---> Input: [2,2,1,1,1,2,2]	        Output =  2
		 Edge: 	    ---> Input: [1,2,3,4,5,9,9,9,6]		Output =  9
		 Edge: 	    ---> Input: [1]			            Output =  1



	Pseudo Code:
	1. Get the input array and sort it
	2. Return nums[0] if length==1
	3. Return nums[length/2] otherwise


	Learning: Yet to understand the best code below.. Need to learn Moore Voting algorithm

	Best Code: https://leetcode.com/problems/majority-element/solutions/3676530/3-method-s-beats-100-c-java-python-beginner-friendly/

	 */

    @Test
    public void allTests() {

        Assert.assertEquals(2,majorityElement(new int[] {2,2,1,1,1,2,2}));

    }

    public int majorityElement(int[] nums) {

        if(nums.length==1)
            return nums[0];

        Arrays.sort(nums);

        int avg=nums.length/2;

        return nums[avg];
    }
}


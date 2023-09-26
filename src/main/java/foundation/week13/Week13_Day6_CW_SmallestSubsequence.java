package foundation.week13;

import org.junit.Assert;
import org.junit.Test;


public class Week13_Day6_CW_SmallestSubsequence {

	/* 
Leetcode link:
Given an input String,return a boolean array by validate each of the word is a palindrome.
Input = "this is a Test"
output = [false, false, true, true]


	Input 			----->  int[],int
	Output 			----->  int

	Data Set:
		 Positive: 	---> Input: "MADAM"		                Output =  true
		 Positive: 	---> Input: "AAAAAA"                    Output =  true
		 Negative: 	---> Input: "Madam"                     Output =  false
		 Edge: 	    ---> Input: ""				            Output=   false
		 Edge: 	    ---> Input: "V"				            Output =  true

	Pseudo Code:
	1. Get the input array and target. Initialise left=0, right=0, sum=0
	2. Find initial left and right value using while loop with condition sum>=target
	3. Increment the sum inside the loop and update the right ptr
	4.

	 */

    @Test
    public void allTests() {

        //Positive



    }

    public int getSmallestSubsequence(int[] nums,int target) {//1,2,3,4,5  10

        int windowSize=-1,left=0,right=0,sum=nums[left];

        //Loop until the first satisfying condition
        while((sum<=target)&&(right< nums.length))
        {
            right++;
            sum+=nums[right];
        }

        if(sum<=target)
            return windowSize;

        windowSize=right-left+1;

        while((left<=right)&&(right< nums.length))//1,2,3,4,5.. L- 0, R-4 .. WS-5
        {
            if(sum>target) {
                sum = sum - nums[left];
                left++;
            }
            else
            {
                sum=sum+nums[right];
                right++;
            }

            if((right-left+1)<windowSize)
                windowSize=right-left+1;
        }

        return windowSize;
    }



}


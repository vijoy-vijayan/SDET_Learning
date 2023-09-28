package myPractice.LearningWithLead;

import org.junit.Test;

import java.util.Arrays;

public class MinimumDifference {
 /*
    Find the maximum sum

    Input: int[],int
    Output: int



  */

   

    public int minimumDifference(int[] nums, int k) {

        int res = Integer.MAX_VALUE, ptr = 0;

        Arrays.sort(nums);

        while (ptr <= nums.length - k) {//4,2 4-2 =2... 0,1,2
            if (nums[ptr+k - 1] - nums[ptr] < res)//1,4,7,9
                res = nums[ptr+k - 1] - nums[ptr];
            ptr++;
        }
        return res;

    }


}

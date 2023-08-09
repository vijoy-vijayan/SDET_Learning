package foundation.week4;

import java.util.Arrays;

import org.junit.Test;
import org.junit.Assert;

public class ClassTest2_FindPivotIndex {
	class Solution {
	    public int pivotIndex(int[] nums) {

	        int leftSum, rightSum;

	        for(int i=0;i<nums.length;i++)
	        {
	            leftSum=rightSum=0;
	            for(int j=0;j<nums.length;j++)
	            {
	                if(i>j)
	                {
	                    leftSum=leftSum+nums[j];
	                }
	                if(i<j)
	                {
	                    rightSum=rightSum+nums[j];
	                }
	            }
	            if(leftSum==rightSum)
	                return i;
	        }
	        
	        return -1;
	    }
	}

	/*

	1. Created a Nester For loop - Outer loop to track Pivot Index .. Initialise leftSum, rightSum=0
	2. In the inner loop calculate leftSum when i>j and rightsum when i<j
	3. At the end of inner loop, check leftSUm and rightSum and return i(outer loop index) if both are equal
	4. Continue for all the elements and return -1 at the end
	*/

}


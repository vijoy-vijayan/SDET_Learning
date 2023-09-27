package foundation.week14;

import org.junit.Assert;
import org.junit.Test;


public class Week14_Day3_MG_TargetSum {

	/* 
Leetcode link: https://leetcode.com/problems/number-of-sub-arrays-of-size-k-and-average-greater-than-or-equal-to-threshold/description/

Problem Statement:
input: 2 3 5 6 7 8, Target = 11  --> Sum of two numbers should match with target
        1. return number 2. return indices

	Input 			----->  int[],int
	Output 			----->  int[]

	Data Set:
		 Positive: 	---> Input: [3,5,8,10],13			    Output =  [5,8]
		 Positive: 	---> Input: [1,2,3,4,5,6,9] ,7          Output =   [1,6]
		 Negative: 	---> Input: [-2,-1,0,1],-1              Output =  [-1,0]
		 Edge: 	    ---> Input: [99,100],109			    Output=   [99,100]


	Pseudo code:
    1. Get the input array and the Target element. Initialise letf=0, right=length-1,sum=0
    2. iterate through the loop until left<=right
    3. Calculate the sum --> arr[left]+arr[right]
    4. If sum> target, right--
    5. if sum<target, left++
    6. if sum==target, return res as arr



	 */

    @Test
    public void allTests() {

        //Positive
        Assert.assertArrayEquals(new int[]{5,8}, findTargetSum(new int[]{3,5,8,11},13));
        Assert.assertArrayEquals(new int[]{1,6}, findTargetSum(new int[]{1,2,3,4,5,6,9},7));
        Assert.assertArrayEquals(new int[]{-1,0}, findTargetSum(new int[]{-2,-1,0,5},-1));
        Assert.assertArrayEquals(new int[]{99,100}, findTargetSum(new int[]{99,100},199));



    }

    public int[] findTargetSum(int[] arr, int target) {//3,5,8,10


        int left=0,right=arr.length-1,sum=0;

        while(left<right)
        {
            sum=arr[left]+arr[right];

            if(sum==target)
                break;
            else if(sum>target)
                right--;
            else
                left++;
        }



        return new int[]{arr[left],arr[right]};

    }
}


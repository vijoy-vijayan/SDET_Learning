package foundation.week14;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;


public class Week14_Day7_CW_SingleNumber {

	/* 
Leetcode link: https://leetcode.com/problems/ransom-note/description/


	Input 			----->  int[]
	Output 			----->  int

	Data Set:
		 Positive: 	---> Input: \			    Output =  [5,8]
		 Positive: 	---> Input: [3,2,4] ,6                  Output =   [1,2]
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

        singleNumber(new int[]{2,2,1,1,4,5,5,6,7,6,7});
//        findIndexOfKey_HMLearning("Jane");


    }

    public int singleNumber(int[] nums) {

        HashSet<Integer> tempSet=new HashSet<>();

        for(int i=0;i<nums.length;i++)
        {
            if(!tempSet.add(nums[i]))
                tempSet.remove(nums[i]);
        }

        return tempSet.iterator().next();
    }


}


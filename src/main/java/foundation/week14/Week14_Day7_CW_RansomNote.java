package foundation.week14;

import org.junit.Test;

import java.util.Arrays;


public class Week14_Day7_CW_RansomNote {

	/* 
Leetcode link: https://leetcode.com/problems/ransom-note/description/


	Input 			----->  String, String
	Output 			----->  boolean

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

        findAnagram("test","sett");
//        findIndexOfKey_HMLearning("Jane");


    }

    public int[] findTargetSum_BruteForce(int[] nums, int target) {

        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if (nums[i]+nums[j]==target)
                    return new int[]{i,j};
            }
        }

        return new int[]{-1,-1};
    }

    public boolean findAnagram(String s,String p)
    {

        int[] pCharTracker=new int[26];
        int[] sCharTracker=new int[26];

        int right=0;


        while(right<p.length())
        {
            pCharTracker[p.charAt(right)-'a']++;
            sCharTracker[s.charAt(right++)-'a']++;
        }
        return Arrays.equals(pCharTracker,sCharTracker);


    }
}


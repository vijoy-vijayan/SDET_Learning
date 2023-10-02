package foundation.week14;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

import static java.util.Objects.hash;


public class Week14_Day6_CW_TwoSum {

	/* 
Leetcode link: https://leetcode.com/problems/two-sum/description/

Problem Statement:
input: 2 3 5 6 7 8, Target = 11  --> Sum of two numbers should match with target
        1. return number 2. return indices

	Input 			----->  int[],int
	Output 			----->  int[]

	Data Set:
		 Positive: 	---> Input: [3,5,8,10],13			    Output =  [5,8]
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

        findIndexOfKey_HMLearning("test");
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

    public void findIndexOfKey_HMLearning(String key)
    {

//        int hash = hash(key);
//        int hash = key.hashCode();

        int hash = hash("apple");

        System.out.println("Hash value is " +hash);

        hash = hash("banana");

        System.out.println("Hash value is " +hash);

        int boxedHash=hash >>> 16;

        int finalValue=(16-1)&boxedHash;

//        HashMap<Integer,Integer> map =new HashMap<Integer, Integer>();
//        map.put(1,1);
//
//        ConcurrentHashMap<Integer,Integer> map1 =new ConcurrentHashMap<Integer, Integer>();

    }
}


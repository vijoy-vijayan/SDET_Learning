package foundation.week9;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;


public class Week9_Day5_MentorGiven_ArrayByParity {

	/* 
Leetcode link: https://leetcode.com/problems/sort-array-by-parity/

Problem statement: 	
Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.

Return any array that satisfies this condition.

	Input 			----->  int[]
	Output 			----->  int[]


	Data Set:
		 Positive: 	---> Input: [1,2,3,4,5,6]					Output =  [6,2,4,5,3,1]
		 Negative:  ---> Input: [10,9,8,7,6,0]					Output =  [10,8,6,0,9,7]
		 Edge: 		---> Input: [2]								Output =  [2]



	Pseudo Code:
	1. Get the input array and initialise  end=length-1,ctr=0
	2. Iterate through the Array with the condition length-ctr
	3. CHeck for the even number logic, if not swap to last element and increase the ctr, decrease the i
	4. Return the same array at the end

Best Solution: https://leetcode.com/problems/sort-array-by-parity/solutions/535402/simple-java-easy-to-understand-99-77-1ms/
	 */

	@Test	
	public void positiveTest()
	{

		Assert.assertArrayEquals(new int[]{6,2,4,5,3,1}, sortArrayByParity(new int[]{1,2,3,4,5,6}));
	}


	/*@Test
	public void negativeTest()
	{
		Assert.assertEquals(14, getMaximumNoOfWords(new String[]{"A sentence is a list of words that are separated by a single space"," with no leading or trailing spaces"}));

	}

	@Test
	public void edgeTest()
	{
		Assert.assertEquals(1, getMaximumNoOfWords(new String[]{"Java"}));

	}*/

	public int[] sortArrayByParity(int[] nums) {

		int end=nums.length-1,ctr=0,temp=0;

		for (int i = 0; i < nums.length-ctr; i++) {//6,2,4,5,3,1

			if(nums[i]%2!=0)
			{
				temp=nums[end];
				nums[end]=nums[i];
				nums[i]=temp;
				end--;
				i--;
				ctr++;
			}

		}

		System.out.println(Arrays.toString(nums));
		return nums;
	}

}


package foundation.week1.day1;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

class Numberof1s {
	
	/* Problem: int[] nums = { 0, 0, 0, 1, 1, 1 };
	Find the number of 1's present in the array without using a counter


	Input: Integer Array

	Output: Integer

	Pseudo code:
	
	Get the input array and sort it
		
	Iterate through each element in the array
	
	Find the number 1 in it
		if present, apply the formula --> Length - count of 0s
		return the final value
	
	If there is no match for any of the element return 0


	 */
	@Test
	void Positivetest() {
		Assert.assertEquals(5,findNumberofOnes(new int[] {1,1,1,0,1,0,0,0,1}));
		
    }
	
	@Test
	void Negativetest() {
		Assert.assertEquals(0,findNumberofOnes(new int[] {0,0,0}));
		
    }
	
	
	@Test
	void Edgetest() {
		Assert.assertEquals(6,findNumberofOnes(new int[] {1,1,1,1,1,1}));
		Assert.assertEquals(0,findNumberofOnes(new int[] {}));
	}
	
	
	public static int findNumberofOnes(int[] nums)
	{
		Arrays.sort(nums);

		for (int i = 0; i < nums.length; i++) {
			if(nums[i]==1) {
				return nums.length-i;
			}
		}

		return 0;

	}

}

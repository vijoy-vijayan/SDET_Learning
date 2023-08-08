package foundationCourse;

import java.util.Arrays;

/* Problem: int[] nums = { 0, 0, 0, 1, 1, 1 };
Find the number of 1's present in the array


Input: Integer Array

Output: Integer

Pseudo code:
Get the number
iterate through each element in the array
Find the number 1 in it
	if present, apply the formula --> Length - count of 0s
	return the final value
If there is no matches for any of the element return 0


If you have completed, try without using a counter

 */

public class NumberOfOnes {

	public static void main(String[] args)
	{

		int[] nums = {0,0,0};

		System.out.println(findNumberofOnes(nums));
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



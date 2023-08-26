package foundation.week9;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;


public class Week9_Day4_HW_SummaryRanges {

	/* 
Leetcode link: https://leetcode.com/problems/summary-ranges/

Problem statement: 	
You are given a sorted unique integer array nums.

A range [a,b] is the set of all integers from a to b (inclusive).

Return the smallest sorted list of ranges that cover all the numbers in the array exactly.
That is, each element of nums is covered by exactly one of the ranges,
and there is no integer x such that x is in one of the ranges but not in nums.

Each range [a,b] in the list should be output as:

"a->b" if a != b
"a" if a == b

	Input 			----->  int[]
	Output 			----->  String[]


	Data Set:
		 Positive: 	---> Input: [0,1,4,5]					Output =  ["0->1","4->5"]
		 Positive: 	---> Input: [0,1,2,3,4,5]				Output =  ["0->5"]
		 Negative:  ---> Input: [0,1,2,3,5]					Output =  ["0->3","5"]
		 Edge: 		---> Input: [0]							Output =  ["0"]
		 Edge: 		---> Input: [0,9]						Output =  ["0","9"]


	Pseudo Code:
	1. Get the input array nums and initialize temp_String="", start_ctr=0, end_ctr=0, rowTracker=0
	2. Iterate through the element from to length og input array Condition : end_ctr<=nums.length
	3. Iterate an inner while loop and Check for the condition a[i]+1==a[i+1]
	4. If true, update the end_ctr++ and set the flag
	5. If flag set , end_ctr--, flag=false
	6. CHeck for the condition .. if endctr-startctr==0, then update tempString=tempString+String.valueOf(a[endCTr]+","
		else  tempString=tempString+String.valueOf(a[startCtr]+"->"+String.valueOf(a[endCTr]+","
	7. Increase the endCTr and set startCtr=endCtr and continue the outer loop check
	8. Split the String and return the String array


	 */

	@Test	
	public void positiveTest()
	{

		Assert.assertEquals(new String[]{"0->1","4->5"}, getSummaryRanges(new int[]{0,1,4,5}));
		Assert.assertEquals(new String[]{"0->5"}, getSummaryRanges(new int[]{0,1,2,3,4,5}));
	}


	@Test
	public void negativeTest()
	{
		Assert.assertEquals(new String[]{"0->3","5"}, getSummaryRanges(new int[]{0,1,2,3,5}));
	}

	@Test
	public void edgeTest()
	{
		Assert.assertEquals(new String[]{"0"}, getSummaryRanges(new int[]{0}));
		Assert.assertEquals(new String[]{"0","9"}, getSummaryRanges(new int[]{0,9}));
	}


	public String[] getSummaryRanges(int[] nums) {//O(N)

		if(nums.length==0)
			return new String[0];
		
		int start_ctr=0, end_ctr=0;

		String temp="";

		boolean flag=false;

		while(nums.length-1>=end_ctr)//O(N) ...... // 0,1,2,3,4,5
		{
			if(end_ctr!=nums.length-1) {
				while (nums[end_ctr] + 1 == nums[end_ctr + 1]) {
					end_ctr++;
					flag = true;

					if (end_ctr == nums.length - 1) {
						break;
					}
				}
			}
			if(flag)
			{
				flag=false;
			}

			if(end_ctr-start_ctr==0)
				temp=temp+String.valueOf(nums[end_ctr])+",";
			else
				temp=temp+String.valueOf(nums[start_ctr])+"->"+String.valueOf(nums[end_ctr])+",";

			end_ctr++;
			start_ctr=end_ctr;

			System.out.println(temp);
		}

		temp=temp.substring(0, temp.length() - 1);

		System.out.println(temp);

		return temp.split(",");
	}

}


package foundation.week9;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;


public class Week9_Day5_HW_AssignCookies {

	/* 
Leetcode link: https://leetcode.com/problems/assign-cookies/

Problem statement: 	
Assume you are an awesome parent and want to give your children some cookies.
But, you should give each child at most one cookie.

Each child i has a greed factor g[i], which is the minimum size of a cookie that the child will be content with;
and each cookie j has a size s[j]. If s[j] >= g[i], we can assign the cookie j to the child i,
and the child i will be content. Your goal is to maximize the number of your content children and
output the maximum number.

	Input 			----->  int[], int[]
	Output 			----->  int


	Data Set:
		 Positive: 	---> Input: [2,2,6],[3,4,5]					Output =  2
		 Positive: 	---> Input: [2,3,4],[2,3,4]					Output =  3
		 Positive: 	---> Input: [1,2,3],[1,2]					Output =  2
		 Negative:  ---> Input: [2,3,4],[1,1,1]					Output =  0
		 Edge: 		---> Input: [1,1],[0]						Output =  0
		 Edge: 		---> Input: [4],[2,5]						Output =  1


	Pseudo Code:
	1. Get the input arrays --> g[], s[] and initialise rowTRacker=0, result=0
	2. Sort both arrays
	3. Iterate through all the elements of the g[]
	4. In the inner while loop, Check for the condition s[rowTracker]>=g[i],
		if matched increase the result++, rowTracker++, break;
	5. Continue step 4 for all the elements of g[]
	6. Return result at the end

Best Solution: https://leetcode.com/problems/assign-cookies/solutions/93987/simple-greedy-java-solution/
	 */

	@Test	
	public void positiveTest()
	{

		Assert.assertEquals(2, getAssignedCookiesCount(new int[]{2,2,6},new int[]{3,4,5}));
		Assert.assertEquals(3, getAssignedCookiesCount(new int[]{3,4,5},new int[]{3,4,5}));
		Assert.assertEquals(2, getAssignedCookiesCount(new int[]{1,2,4},new int[]{2,4}));

	}


	@Test
	public void negativeTest()
	{
		Assert.assertEquals(0, getAssignedCookiesCount(new int[]{2,3,4},new int[]{1,1,1}));

	}

	@Test
	public void edgeTest()
	{
		Assert.assertEquals(0, getAssignedCookiesCount(new int[]{1,1},new int[]{0}));
		Assert.assertEquals(1, getAssignedCookiesCount(new int[]{4},new int[]{2,5}));
	}


	public int getAssignedCookiesCount(int[] g, int[] s) {//O(N log N)

		int res=0, rowTracker=0;

		Arrays.sort(g);//o(N log N)
		Arrays.sort(s);

		for (int i=0; i<g.length;i++)//O(N)
		{
			while(rowTracker<s.length)
			{
				if(s[rowTracker]>=g[i])
				{
					res++;
					rowTracker++;
					break;
				}
				rowTracker++;
			}
		}

		return res;
	}

}


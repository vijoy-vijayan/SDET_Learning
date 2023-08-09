package foundation.week6;

import org.junit.Test;

import java.util.Arrays;

import org.junit.Assert;




public class HW18_ShortestDistanceToCharacter2 {

	/* 
Leetcode link: https://leetcode.com/problems/shortest-distance-to-a-character/description/

Problem statement: 	
Given a string s and a character c that occurs in s, return an array of integers answer where answer.length == s.length and answer[i] is the distance from index i to the closest occurrence of character c in s.

The distance between two indices i and j is abs(i - j), where abs is the absolute value function.


	Input 			----->  String, char
	Output 			----->  int[]


	Data Set:
		 Positive: 	---> Input:"loveleetcode", 'e'		Output =  [3,2,1,0,1,0,0,1,2,2,1,0]
		 Edge: 		---> Input: "aaaab"	,'b'			Output =  [4,3,2,1,0]


	Pseudo Code:
	1. Get the String anf character and create the integer output array with String length.. Initialize left and right with max value;
	2. Loop through the characters of String with Left and right side comparison 
	3. if match is found check for right and left value and return the minimum value
	4. Add condition to avoid iteration to the end of loop
	 */

	@Test	
	public void positiveTest()
	{
		Assert.assertArrayEquals(new int[] {3,2,1,0,1,0,0,1,2,2,1,0}, getShortestDistance("loveleetcode",'e'));
	}




	@Test	
	public void edgeTest()
	{
		Assert.assertArrayEquals(new int[] {4,3,2,1,0}, getShortestDistance("aaaab",'b'));
	}

	public int[] getShortestDistance(String s, char c) {

		int[] outputResultArr=new int[s.length()];

		int left,right,ctr;

		for (int i = 0; i < outputResultArr.length; i++) {

			left=right=i;
			ctr=0;

			while(true)
			{
				if((s.charAt(left)==c)||(s.charAt(right)==c))
				{
					outputResultArr[i]=ctr;
					break;
				}


				if(left!=0)
					left--;

				if(right!=s.length()-1)
					right++;

				ctr++;
			}

		}

		return outputResultArr;

	}
	
	
	//Iterated through separate For loops separately instead of Nested Loops
	
	public int[] leetCode_bestLogic_shortestToChar(String S, char C) {
        int n = S.length(), pos = -n, res[] = new int[n];
        for (int i = 0; i < n; ++i) {
            if (S.charAt(i) == C) pos = i;
            res[i] = i - pos;
        }
        for (int i = pos - 1; i >= 0; --i) {
            if (S.charAt(i) == C)  pos = i;
            res[i] = Math.min(res[i], pos - i);
        }
        return res;
    }




}

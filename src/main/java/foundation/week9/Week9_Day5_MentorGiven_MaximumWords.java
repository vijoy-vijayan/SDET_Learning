package foundation.week9;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;


public class Week9_Day5_MentorGiven_MaximumWords {

	/* 
Leetcode link: https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/

Problem statement: 	
A sentence is a list of words that are separated by a single space with no leading or trailing spaces.

You are given an array of strings sentences, where each sentences[i] represents a single sentence.

Return the maximum number of words that appear in a single sentence.

	Input 			----->  String[]
	Output 			----->  int


	Data Set:
		 Positive: 	---> Input: ["Vijoy Vijayan"]					Output =  2
		 Negative:  ---> Input: ["A sentence is a list of words that are separated by a single space with no leading or trailing spaces",
		 "Return the maximum number of words that appear in a single sentence."]					Output =  20
		 Edge: 		---> Input: ["Java"]						Output =  1



	Pseudo Code:
	1. Get the input String array and initialise  result=0
	2. Iterate through the Array
	3. Split the input with space and store its length in result
	4. Add the condition to hold maximum in result .. if newRes>result --> result=newResult
	5. Return the result at the end

	 */

	@Test	
	public void positiveTest()
	{

		Assert.assertEquals(2, getMaximumNoOfWords(new String[]{"Vijoy Vijayan"}));
	}


	@Test
	public void negativeTest()
	{
		Assert.assertEquals(14, getMaximumNoOfWords(new String[]{"A sentence is a list of words that are separated by a single space"," with no leading or trailing spaces"}));

	}

	@Test
	public void edgeTest()
	{
		Assert.assertEquals(1, getMaximumNoOfWords(new String[]{"Java"}));

	}

	public int getMaximumNoOfWords(String[] sentences) {//O(N log N)

		int res=0;

		for (int i = 0; i < sentences.length; i++) {

			if(sentences[i].split(" ").length>res)
				res=sentences[i].split(" ").length;
		}

		return res;
	}

}


package foundation.week10;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Week10_Day4_HW_TruncateSentence {

	/* 
Leetcode link: https://leetcode.com/problems/truncate-sentence/

Problem statement: 	
A sentence is a list of words that are separated by a single space with no leading or trailing spaces.
Each of the words consists of only uppercase and lowercase English letters (no punctuation).

For example, "Hello World", "HELLO", and "hello world hello world" are all sentences.
You are given a sentence s and an integer k. You want to truncate s such that
it contains only the first k words. Return s after truncating it.

	Input 			----->  String,int
	Output 			----->  String

	Data Set:
		 Positive: 	---> Input: "I like Gardening",1					Output =  "I"
		 Negative: 	---> Input: "Why, are you coming late to office? ",3					Output =  "Why, are you coming"
		 Edge:  	---> Input: "Java",1					Output =  "Java"

	Pseudo Code:
	1. Get the input string and integer - k
	2. Return the substring using String Substring method with start index as 0 and end as integer passed as input.. k


	 */

	@Test
	public void positiveTest()
	{

		Assert.assertEquals("I", getSentenceAfterTruncating("I like Gardening",1));

	}
	@Test
	public void negativeTest()
	{
		Assert.assertEquals("Why, are you", getSentenceAfterTruncating("Why, are you coming late to office? ",3));

	}
	@Test
	public void edgeTest()
	{
		Assert.assertEquals("Java", getSentenceAfterTruncating("Java",1));
	}




	public String getSentenceAfterTruncating(String s, int k) {

		String[] words=s.split(" ");

		StringBuilder res=new StringBuilder();

		(res.toString()).equals("kjhkjhkj");

		for (int eachWord = 0; eachWord < k; eachWord++) {
			res.append(words[eachWord]);

			if(eachWord!=k-1)
				res.append(" ");
		}

		return res.toString();
	}

}


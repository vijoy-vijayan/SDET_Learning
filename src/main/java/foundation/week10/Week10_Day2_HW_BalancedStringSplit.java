package foundation.week10;

import org.junit.Assert;
import org.junit.Test;


public class Week10_Day2_HW_BalancedStringSplit {

	/* 
Leetcode link: https://leetcode.com/problems/split-a-string-in-balanced-strings/

Problem statement: 	
Balanced strings are those that have an equal quantity of 'L' and 'R' characters.
Given a balanced string s, split it into some number of substrings such that:

Each substring is balanced. Return the maximum number of balanced strings you can obtain.


	Input 			----->  String,String
	Output 			----->  String


	Data Set:
		 Positive: 	---> Input: "mnop", "rstu"					Output =  "mrnsotpu"
		 Negative: 	---> Input: "tester","dev"			Output =  "tdeesvter"
		 Negative: 	---> Input: "bee","butterfly"			Output =  "bbeuetterfly"
		 Edge:  ---> Input: "a","z"				Output =  "az"



	Pseudo Code:
	1. Get the input string and initialise ctr=0, res="", trailingVal=""
    2. Check for the longer string in the given two string using
    	if len(str1)>len(str2) --> trailingvale=remainingpart(Substring(str1)), ctr=str2.lenght()
    	else trailingval=remainingpart(Substring(str2)), ctr=str2.lenght(), ctr=str1.lenght()
    3. Loop through the ctr and add each indexed character of both string and append with res
    4. Return res+trailingVal


	 */

	@Test
	public void positiveTest()
	{

		Assert.assertEquals("mrnsotpu", mergeString("mnop", "rstu"));

	}


	@Test
	public void negativeTest()
	{
		Assert.assertEquals("tdeesvter", mergeString( "tester","dev"));
		Assert.assertEquals("bbeuetterfly", mergeString( "bee","butterfly"));
	}

	@Test
	public void edgeTest()
	{
		Assert.assertEquals("az", mergeString( "a","z"));
	}


	public String mergeString(String word1, String word2) {//O(N)

		int ctr=0;
		String TrailingVal="",MergedStr="";

		if(word1.length()>word2.length())
		{
			TrailingVal=word1.substring(word2.length());
			ctr=word2.length();
		}
		else
		{
			TrailingVal=word2.substring(word1.length());
			ctr=word1.length();
		}
		for(int i=0;i<ctr;i++)
			MergedStr=MergedStr+word1.charAt(i)+word2.charAt(i);

		return MergedStr.concat(TrailingVal);
	}

}


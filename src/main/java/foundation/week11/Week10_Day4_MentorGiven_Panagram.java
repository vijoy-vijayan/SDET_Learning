package foundation.week11;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;


public class Week10_Day4_MentorGiven_Panagram {

	/* 
Leetcode link: https://leetcode.com/problems/check-if-the-sentence-is-pangram/

Problem statement: 	
A pangram is a sentence where every letter of the English alphabet appears at least once.

Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.

	Input 			----->  String
	Output 			----->  boolean

	Data Set:
		 Positive: 	---> Input: "tuvwxyzabcdefghijklmnopqrsalphabtestesting"			Output =  true
		 Edge: 		---> Input: "tuvwxyzabcdefghiklmnopqrs"								Output =  false
		 Negative: 	---> Input: "tuvwxyzabcdefghijklmnopqrs"							Output= true


	Pseudo Code:
	1. Get the input String and return false if length is < 26
	2. Loop through alphabets a-z and check for the character in the given string
	3. If matches - Move to next character in alphabet
	4. If not matches return false
	5. Return true at the end

	 */

	@Test
	public void allTests()
	{
		//Positive
		Assert.assertEquals(true, checkPangram("abcdefghijklmnopqrstuvwxyz"));
		Assert.assertEquals(true, checkPangram("tuvwxyzabcdefghijklmnopqrsalphabtestesting"));
		//Negative
		Assert.assertEquals(false, checkPangram("tuvwxyzabcdefghiklmnopqrs"));
		//Edge
		Assert.assertEquals(true, checkPangram("tuvwxyzabcdefghijklmnopqrs"));


	}



	public boolean checkPangram(String sentence) {

		if(sentence.length()<26)
			return false;

		String reference="abcdefghijklmnopqrstuvwxyz";

		for(int i=0;i<reference.length();i++)
		{
			if(sentence.indexOf(reference.charAt(i))<0)
				return false;
		}

		return true;
	}

}


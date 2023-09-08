package foundation.week11;

import org.junit.Assert;
import org.junit.Test;


public class Week10_Day4_HW_DecodeMessage {

	/* 
Leetcode link: https://leetcode.com/problems/decode-the-message/

Problem statement: 	
You are given the strings key and message, which represent a cipher key and a secret message, respectively. The steps to decode message are as follows:

Use the first appearance of all 26 lowercase English letters in key as the order of the substitution table.
Align the substitution table with the regular English alphabet.
Each letter in message is then substituted using the table.
Spaces ' ' are transformed to themselves.
For example, given key = "happy boy" (actual key would have at least one instance of each letter in the alphabet), we have the partial substitution table of ('h' -> 'a', 'a' -> 'b', 'p' -> 'c', 'y' -> 'd', 'b' -> 'e', 'o' -> 'f').
Return the decoded message.

	Input 			----->  String, String
	Output 			----->  String

	Data Set:
		 Positive: 	---> Input: "the quick brown fox jumps over the lazy dog", "vkbs bs t suepuv"							Output =  "this is a secret"
		 Negative:  ---> Input: "the quick brown fox jumps over the lazy dog", "tfpkx tfpvxtm"								Output =  "vijoy vijayan"
		 Edge: 		---> Input: "eljuxhpwnyrdgtqkviszcfmabo","zwx hnfx lqantp mnoeius ycgk vcnjrdb"							Output =  "the five boxing wizards jump quickly"


	Pseudo Code:
	1. Get the Input string - Key and the Message
	2. Create a character array with the length of 26
	3.
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


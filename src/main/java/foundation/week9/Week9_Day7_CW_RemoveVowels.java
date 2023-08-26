package foundation.week9;

import org.junit.Assert;
import org.junit.Test;


public class Week9_Day7_CW_RemoveVowels {

	/*
Leetcode link: Mentor Given

Problem statement: 	
Write a program to remove vowels from a String
Example:
Input: "Hi testleaf students"
Output: "H tstlf students"


	Input 			----->  String
	Output 			----->  String


	Data Set:
		 Positive: 	---> Input: "Vijoy Vijayan"				Output =  "Vjy Vjyn"
		 Negative:  ---> Input: "Strng"						Output =  "Strng"
		 Edge: 		---> Input: "AaEeIiOoUu"				Output =  ""



	Pseudo Code:
	1. Get input String and initiate output=""
	2. Iterate through each characters in input string and check for the presence of vowels
		if(with all set of vowels) ...
			True --> replace with "" in output
			False --> replace with the character itself in output
	3. Return output at the end


	 */

	@Test	
	public void positiveTest()
	{
		Assert.assertEquals("Vjy Vjyn", removeVowels("Vijoy Vijayan"));
		Assert.assertEquals("Vjy Vjyn", removeVowels_builder("Vijoy Vijayan"));
	}


	@Test
	public void negativeTest()
	{
		Assert.assertEquals("Strng", removeVowels("Strng"));
		Assert.assertEquals("Strng", removeVowels_builder("Strng"));
	}

	@Test
	public void edgeTest()
	{
		Assert.assertEquals("", removeVowels("AaEeIiOoUu"));
		Assert.assertEquals("", removeVowels_builder("AaEeIiOoUu"));

	}
	public String removeVowels(String input) {//O(N)

		String output="";

		for (int i = 0; i < input.length(); i++) {

			char ch=input.charAt(i);
			if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u')||(ch=='A')||(ch=='E')||(ch=='I')||(ch=='O')||(ch=='U'))
				output=output+"";
			else
				output=output+ch;
		}

		return output;
	}


	public String removeVowels_builder(String input) {//O(N)

		StringBuilder output=new StringBuilder("");

		for (int i = 0; i < input.length(); i++) {

			char ch=input.charAt(i);
			if(!((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u')||(ch=='A')||(ch=='E')||(ch=='I')||(ch=='O')||(ch=='U')))
				output=output.append(ch);
		}

		return output.toString();
	}

	public String removeVowels_regex(String input) {//O(N)

		return input.replaceAll("[aeiou]","");
	}

}


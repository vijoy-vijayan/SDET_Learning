package foundation.week9;

import org.junit.Assert;
import org.junit.Test;


public class Week9_Day6_CW_Defanged_IPAddress {

	/*
Leetcode link: Mentor Given

Problem statement: 	
Given a valid IP address, return a defanged version of that IP address.
A defanged IP address replaces every period "." with "[.]".
Do Not Use the replaceAll()
Example 1:
Input: address = "1.1.1.1"
Output: "1[.]1[.]1[.]1"

	Input 			----->  String
	Output 			----->  String


	Data Set:
		 Positive: 	---> Input: "12.34.56.78"				Output =  "12[.]34[.]56[.]78"
		 Negative:  ---> Input: ["1.2.34"]					Output =  "1[.]2[.]34"
		 Edge: 		---> Input: "14.5"						Output =  "14[.]5"



	Pseudo Code:
	1. Get the input String and initialise output=""
	2. Iterate through the input from 0 to String length
	3. Get the character of index and check for "."
			If true --> output=output+"[.]";
			else --> output=output+character
	4. Return the output at the end

	 */

	@Test	
	public void positiveTest()
	{

		Assert.assertEquals("12[.]34[.]56[.]78", getDefangedIPAddress("12.34.56.78"));
	}


	@Test
	public void negativeTest()
	{
		Assert.assertEquals("1[.]2[.]34", getDefangedIPAddress("1.2.34"));

	}

	@Test
	public void edgeTest()
	{
		Assert.assertEquals("14[.]5", getDefangedIPAddress("14.5"));

	}

	public String getDefangedIPAddress(String input) {//O(N)

		String output="";

		for (int i = 0; i < input.length(); i++) {

			if(input.charAt(i)=='.')
				output=output+"[.]";
			else
				output=output+input.charAt(i);
		}

		return output;
	}

}


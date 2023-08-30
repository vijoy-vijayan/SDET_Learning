package foundation.week10;

import org.junit.Assert;
import org.junit.Test;


public class Week10_Day2_HW_ReversePrefix {

	/* 
Leetcode link: https://leetcode.com/problems/reverse-prefix-of-word/

Problem statement: 	
Given a 0-indexed string word and a character ch, reverse the segment of word that starts at index 0
and ends at the index of the first occurrence of ch (inclusive). If the character ch does not exist in word, do nothing.

For example, if word = "abcdefd" and ch = "d", then you should reverse the segment that starts at 0
and ends at 3 (inclusive). The resulting string will be "dcbaefd".Return the resulting string.

	Input 			----->  String,char
	Output 			----->  String


	Data Set:
		 Positive: 	---> Input: classmate,s					Output =  salcsmate
		 Negative: 	---> Input: testleaf,q				Output =  testleaf
		 Edge:  ---> Input: vijoyvijayan,v					Output =  vijoyvijayan



	Pseudo Code:
	1. Get the input string and check for the first index of character
    2. If index >0,
    	Get the substring of input with the 0,given index ..
    	Get the remaining part with substring Index, length()
    3. Reverse the substring1
    4. Return substring1+substring2;

 Best Solution : https://leetcode.com/problems/reverse-prefix-of-word/solutions/1462197/java-easy-solution-beats-100/

	 */

	@Test
	public void positiveTest()
	{
		Assert.assertEquals("salcsmate", reversePrefix("classmate",'s'));
		Assert.assertEquals("zpotpal", reversePrefix("laptopz",'z'));
	}


	@Test
	public void negativeTest()
	{
		Assert.assertEquals("testleaf", reversePrefix("testleaf",'q'));
	}

	@Test
	public void edgeTest()
	{
		Assert.assertEquals("vijoyvijayan", reversePrefix("vijoyvijayan",'v'));
	}





	public String reversePrefix(String word, char ch) {//O(N)

		int firstIndex=word.indexOf(ch);

		if(firstIndex>0)
		{
			String firstpart=word.substring(0,firstIndex+1);
			StringBuilder firstpart_sb = new StringBuilder(firstpart);
			firstpart_sb=firstpart_sb.reverse();
			System.out.println("Reversed String"+firstpart_sb);
			firstpart=firstpart_sb.toString();

			System.out.println("Conversion to String"+firstpart);
			String remainingPart=word.substring(firstIndex+1,word.length());

			word=firstpart+remainingPart;

		}

		return word;
	}

}


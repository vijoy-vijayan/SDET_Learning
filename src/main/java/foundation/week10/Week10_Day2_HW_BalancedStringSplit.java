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


	Input 			----->  String
	Output 			----->  int


	Data Set:
		 Positive: 	---> Input: "RLRRRLLRLL"					Output =  2
		 Positive: 	---> Input: "RLRRLLRLRL"					Output =  4
		 Negative: 	---> Input: "LRRLLLRRRRRRLLLLRRRLL"			Output =  4
		 Edge:  	---> Input: "RL"							Output =  1



	Pseudo Code:
	1. Get the input string and initialise ctr_first,ctr_second=1,ctr_resul=0 and flag=true
	2. Loop through the characters and check for count of first character by condition --> if (flag)
	3. CHeck for the match of i and i+1 .. If same increment the ctr1
	4. If not matching, Set flag=false
	5. Check for the count of second charcters in the else part of flag
	6. If i ==i+1, increase the ctr2 and check for the match with first counter .. ctr1==ctr2
	7. Reset all value of other ctrs to default and increment reult ctr by 1
	8. Handle the edge condition effectively
	9. Repeat for all characters and return the output

	 */

	@Test
	public void positiveTest()
	{


		Assert.assertEquals(1, getCountofBalancedString("RRLL"));
		Assert.assertEquals(2, getCountofBalancedString("RLRRRLLRLL"));
		Assert.assertEquals(4, getCountofBalancedString("RLRRLLRLRL"));

	}


	@Test
	public void negativeTest()
	{
		Assert.assertEquals(5, getCountofBalancedString("LRRLLLRRRRRRLLLLRRRLLL"));

	}

	@Test
	public void edgeTest()
	{
		Assert.assertEquals(1, getCountofBalancedString("RL"));
	}


	public int getCountofBalancedString(String s) {//RLRRLLRLRL

		int ctr_first=0,ctr_second=0,resultctr=0;
		boolean flag=true;

		char[] charArr=s.toCharArray();

		for (int i = 0; i < charArr.length; i++) {
			if(flag)
			{
				ctr_first++;
				if((i!= charArr.length-1)&&(charArr[i]!=charArr[i+1])) {
					flag = false;
				}
			}
			else {

				ctr_second++;
				if((i!= charArr.length-1)&&(charArr[i]!=charArr[i+1]))
				{
					if(ctr_first==ctr_second)
						resultctr++;

					ctr_first=ctr_second=0;
					flag=true;

				}
				if(!flag&&(ctr_first==ctr_second)) {
					resultctr++;
					ctr_first=ctr_second=0;
					flag=true;

				}


			}


		}

		return resultctr;
	}

}


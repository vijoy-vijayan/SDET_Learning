package week3.day2;

import java.util.Arrays;

import org.junit.Test;
import org.junit.Assert;

public class HW3_SecondLargestDigit {

	/*

	Problem statement: 	 
	Given an alphanumeric string s, return the second largest numerical digit 
	that appears in s, or -1 if it does not exist.

	An alphanumeric string is a string consisting of lowercase English letters and digits.

	Input: s = "dfa12321afd"
	Output: 2
	Explanation: The digits that appear in s are [1, 2, 3]. The second largest digit is 2.

	Input 			----->  	String
	Output 			----->  	int


	Data Set:
		 Positive: 		---> Input: "dfa12321afd"						Output = 2
		 Negative: 		---> Input: "Sourav99"							Output = -1
		 Edge: 			---> Input: "Sachin10Tendulkar"					Output = 1
		 Edge: 			---> Input: "MSDho07ni"							Output = 7


	Pseudo Code:
		 1. Get the input String and initialise temp_largest=0, ctr=0, temp_secondLaregest=0
		 2. Filter only the numbers in it (ASCII Logic) 
		 3. Check if current number > second Largest and assign it to second Largest or Largest with other condition
		 4. Increment the counter an check for next largest number
		 5. Return temp if counter >1 else return -1

	 */
	@Test
	public void positiveTest()
	{
		Assert.assertEquals(2, findSecondLargestDigit("dfa12321afd"));
		
//		System.out.println(findSecondLargestDigit("Sachin10Tendulkar"));

	}

	@Test
	public void negativeTest()
	{
		Assert.assertEquals(-1, findSecondLargestDigit("Sourav99"));
	}

	@Test
	public void edgeTest()
	{
		Assert.assertEquals(0, findSecondLargestDigit("Sachin10Tendulkar"));
		Assert.assertEquals(0, findSecondLargestDigit("MSDho07ni"));
	}

	public int findSecondLargestDigit(String inpStr)
	{
		int ctr=0, temp_largest=-1, temp_secondLargest = -1;
		for (int i = 0; i < inpStr.length(); i++) 
		{
			if(inpStr.charAt(i)>47 && inpStr.charAt(i)<=57)
			{
				if(inpStr.charAt(i)>=temp_secondLargest)
				{
					if(inpStr.charAt(i)>temp_largest)
					{
						temp_secondLargest=temp_largest;
						temp_largest=inpStr.charAt(i);
						ctr++;
					}
					else if(inpStr.charAt(i)!=temp_largest)
					{
						if(inpStr.charAt(i)>temp_secondLargest)
						{
							temp_secondLargest=inpStr.charAt(i);
						}
						
						
					}
				}
			}

		}
		
		System.out.println("Counter: "+ctr+"Largest: "+temp_largest+"Second Largest: "+temp_secondLargest);

		if(ctr>1)
			return temp_secondLargest-48;
		else if (ctr==1 && (temp_secondLargest>=48))
			return temp_secondLargest-48;
		else
			return -1;


	}

}


package week3.day2;

import java.util.Arrays;

import org.junit.Test;
import org.junit.Assert;

public class HW8_Maximum69 {

	/*

Problem statement: 	 
You are given a positive integer num consisting only of digits 6 and 9.

Return the maximum number you can get by changing at most one digit (6 becomes 9, and 9 becomes 6).


	Input 			----->  	int
	Output 			----->  	int


	Data Set:
		 Positive: 		---> Input: 9669						Output = 9969
		 Negative: 		---> Input: 9996						Output = 9999
		 Edge: 			---> Input: 9999						Output = 9999


Pseudo Code:
 1. Get the input array and iterate in Nested loop -- Outer loop for Pivot .. LeftSum=0, RIghtSum=0
 2. In the inner loop, write the logic before pivot index and After Pivot Index  .. i> j .. ELse
 3. After the end of inner loop check for the condition of sum matching.. Return Index if matches
 4. Return -1 at the end

	 */

	@Test
	public void positiveTest()
	{
		Assert.assertEquals(9969, getMaximum69(9669));
	}

	@Test
	public void negativeTest()
	{
		Assert.assertEquals(9999, getMaximum69(9999));
	}

	@Test
	public void edgeTest()
	{
		Assert.assertEquals(9999, getMaximum69(9996));
		Assert.assertEquals(9, getMaximum69(6));
	}

	public int getMaximum69(int input)	
	{

		if(input<=9)
			return 9;

		int ctr=1,tracker = 0,rem;

		int temp=input;

		while(temp>0)
		{
			rem=temp%10;

			if(rem==6)
				tracker=ctr;

			temp=temp/10;
			ctr++;
		}

		if(tracker==0)
			return input;

		int Q1,Q2;

		temp=power(tracker);

		Q1=(input/temp)*temp;	

		rem=input%temp;

		temp=power(tracker-1);

		Q2=9*temp;

		rem=rem%temp;



		return Q1+Q2+rem;
	}

	int power(int exponent)  
	{  
		int power = 1;  

		for (int i = 1; i <= exponent; i++)   

			power = power * 10;  

		return power;  
	}  

}


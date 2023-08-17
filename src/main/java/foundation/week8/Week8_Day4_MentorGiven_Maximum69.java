package foundation.week8;

import org.junit.Test;

import java.util.Arrays;

import org.junit.Assert;


public class Week8_Day4_MentorGiven_Maximum69{

	/* 
Leetcode link: https://leetcode.com/problems/maximum-69-number/description/

Problem statement: 	
You are given a positive integer num consisting only of digits 6 and 9.

Return the maximum number you can get by changing at most one digit (6 becomes 9, and 9 becomes 6)

	Input 			----->  int
	Output 			----->  int


	Data Set:
		 Positive: 	---> Input: 9969			Output =  9999
		 Positive:  ---> Input: 9996			Output = 9999
		 Edge: 		---> Input: 6				Output =  9
		 Edge: 		---> Input: 9				Output =  9


	Pseudo Code:
	1. Get the input and initialise sum=0, prod=1
	2. Iterate through the input in while loop to separate digits with condition input>0
	3. Calculate rem = input%10, input = input/10.. 
	4. Update Sum and prod .. sum=sum+rem, prod=prod*rem
	5. Repeat steps 2 to 4 until num becomes 0
	6. Return prod - sum


	 */

	@Test	
	public void positiveTest()
	{

		Assert.assertEquals(9999, getMaximum69(9969));
		Assert.assertEquals(9999, getMaximum69(9996));
		Assert.assertEquals(9669, getMaximum69(6669));


		Assert.assertEquals(9999, getMaximum69_String(9969));	
		Assert.assertEquals(9999, getMaximum69_String(9996));
		Assert.assertEquals(9669, getMaximum69_String(6669));

	}

	
		@Test	
		public void edgeTest()
		{
			Assert.assertEquals(9, getMaximum69(6));
			Assert.assertEquals(9, getMaximum69(9));


			Assert.assertEquals(9, getMaximum69_String(6));	
			Assert.assertEquals(9, getMaximum69_String(9));
		}


	public int getMaximum69(int num) {

		int rem=0, ctr=0, rowTracker = 0, actualNum=num;

		if(num<9)
			return 9;

		while(num>0)
		{
			rem=num%10;

			num=num/10;
			
			ctr++;

			if (rem==6)
				rowTracker=ctr;
		}

		if(rowTracker==0)
			return actualNum;

		if(rowTracker==1)
			return actualNum+3;

		int temp=powerOfNum(rowTracker-1);

		rem=actualNum%temp;

		num=((actualNum/temp)+3)*temp;

		return num+rem ;

	}

	public int powerOfNum(int n)
	{
		int res=1;
		for(int i=0; i<n;i++)
			res=res*10;

		return res;
	}

	public int getMaximum69_String(int num) {		

		return Integer.valueOf(String.valueOf(num).replaceFirst("6", "9"));

	}

}

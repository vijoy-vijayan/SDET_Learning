package foundation.week2.day2;

import org.junit.Assert;
import org.junit.Test;

/* 
HW5--> Problem statement: 
 Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.

 
 Assumption
 
Input 			----->  	int
Output 			----->  	int
 
 
Data Set:
	 Positive: 	Input: 	438		---> 		Output = 6
	 Negative: 	Input: 	28		---> 		Output = 1
	 Edge: 		Input: 	1		---> 		Output = 1
 
Pseudo Code:
	 1. Get the integer and check num <10 Return actual num.. Intialise total=0
	 2. If num>9 ... Iterate through the number in While loop(n>0) Getting a digit at a time Ex: rem=n%10
	 3. Update num by num/10 and track the remainder with variabe total=total+rem
	 4. Add additional condition in the loop if(num=0 and tota>9) and continue
	 5. return total at the end of function
 
 
 */

public class Week2_HW8_SumOfDigits {
	
	@Test
	public void positiveTest()
	{
		Assert.assertEquals(6,getSumOfDigits(438));
		Assert.assertEquals(1,getSumOfDigits(28));
		Assert.assertEquals(8,getSumOfDigits(1007));
		Assert.assertEquals(9,getSumOfDigits(99999));
		
	}
	
	@Test
	public void negativeTest()
	{
		Assert.assertEquals(0,getSumOfDigits(0));
	}
	
	@Test
	public void edgeTest()
	{
		Assert.assertEquals(1,getSumOfDigits(10));
	}


	public int getSumOfDigits(int num)
	{
		
		int total=0,rem=0;
		
		if(num<10)
			return num;
		
		while(num>0)
		{
			rem=num%10;
			total=total+rem;
			num=num/10;
			
			if(num==0 && total>9)
			{
				num=total;
				total=0;
			}
		}
		
		return total;
	}

}

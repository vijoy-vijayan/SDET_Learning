package week2.day2;

import org.junit.Assert;
import org.junit.Test;

/* 
Problem statement: 
 
Given an integer n, return true if it is a power of two. Otherwise, return false.

An integer n is a power of two, if there exists an integer x such that n == 2x.
 
Input 			----->  	int
Output 			----->  	boolean
 
 
Data Set:
	 Positive: 	8 				---> 		Output: true
	 Negative: 	0 				---> 		Output = false
	 Edge: 		1 				---> 		Output = true
 

Pseudo Code:
	 1. Get the input : num
	 2. Iterate through the condition if the number > 0
	 3. Loop until the n become <=0
	 4. Break loop if the num and rem are 1becomes 1 inside the loop
	 4. Check for the remainder and if its greater than 0, return false
	 5. Return true at the end of the function
 
 */

public class Week2_CW2_PowerOf2 {
	
	@Test
	public void positiveTest()
	{
		Assert.assertEquals(true,isPowerOfTwo(8));
		Assert.assertEquals(true,isPowerOfTwo(32));
		Assert.assertEquals(false,isPowerOfTwo(100));
		
	}
	
	@Test
	public void negativeTest()
	{
		Assert.assertEquals(false,isPowerOfTwo(5));
		
	}
	
	@Test
	public void edgeTest()
	{
		Assert.assertEquals(true,isPowerOfTwo(1));
		
	}



	public boolean isPowerOfTwo(int num)
	{
		int rem=0;
		
		if(num<0)
			return false;
		
		while(num>1)
		{
			rem=num%2;
			num=num/2;
			
			
			System.out.println("Quotient: "+num+"... Remainder"+rem);
			
			if(num==1&&rem==1)
				break;
			
			if (rem>0)
			{
				System.out.println("Remainder condition");
				return false;
			}
						
		}

		return true;
	}

}

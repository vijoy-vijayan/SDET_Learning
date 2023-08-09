package foundation.week2.day1;

import org.junit.Assert;
import org.junit.Test;

class Week2_HW4_PrimeNumber {
	
	/* 
 
Problem Statement: Check if the given number is prime or not
	 * 
	 * Input: an Integer
	 * 
	 * Output : Boolean
	 * 
	 * Pseudo code: 
	 * Get the input number
	 * Iterate from 2 to n-1 and check for the remainder for the given number. If remainder > 0, return false
	 * Return True after the loop
	 * 
	 * 
	 */

	@Test
	void Positivetest() {
		Assert.assertEquals(true,checkPrimeNumber(13));
				
	}
	
	@Test
	void Negativetest() {
		Assert.assertEquals(false,checkPrimeNumber(6));
	}
	
	@Test
	void Edgetest() {
		Assert.assertEquals(true,checkPrimeNumber(1));
	}
	
	
	public boolean checkPrimeNumber(int input)
	{
		if (input==1)
				return true;
		
		for(int i=2;i<input;i++)
		{
			if(input%i==0)
				return false;
		}
		
		return true;
		
	}

}

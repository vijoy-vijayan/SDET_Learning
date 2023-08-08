package foundationCourse;

import org.junit.Assert;
import org.junit.Test;

class PrimeNumberCount {
	
	/* Question: Check the count of prime number from the given integer
	 * 
	 * Input: an Integer
	 * 
	 * Output : Integer
	 * 
	 * Test Data:
	 * 
	 * Positive Data: Input : 13 Output : 6
	 * 
	 * Negative Data: Input:1   Output :0  
	 * 
	 * Edge Data: Input:0   Output : 0 
	 * 
	 * Pseudo code: 
	 * Get the input number
	 * 
	 * Iterate through the input number and increment the counter if the given input is prime
	 * 
		 Prime Number Logic:		  
		  					Iterate from 2 to n-1 and check for the remainder for the given number. If remainder > 0, return false
		  					Return True after the loop
		  					
	* Return the counter at the end
	 * 
	 * 
	 */

	@Test
	void Positivetest() {
		Assert.assertEquals(6,countPrimeNumbers(13));
		Assert.assertEquals(15,countPrimeNumbers(51));
	}
	
	@Test
	void Negativetest() {
		Assert.assertEquals(0,countPrimeNumbers(1));
	}
	
	@Test
	void Edgetest() {
		Assert.assertEquals(0,countPrimeNumbers(0));
	}
	
	public int countPrimeNumbers(int input)///  13 --> 1,2,3,5,7,11,13
	{		
		int count=0;
		
		while(input>0)
		{
			if(checkPrimeNumber(input))
				count++;			
			
			input--;
		}
		return count;
	}
	
	
	public boolean checkPrimeNumber(int input)
	{
		if (input==1)
				return false;
		
		for(int i=2;i<input;i++)
		{
			if(input%i==0)
				return false;
		}
		
		return true;
		
	}

}

package week2.day2;

import org.junit.Assert;
import org.junit.Test;

/* 
Problem statement: 
 Given an integer x, return true if x is a palindrome and false otherwise.
 
 
Input 			----->  	int
Output 			----->  	boolean
 
 
Data Set:
	 Positive: 	Input:121 			---> 		Output = true
	 Negative: 	Input:-121 			---> 		Output = false
	 Edge: 		Input:1 			---> 		Output = true
 
Pseudo Code:
	 1. Get the input number and return false if number is negative
	 2. Loop through the the half array and check the i position element with the lenght-i position element 
	 3. Return false if not matching
	 4. return true at the end of the method 
 
 */

public class Week2_HW4_Palindrome {
	
	@Test
	public void positiveTest()
	{
//		Assert.assertEquals(1,1);
		
		Assert.assertEquals(false,isNewPalindrome(1234)); // 4 *1000 + 3*100 + 2*10 
		
		Assert.assertEquals(true,isNewPalindrome(5121215));
		
	}
	
	@Test
	public void negativeTest()
	{
		Assert.assertEquals(false,isNewPalindrome(-121));
	}
	
	@Test
	public void edgeTest()
	{
		Assert.assertEquals(true,isNewPalindrome(0));
		Assert.assertEquals(true,isNewPalindrome(1));
	}


	public boolean isPalindrome(int num)
	{
		int ctr=0, rem=0,newNum=0,temp;
		
		int actualNum=num;
		if(num<0)
			return false;
		
		temp=num;
		
		//FInding Length of String
		while(temp>0)
		{
			temp=temp/10;
			ctr++;
		}
		
		ctr--;
		
		while(num>0)
		{
			temp=1;
			rem=num%10;
			num=num/10;
			
			
			System.out.println("Remainder"+rem);
			
			for(int i=0;i<ctr;i++)
				temp=temp*10;
			
			newNum=newNum+(temp*rem);
			ctr--;
		}
		
		System.out.println(newNum);
		
		
		
		return newNum==actualNum;

		
	}
	
	public boolean isNewPalindrome(int num)
	{
		int actualNum=num;
		
		int reverseNum=0, rem=0;
		
		if(num<0)
			return false;
		
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			
			reverseNum=reverseNum*10+rem;
			
		}
		
		System.out.println("Actual Numer: "+actualNum+"... Reversed Number: "+reverseNum);
		
		return actualNum==reverseNum;

		
	}

}

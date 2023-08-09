package foundation.week5;

import org.junit.Test;

import org.junit.Assert;




public class CW_MentorGiven {

	/* 
	Problem statement: 	 

	 
	Input 			----->  	
	Output 			----->  	
	 
	 
	Data Set:
		 Positive: 	---> Input: 		Output = 
		 Negative: 	---> Input: 		Output = 
		 Edge: 		---> Input: 		Output = 
	 
	Pseudo Code:
		
		 
	 
	 */
	
	@Test	
	public void test()
	{
		System.out.println(findSingleDigitResult(1));
	}
	public int findSingleDigitResult(int num)
	 {
		if(num<=9)
			return num;
		
		int res=0,rem=0;
		
		
		
		while(num>0)
		{
			rem=num%10;
			
			res=res+rem;
			
			num=num/10;
			
			if((num==0)&&(res>9))
			{
				num=res;
				res=0;
			}
		}
		
		return res;
	 }
	
	/*
	input number = number
	add digits
	output - single digit*/
	
	
	
	public void print1to100()
	{
		
		for(int i='a'-'a';i<='d';i++)
			System.out.println(i);
	}
	
}

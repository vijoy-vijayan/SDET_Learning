package foundation.week5;

import org.junit.Test;

import org.junit.Assert;




public class HW3_signOfProductOfAnArray {

	/* 
	Problem statement: 	 
There is a function signFunc(x) that returns:

1 if x is positive.
-1 if x is negative.
0 if x is equal to 0.
You are given an integer array nums. Let product be the product of all values in the array nums.

Return signFunc(product).


	 */

//	@Test
//	public void positiveTest()
//	{
//		Assert.assertEquals("Saturday",getDayofWeek(15,8,1993));
//		
//	}
//
//	@Test
//	public void negativeTest()
//	{
//		Assert.assertEquals("Saturday",getDayofWeek(18,7,1999));
//	}

	@Test
	public void edgeTest()
	{
//		Assert.assertEquals(1,getSignOfProductArray(new int[] {1,1,-1,-1, 100}));
		
//		Assert.assertEquals("Saturday",getDayofWeek(31,8,2019));
		
		System.out.println(findLeapYear(2100));
	}





	public String getDayofWeek(int day, int month, int year )
	{
		String[] arrDaysofWeek={"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		
		int[] arrDaysOfMonth= {31,28,31,30,31,30,31,31,30,31,30,31};
		
		int noOfDays=day;
		
		for(int i=0; i<month; i++)
		{
			noOfDays=noOfDays+arrDaysOfMonth[i];
		}

		if(year%4==0)
			noOfDays++;
		
		return arrDaysofWeek[(noOfDays+5)%7];
	}
	
	
	/*A century year is a year ending with 00. 
	 * 
	A century year is a leap year only if it is divisible by 400.
	A leap year (except a century year) can be identified if it is exactly divisible by 4.
	A century year should be divisible by 4 and 100 both.
	A non-century year should be divisible only by 4.
	
	*/
	
	
	
	public boolean findLeapYear(int n)
	{
		
			boolean leapYear = false;

		
			if(n%100==0)
				leapYear=n%400==0;
			else 
				leapYear=(n%4==0);
				
			if(n%100==0){
	            System.out.println("inside 100");
	            if(n%400==0){
	                leapYear = true;
	            }
	        } else {
	            if(n%4==0){
	                leapYear = true;
	            }
	        }
			
			
			return leapYear;
	}




}

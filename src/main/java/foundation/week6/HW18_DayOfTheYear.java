package foundation.week6;

import org.junit.Test;

import java.util.Arrays;

import org.junit.Assert;




public class HW18_DayOfTheYear{

	/* 
Leetcode link: https://leetcode.com/problems/day-of-the-year/

Problem statement: 	
Given a string date representing a Gregorian calendar date formatted as YYYY-MM-DD, 
return the day number of the year.

	Input 			----->  String
	Output 			----->  int


	Data Set:
		 Positive: 	---> Input: "2019-01-09"		Output =  9
		 Edge: 		---> Input: "2019-02-10"	Output =  41


	Pseudo Code:
	1. Get the String and get the year, month and day separately by using split method
	2. Create an integer array to track all the days of the year 
	3. Loop through the month and add all the days of teh respective months from 1 to currentMonth
	4. Return the total days
	5. Handle the Leap year logic, if error is thrown
	 */

	@Test	
	public void positiveTest()
	{
		Assert.assertEquals(9, getDayOfTheYear("2019-01-09"));
		Assert.assertEquals(41, getDayOfTheYear("2019-02-10"));
	}


//	@Test	
//	public void edgeTest()
//	{
//		Assert.assertArrayEquals(new int[] {4,3,2,1,0}, getShortestDistance("aaaab",'b'));
//	}

	public short getDayOfTheYear(String date) {
		
		short res=0;

		short[] daysOfMonth= {31,28,31,30,31,30,31,31,30,31,30,31};	
		
		String[] split = date.split("-");
		
		int givenYear=Integer.parseInt(split[0]);
		int givenMonth=Integer.parseInt(split[1]);
		int givenDays=Integer.parseInt(split[2]);
		
		for(byte i=1; i<givenMonth; i++)
		{
			res=(short) (res+daysOfMonth[i-1]);
		}

		

		return (short) (res+givenDays);

	}
	
	
	




}

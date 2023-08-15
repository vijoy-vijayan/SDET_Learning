package foundation.week6;

import org.junit.Test;

import java.util.Arrays;

import org.junit.Assert;




public class Week6_Day5_HW_DayOfTheWeek{

	/* 
Leetcode link: https://leetcode.com/problems/day-of-the-week/

Problem statement: 	
Given a date, return the corresponding day of the week for that date.

The input is given as three integers representing the day, month and year respectively.

Return the answer as one of the following values 
{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"}.

	Input 			----->  int, int, int
	Output 			----->  String


	Data Set:
		 Positive: 	---> Input: day = 31, month = 8, year = 2019		Output =  "Saturday"
		 Edge:  	---> Input: day = 1, month = 3, year = 2100			Output =  "Monday"
		 Edge: 		---> Input: day = 18, month = 7, year = 1999		Output =  "Sunday"


	Pseudo Code:
	1. Set the base value with the current day and the date
	2. Get the input details and calculate the total number of days involved
	3. Apply the weekly logic to find the days
	4. Handle the Leap Year logic
	5. Return the current weekday with the pointer value found from the number of days
	4. Check for past and future dates

	 */

	@Test	
	public void positiveTest()
	{
		Assert.assertEquals("Saturday", getDayOfTheWeek(12,8,2023));
		//		Assert.assertEquals(41, getDayOfTheYear("2019-02-10"));
	}


	//	@Test	
	//	public void edgeTest()
	//	{
	//		Assert.assertArrayEquals(new int[] {4,3,2,1,0}, getShortestDistance("aaaab",'b'));
	//	}

	public String getDayOfTheWeek(int day, int month, int year) {

		int referenceYear=2023, referenceMonth=8, referenceDay=11;

		String referenceWeekDay="Friday";

		String[] arrDaysofWeek={"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

		int[] arrDaysOfMonth= {31,28,31,30,31,30,31,31,30,31,30,31};

		int totalMonths=12;




		int temp=0;
		if(year>=referenceYear)
		{
			temp=referenceYear;
			referenceYear=year;
			year=temp;

			if(month>=referenceMonth)
			{
				temp=referenceMonth;
				referenceMonth=month;
				month=temp;
				
				if(month==referenceMonth)
					totalMonths=month;

				if(day>=referenceDay)
				{
					temp=referenceDay;
					referenceDay=day;
					day=temp;
				}
			}
		}
		
		
		int noOfDays=arrDaysOfMonth[month-1]-day;
		month++;

		System.out.println(noOfDays+referenceDay);
		
		boolean sameYearMonthFlag=false;

		for(int currentYear=year; currentYear<=referenceYear; currentYear++)
		{
			if((currentYear%4==0)&&(month<=2))
			{
				if(currentYear%100==0)						{
					if(currentYear%400==0)
						noOfDays++;
				}
				else
					noOfDays++;

			}

			for(int currentMonth=month-1; currentMonth<totalMonths; currentMonth++)
			{
				System.out.println("Month: "+currentMonth+"Total Days: "+arrDaysOfMonth[currentMonth]);
				noOfDays=noOfDays+arrDaysOfMonth[currentMonth];
			}

			if(currentYear!=referenceYear)
				month=1;

			if(currentYear==referenceYear-1)
			{
				totalMonths=referenceMonth-1;
				sameYearMonthFlag=true;
			}

		}

		noOfDays=noOfDays+referenceDay;
		
		if(sameYearMonthFlag)
			noOfDays=referenceDay-day;
				

		System.out.println("Total Number of Days: "+noOfDays);

		int pointer, shiftLeft=noOfDays%7;



		for (pointer = 0; pointer < arrDaysofWeek.length; pointer++) {
			if(referenceWeekDay.equals(arrDaysofWeek[pointer]))
				break;					
		}

		if(pointer>=shiftLeft)			
			return arrDaysofWeek[pointer-shiftLeft];
		else
			return arrDaysofWeek[shiftLeft];

	}







}

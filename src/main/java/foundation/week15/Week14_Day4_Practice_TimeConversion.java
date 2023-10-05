package foundation.week15;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;


public class Week14_Day4_Practice_TimeConversion {

	/* 
Leetcode link: https://www.hackerrank.com/challenges/time-conversion/problem?isFullScreen=true


	Input 			----->  String
	Output 			----->  String

    Data Set:
		 Edge: 	    ---> Input: "12:00:02AM"		Output =    "00:00:02"
		 Edge: 	    ---> Input: "12:59:59PM"		Output =    "12:59:59"
		 Positive: 	---> Input: "05:30:55PM"		Output =    "17:30:55"


	Pseudo Code: ASCII Array
        1. Get the input String and initialise a StringBuilder
        2. Get the last two character of String for checking AM/PM
        3. If AM, check if the hour clock is in the time 12 and covert it to 0 , else no action
        4. If PM, check if the hour clock is 12 and do not change anything, else add 12 with hour clock
        5. Return the final String


Best Solution :

Learning:


	 */

    @Test
    public void allTests() {

        Assert.assertEquals("00:00:02",militaryTimeConversion("12:00:02AM"));
        Assert.assertEquals("12:59:59",militaryTimeConversion("12:59:59PM"));
        Assert.assertEquals("17:30:55",militaryTimeConversion("05:30:55PM"));



    }

    public String militaryTimeConversion(String s) {

        StringBuilder res=new StringBuilder(s);

        String[] split = s.split(":");

        if(split[2].substring(2).equals("AM"))
        {
            if(split[0].equals("12"))
                res.replace(0, 2, "00");
        }
        else {
            if(!split[0].equals("12"))
                res.replace(0, 2, String.valueOf(Integer.parseInt(split[0])+12));

        }
        res.delete(res.length() - 2, res.length());


        return res.toString();
    }



}


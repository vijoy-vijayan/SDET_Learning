package foundation.week12;

import org.junit.Assert;
import org.junit.Test;


public class Week12_Day5_HW_ValidWords {

	/* 
Leetcode link: https://leetcode.com/problems/minimum-additions-to-make-valid-string/

Problem statement: 	
Given a string word to which you can insert letters "a", "b" or "c" anywhere and any number of times, return the minimum number of letters that must be inserted so that word becomes valid.

A string is called valid if it can be formed by concatenating the string "abc" several times.


	Input 			----->  String
	Output 			----->  int

	Data Set:
		 Positive: 	---> Input: "bbbb"			    Output =  8
		 Negative: 	---> Input: "abbaabb"			    Output =  abcabcabcabcabc
		 Edge: 	    ---> Input: "a",[0]		                    Output =  "a"



	Pseudo Code:
	1. Get the input string and int array. Initialise string builder object with actual string
	2. Loop through the int array
	3. Get the element of the array and use that as index of s.charAT and get the character
	4. Append the chcracter to the same index in string builder object
	5. Covert object to String and return

	Learning: Learnt SetLength method of String builder class

	 */

    @Test
    public void allTests() {

        temp();




    }

    public void temp(){
        int i = 0, j = 3;
        for(;i < 3 && j > 0;i++, j--);
        {
            System.out.print(i + " " + j + ", ");
        }
    }
}


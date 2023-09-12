package foundation.week12;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;


public class Week12_Day1_HW_FaultyKeyboard {

	/* 
Leetcode link: https://leetcode.com/problems/faulty-keyboard/

Problem statement: 	
Your laptop keyboard is faulty, and whenever you type a character 'i' on it, it reverses the string that you have written. Typing other characters works as expected.

You are given a 0-indexed string s, and you type each character of s using your faulty keyboard.

Return the final string that will be present on your laptop screen.


	Input 			----->  String
	Output 			----->  String

	Data Set:
		 Positive: 	---> Input: "string"			    Output =  "rtsng"
		 Negative: 	---> Input: "apple"	                Output =  "apple"
		 Edge: 	    ---> Input: "endiai"				Output= "aend"
		 Edge: 	    ---> Input: missyou				    Output =  "mssyou"



	Pseudo Code:
	1. Get the input String and intiate stringbuilder object to store result
	2. Iterate through its characters and check the below condition
	3. If character==i, then reverse the string builder
	    ELse Append the character to the string builder
	4. Covert SB to string and return the result


	Best Solution: https://leetcode.com/problems/sorting-the-sentence/solutions/1213443/java-simple-solution-runtime-0-ms-o-n/

	Learning: Could have made use of Split array itself as we already have index in Input String

	 */

    @Test
    public void allTests() {

        //Positive
        Assert.assertEquals("rtsng", faultyKeyboardResult("string"));

        //Negative
        Assert.assertEquals("apple", faultyKeyboardResult("apple"));
        //Edge

        Assert.assertEquals("aend", faultyKeyboardResult("endiai"));
        Assert.assertEquals("mssyou", faultyKeyboardResult("missyou"));

    }

    public String faultyKeyboardResult(String s) {

        StringBuilder result = new StringBuilder();

        for (int eachCharacter = 0; eachCharacter < s.length(); eachCharacter++) {

            if(s.charAt(eachCharacter)=='i')
                result.reverse();
            else
                result.append(s.charAt(eachCharacter));
        }
        return result.toString();
    }
}


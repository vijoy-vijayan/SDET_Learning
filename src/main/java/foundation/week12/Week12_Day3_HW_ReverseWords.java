package foundation.week12;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;


public class Week12_Day3_HW_ReverseWords {

	/* 
Leetcode link: https://leetcode.com/problems/reverse-words-in-a-string-iii/

Problem statement: 	
Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.


	Input 			----->  String
	Output 			----->  String

	Data Set:
		 Positive: 	---> Input: "Gardening is a good hobby"			    Output =  "gninedraG si a doog ybboh"
		 Negative: 	---> Input: "!@#$% ^&*() TesteR"			        Output =  "%$#@! )(*&^ RetseT"
		 Edge: 	    ---> Input: "ExcelletTiming."			            Output =  ".gnimiTtellecxE"



	Pseudo Code:
	1. Get the input string and split it using space. Initialise String builder object
	2. Iterate through the words array
    3. Reverse the word and append to object and add space
    4. Convert the object to String and return

	Learning: Learnt SetLength method of String builder class

	 */

    @Test
    public void allTests() {

        //Positive
        Assert.assertEquals("gninedraG si a doog ybboh", reverseWords("Gardening is a good hobby"));

        //Negative
        Assert.assertEquals("%$#@! )(*&^ RetseT", reverseWords("!@#$% ^&*() TesteR"));

        //Edge
        Assert.assertEquals(".gnimiTtellecxE", reverseWords("ExcelletTiming."));


    }

    public String reverseWords(String s) {

        StringBuilder result =new StringBuilder();
        StringBuilder temp =new StringBuilder();

        String[] words = s.split(" ");

        if(words.length==1)
            return result.append(s).reverse().toString();

        for(String eachWord:words) {
            temp.append(eachWord).reverse().append(" ");
            result.append(temp);
            temp.setLength(0);
        }


        result.deleteCharAt(result.length()-1);
        return result.toString();
    }
}


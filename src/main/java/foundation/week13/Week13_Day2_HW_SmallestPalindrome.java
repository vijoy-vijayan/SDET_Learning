package foundation.week13;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;


public class Week13_Day2_HW_SmallestPalindrome {

	/* 
Leetcode link: https://leetcode.com/problems/lexicographically-smallest-palindrome/description/

Problem Statement:
You are given a string s consisting of lowercase English letters, and you are allowed to perform operations on it. In one operation, you can replace a character in s with another lowercase English letter.

Your task is to make s a palindrome with the minimum number of operations possible. If there are multiple palindromes that can be made using the minimum number of operations, make the lexicographically smallest one.

A string a is lexicographically smaller than a string b (of the same length) if in the first position where a and b differ, string a has a letter that appears earlier in the alphabet than the corresponding letter in b.

Return the resulting palindrome string.

	Input 			----->  String
	Output 			----->  String

	Data Set:
		 Positive: 	---> Input: "india"			            Output =  "aidia"
		 Positive: 	---> Input: "madam"                     Output =  "madam"
		 Negative: 	---> Input: "abcd"                      Output =  "abba"
		 Negative: 	---> Input: "maddam"                    Output =  "maddam"
		 Edge: 	    ---> Input: "v"				            Output=   "v"
		 Edge: 	    ---> Input: "pop"				        Output =  "pop"

	Pseudo Code:
	1. Get the input String and intiialise start and end as o
	2. Convert the String to charArray
	3. Iterate through the loop with the condition start<end
	4. Check for the conditions... if(char[start)>char[end]).. > char[start)=char[end]
	    if(char[start)<char[end]).. > char[end]=char[start]

	 5. Increase both start++, end++
	 6. Convert charArray to String at the end and return



	 */

    @Test
    public void allTests() {

        //Positive
        Assert.assertEquals("aidia", smallestPalindromw("india"));
        Assert.assertEquals("madam", smallestPalindromw("madam"));
        Assert.assertEquals("abba", smallestPalindromw("abcd"));
        Assert.assertEquals("maddam", smallestPalindromw("maddam"));
        Assert.assertEquals("v", smallestPalindromw("v"));
        Assert.assertEquals("pop", smallestPalindromw("pop"));


    }

    public String smallestPalindromw(String s) {

        char[] charArray = s.toCharArray();

        int start=0,end= charArray.length-1;

        while(start<end)
        {
            if(charArray[start]>charArray[end])
                charArray[start]=charArray[end];
            else if(charArray[start]<charArray[end])
                charArray[end]=charArray[start];

            start++;
            end--;
        }


        return new String(charArray);
    }
}


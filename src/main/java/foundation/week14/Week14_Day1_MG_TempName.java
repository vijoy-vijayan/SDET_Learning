package foundation.week14;

import org.junit.Assert;
import org.junit.Test;


public class Week14_Day1_MG_TempName {

	/* 
Leetcode link: https://leetcode.com/problems/reverse-string/

Problem Statement:
You are given a string s consisting of lowercase English letters, and you are allowed to perform operations on it. In one operation, you can replace a character in s with another lowercase English letter.

Your task is to make s a palindrome with the minimum number of operations possible. If there are multiple palindromes that can be made using the minimum number of operations, make the lexicographically smallest one.

A string a is lexicographically smaller than a string b (of the same length) if in the first position where a and b differ, string a has a letter that appears earlier in the alphabet than the corresponding letter in b.

Return the resulting palindrome string.

	Input 			----->  String[]
	Output 			----->  String[]

	Data Set:
		 Positive: 	---> Input: "india"			            Output =  "aidni"
		 Positive: 	---> Input: "Java"                      Output =  "avaJ"
		 Negative: 	---> Input: "!@#$special%^&*"           Output =  "*&^%laiceps$#@!"
		 Edge: 	    ---> Input: "v"				            Output=   "v"
		 Edge: 	    ---> Input: "pop"				        Output =  "pop"

	Pseudo Code:
	1. Get the String array and initialise start as 0, end less than length of array, temp as ''
	2. Iterate through the loop with condition left<right
	3. Swap elements of left and right using temp variable
	4. Increment left and decrement right
    5. Return the String array



	 */

    @Test
    public void allTests() {

        //Positive
//        Assert.assertEquals("aidia", ReverseString("india"));



    }

    public char[] ReverseString(char[] s) {

       int left=0,right=s.length-1;
       char temp;

       while(left<right)
       {
           temp=s[left];
           s[left++]=s[right];
           s[right--]=temp;

       }
        return s;
    }
}


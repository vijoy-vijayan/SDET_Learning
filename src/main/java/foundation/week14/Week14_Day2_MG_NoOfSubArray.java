package foundation.week14;

import org.junit.Assert;
import org.junit.Test;


public class Week14_Day2_MG_NoOfSubArray {

	/* 
Leetcode link: https://leetcode.com/problems/number-of-sub-arrays-of-size-k-and-average-greater-than-or-equal-to-threshold/description/

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

	Pseudo code:
    1. Get the input array, k and threshold value and initialise left,right. ctr as 0, avg
         Handle special condition of threshold=0, we can send the result right away
    2. Calculate the initial sum value k size by incrementing right
    3. Iterate through right reaching the length of the array
    4. Apply the sliding window approach of decrementing the left element and incrementing the right
    5. Check sum of updated elements and find the average
    6. Increment the ctr if avg>= threshold
    7. return the ctr



	 */

    @Test
    public void allTests() {

        //Positive
        Assert.assertEquals(3, findNoOfSubArray(new int[]{2,2,2,2,5,5,5,8},3,4));


    }

    public int findNoOfSubArray(int[] arr, int k, int threshold) {

        int right = 0, ctr = 0,sum=0;

        if(threshold==0)
            return arr.length-k+1;

        for(;right<k;right++)
            sum+=arr[right];

        while(right<arr.length)
        {

            if(sum/k>=threshold)
                ctr++;
            sum=sum+arr[right]-arr[right-k];right++;
        }

        if(sum/k>=threshold)
            ctr++;

        return ctr;

    }
}


package foundation.week12;

import org.junit.Assert;
import org.junit.Test;


public class Week12_Day6_CW_ReverseString {

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

//        reverseString("java");

        Assert.assertArrayEquals(new int[]{0,1},findIndices(new int[]{1,3,5},4));
        Assert.assertArrayEquals(new int[]{0,3},findIndices(new int[]{2,3,5,7},9));
        Assert.assertArrayEquals(new int[]{1,4},findIndices(new int[]{1,2,3,5,7,9},9));
        Assert.assertArrayEquals(new int[]{0,1},findIndices(new int[]{1,2},3));
        Assert.assertArrayEquals(new int[]{0,5},findIndices(new int[]{0,0,0,0,0,0},0));


    }

    public void reverseString(String x){

        /*StringBuilder res=new StringBuilder();
        for(int i=x.length()-1;i>=0;i--)
            res.append(x.charAt(i));*/

        int start=0;
        int end=x.length()-1;
        char temp;

        char[] charArray = x.toCharArray();
        while(start<end)
        {
            temp=charArray[start];
            charArray[start]=charArray[end];
            charArray[end]=temp;

            start++;
            end--;
        }


//        System.out.println(res.toString());
        System.out.println(String.valueOf(charArray));
    }

    public int[] findIndices(int[] arr, int target)
    {
        int start=0,end=arr.length-1;
        while(start<end)
        {
            if(arr[start]+arr[end]==target)
                return new int[]{start,end};
            else if(arr[start]+arr[end]>target)
                end--;
            else if (arr[start]+arr[end]<target)
                start++;
        }
            return new int[]{-1,-1};
    }
}

/*
Pseudo code:
1. Get the input array, input target..
2. Initiate the start as 0, end as arr.length -1
3. Iterate through the while until the condition start<end
4. CHeck for the conditions.. If(arr[start]+arr[end]==target) return res[start,end]
    else if(arr[start]+arr[end]>target) end--;
    else if(arr[start]+arr[end]>target) start++;
5. return [-1,-1] at the end
 */


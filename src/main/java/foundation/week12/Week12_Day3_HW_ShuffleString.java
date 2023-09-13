package foundation.week12;

import org.junit.Assert;
import org.junit.Test;


public class Week12_Day3_HW_ShuffleString {

	/* 
Leetcode link: https://leetcode.com/problems/shuffle-string/description/

Problem statement: 	
You are given a string s and an integer array indices of the same length. The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.

Return the shuffled string.


	Input 			----->  String, int[]
	Output 			----->  String

	Data Set:
		 Positive: 	---> Input: "yojiv",[4,3,2,1,0]			    Output =  "vijoy"
		 Negative: 	---> Input: "java",[1,2,3,0]			    Output =  "avaj"
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

        //Positive
        Assert.assertEquals("vijoy", restoreString("yojiv",new int[]{4,3,2,1,0}));


        //Negative
        Assert.assertEquals("ajav", restoreString("java",new int[]{1,2,3,0}));

        //Edge
        Assert.assertEquals("a", restoreString("a",new int[]{0}));




    }

    public String restoreString(String s, int[] indices){

        StringBuilder result =new StringBuilder(s);

        for (int i = 0; i < indices.length; i++)
            result.setCharAt(indices[i],s.charAt(i));

        return result.toString();
    }
}


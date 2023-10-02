package foundation.missingProblems;

import org.junit.Assert;
import org.junit.Test;


public class MP_NiceSubString {

	/* 
Leetcode link: https://leetcode.com/problems/longest-nice-substring/description/


	Input 			----->  String
	Output 			----->  String

	Data Set:
		 Positive: 	---> Input: "YazaAay"			    Output =  "aAa"
		 Positive: 	---> Input: "vijoyAaBbCcvijayan"	Output =  "AaBbCc"
		 Negative: 	---> Input: "xyz"	                Output =  ""
		 Negative: 	---> Input: "Vv"	                Output =  "Vv"


	Pseudo Code:
	1. Get the input String and initialise the StringBuilder res
	2. Iterate through the length to check the initial window .. Condition charAt(i) of case should be equal to sharAt(i+1) of opposite case
	3. Store the count of substring
	4. Iterate through the remaining string checking for the possibility of match of previously found characters
	5. Return res at the end


	Learning:

	 */

    @Test
    public void allTests() {


/*

        Positive: 	---> Input: "YazaAay"			    Output =  "aAa"
        Positive: 	---> Input: "vijoyAaBbCcvijayan"	Output =  "AaBbCc"
        Negative: 	---> Input: "xyz"	                Output =  ""
        Negative: 	---> Input: "Vv"	                Output =  "Vv"
*/



    }

    public String getLongestSubString(String s) {
        StringBuilder res=new StringBuilder();

        int right=0;

        int resAbsolute=Math.abs(s.charAt(right++)-s.charAt(right));

        while(resAbsolute!=32)
        {
            resAbsolute=Math.abs(s.charAt(right++)-s.charAt(right));
        }

        return res.toString();
    }
}


package foundation.week13;

import org.junit.Assert;
import org.junit.Test;


public class Week13_Day7_CW_ConsecutiveCharacters {

	/* 
Leetcode link:https://leetcode.com/problems/consecutive-characters/description/


	Input 			----->  String
	Output 			----->  int

	Data Set:
		 Positive: 	---> Input: "Leetcode"	                Output =  2
		 Positive: 	---> Input: "abbbcccee"                 Output =  3
		 Negative: 	---> Input: "abcde"                     Output =  1
		 Edge: 	    ---> Input: "a"			                Output=   1
		 Edge: 	    ---> Input: "xxxxxx"				    Output =  6

	Pseudo Code:
	1. Get the input array and initialise left=0, right=0, resCount=0, tempCount=0
	2. Iterate through the length of the String with condition right<length
	3. Expand the right and check its value with the left value
	4. If both are same .. Increment the right value amd increment the ctr
	5. Else assign right to left and increment the right
	6. return the counter

	 */

    @Test
    public void allTests() {

        //Positive

        Assert.assertEquals(2, getConsecutiveCharactersLength("leet"));
        Assert.assertEquals(3, getConsecutiveCharactersLength("abbbcccee"));
        Assert.assertEquals(1, getConsecutiveCharactersLength("abcde"));
        Assert.assertEquals(1, getConsecutiveCharactersLength("a"));
        Assert.assertEquals(6, getConsecutiveCharactersLength("xxxxxx"));


    }

    public int getConsecutiveCharactersLength(String s) {//1,2,3,4,5  10

        int left = 0, right = 0, ctr = 0;

        while (right < s.length()) {
            if (s.charAt(right) == s.charAt(left)) {
//                ctr = Math.max(ctr, right - left + 1);

                ctr = (right - left + 1 > ctr) ?  right - left + 1: ctr;
                right++;
            } else {
                left = right;
                right++;
            }
        }
        return ctr;
    }


}


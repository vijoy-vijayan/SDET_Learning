package foundation.week17;

import org.junit.Assert;
import org.junit.Test;


public class Week17_Day1_HW_UniqueCharacter {

	/* 
Leetcode link: https://leetcode.com/problems/first-unique-character-in-a-string/


	Input 			----->  String
	Output 			----->  int

    Data Set:
		 Positive: 	---> Input: "vijoyvijayan"		Output =    3
		 Negative: 	---> Input: "abcddcba"	        Output =    -1
		 Edge: 	    ---> Input: "a"		            Output =    0
		 Edge: 	    ---> Input: "applealz"		    Output =    7


	Pseudo Code: Brute Force
	1. Get the input and initialise flag to false
	2. Compare characters in nested loop .. Break each loop if the character is found
	3. Set flag as true if the unique character is found
	4. Return indiex if flag is true else return -1


Best Solution : https://leetcode.com/problems/number-of-equivalent-domino-pairs/solutions/340022/java-c-python-easy-and-concise/

Learning: Could have solved using HashMap


	 */

    @Test
    public void allTests() {

//        Assert.assertEquals(3,getfirstUniqueCharacter("vijoyvijayan"));
        Assert.assertEquals(-1,getfirstUniqueCharacter("abcddcba"));
//        Assert.assertEquals(0,getfirstUniqueCharacter("x"));
//        Assert.assertEquals(7,getfirstUniqueCharacter("applealz"));

        /*
         Positive: 	---> Input: "vijoyvijayan"		Output =    3
		 Negative: 	---> Input: "abcddcba"	        Output =    -1
		 Edge: 	    ---> Input: "a"		            Output =    0
		 Edge: 	    ---> Input: "applealz"		    Output =    7
		 */


    }

    public int getfirstUniqueCharacter(String s) {
        boolean flag=false;
        int i;

        s.
        for (i = 0; i < s.length()-1; i++) {
            for (int j = i+1; j < s.length(); j++) {
                if(s.charAt(i)==s.charAt(j)) break;
                if(j==s.length()-1)flag=true;
            }
            if(flag)break;
        }
        return flag?i:-1;
    }
}


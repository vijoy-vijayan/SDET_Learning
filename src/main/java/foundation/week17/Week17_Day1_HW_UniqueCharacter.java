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


	Pseudo Code: Frequency Array
	1. Get the input string and initiate the alphabet array with int type to track all characters
    2. Iterate through each character of the string and update the value of alphabet array with frequency
    3. Iterate again within the same string checking for count 1 i.e unique character
    4. Return the index


Best Solution : https://leetcode.com/problems/first-unique-character-in-a-string/solutions/2431836/java-100-faster-code-easy-solution-with-explanation/

Learning: No need to loop the string multiple times and can be solved with single iteration itself.. Get stronger with the methods of String Library


	 */

    @Test
    public void allTests() {

        Assert.assertEquals(3,getfirstUniqueCharacter("vijoyvijayan"));
        Assert.assertEquals(-1,getfirstUniqueCharacter("abcddcba"));
        Assert.assertEquals(0,getfirstUniqueCharacter("x"));
        Assert.assertEquals(4,getfirstUniqueCharacter("applealz"));
        Assert.assertEquals(10,getfirstUniqueCharacter("mangomangoz"));

        /*
         Positive: 	---> Input: "vijoyvijayan"		Output =    3
		 Negative: 	---> Input: "abcddcba"	        Output =    -1
		 Edge: 	    ---> Input: "a"		            Output =    0
		 Edge: 	    ---> Input: "applealz"		    Output =    7
		 */


    }

    public int getfirstUniqueCharacter(String s) {

        int[] alphabetArray=new int[26];

        for (int i = 0; i < s.length(); i++) {
            alphabetArray[s.charAt(i)-'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if(alphabetArray[s.charAt(i)-'a']==1)
                return i;
        }

        return -1;
    }

    public int getfirstUniqueCharacter_bestCode(String s) {

        int ans = Integer.MAX_VALUE;
        // Iterate from a to z which is 26 which makes it constant
        for(char c='a'; c<='z';c++){
            // indexOf will return first index of alphabet and lastIndexOf will return last index
            // if both are equal then it has occured only once.
            // through this we will get all index's which are occured once
            // but our answer is lowest index
            int index = s.indexOf(c);
            if(index!=-1&&index==s.lastIndexOf(c)){
                ans = Math.min(ans,index);
            }
        }

        // If ans remain's Integer.MAX_VALUE then their is no unique character
        return ans==Integer.MAX_VALUE?-1:ans;
    }
}


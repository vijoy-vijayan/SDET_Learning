package foundation.week15;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;


public class Week14_Day3_HW_Panagram {

	/* 
Leetcode link: https://leetcode.com/problems/check-if-the-sentence-is-pangram/


	Input 			----->  String
	Output 			----->  boolean

    Data Set:
		 Positive: 	---> Input: "thequickbrownfoxjumpsoverthelazydog"		Output =    true
		 Negative: 	---> Input: "abcde"	                                    Output =    false
		 Edge: 	    ---> Input: "abcdefghijklmnopqrstuvwxyz"		        Output =    true



	Pseudo Code: ASCII Array
	1. Get the sentence and initialise the boolean array with size 26 to track all characters
	2. Iterate through the String and set the boolean value as true for the respective position
	3. Iterate through the boolean array and return false if there is any false found in any of the elements
	4. Return true the end


Best Solution :

Learning:


	 */

    @Test
    public void allTests() {

    Assert.assertEquals(true,isPangram("thequickbrownfoxjumpsoverthelazydog"));
    Assert.assertEquals(false,isPangram("abcde"));
    Assert.assertEquals(true,isPangram("abcdefghijklmnopqrstuvwxyz"));

        /*Positive: 	---> Input: "thequickbrownfoxjumpsoverthelazydog"		Output =    true
        Negative: 	---> Input: "abcde"	                                    Output =    false
        Edge: 	    ---> Input: "abcdefghijklmnopqrstuvwxyz"		        Output =    true*/


    }

    public boolean isPangram(String sentence) {

        boolean[] res=new boolean[26];

        for (int i = 0; i < sentence.length(); i++)
            res[sentence.charAt(i)-'a']=true;


        for (int i = 0; i < res.length; i++) { if(!res[i])return false; }
        return true;
    }

    public boolean isPangram_HashSet(String sentence) {

        HashSet<Character> setAlphabets=new HashSet<>();

        for (int i = 0; i < sentence.length(); i++)
            setAlphabets.add(sentence.charAt(i));

        return setAlphabets.size()==26;
    }



}


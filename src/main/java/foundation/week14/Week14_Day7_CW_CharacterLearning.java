package foundation.week14;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;


public class Week14_Day7_CW_CharacterLearning {

	/* 
Leetcode link:
Given a string, validate you have all the characters of a-z
    words only in lowercase and whitespace
    return - true or false


	Input 			----->  String
	Output 			----->  boolean

	Data Set:



	Pseudo code:




	 */

    @Test
    public void allTests() {

        checkLowerCase_FreArray("sett");
//        findIndexOfKey_HMLearning("Jane");


    }


    public boolean checkLowerCase_FreArray(String s) {

        int[] pCharTracker = new int[26];//No need to use int array as frequency is not asked for


        int right = 0;


        while (right < s.length()) {
            if (!(s.charAt(right) == 32))
                pCharTracker[s.charAt(right) - 'a']++;

        }

        for (int i = 0; i < pCharTracker.length; i++) {
            if (pCharTracker[i] == 0)
                return false;
        }
        return true;


    }

    public boolean checkLowerCase_HashSet(String s) {



        HashSet tempSet = new HashSet<Character>();

        for (int i = 0; i < s.length(); i++)
            tempSet.add(s.charAt(i));

        return tempSet.size() == 26;


    }
}


package foundation.week14;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;


public class Week14_Day7_CW_Anagram {

	/* 
Leetcode link: https://leetcode.com/problems/two-sum/description/

Problem Statement:
input: 2 3 5 6 7 8, Target = 11  --> Sum of two numbers should match with target
        1. return number 2. return indices

	Input 			----->  int[],int
	Output 			----->  int[]

	Data Set:
		 Positive: 	---> Input: "abc","defgbca"			    Output =  true
		 Positive: 	---> Input: "yzog" ,"aabbgbhjbjhzoy"    Output =  true
		 Negative: 	---> Input: "c","xyz"                   Output =  false
		 Negative: 	---> Input: "abcdef","xyz"              Output =  false
		 Edge: 	    ---> Input: "silent","listen"		    Output=   true
		 Edge: 	    ---> Input: "q","q"		                Output=   true


	Pseudo code:
    1. Get the strings ransomNote and magazines and initiate two ascii Arrays for both
    2. Loop through the characters of each string in the respective ascii array created and track count
    3. Iterate once again to check the length of both ascii  - Always magArr[elemnts]>=ranArr[Elements]
    4. return false if there is mismatch
    5. return true at the end

	 */

    @Test
    public void allTests() {

        /*Assert.assertEquals(true, checkRansomNote_FreqArray("abc", "defgbca"));

        Assert.assertEquals(true, checkRansomNote_FreqArray("yzog", "aabbgbhjbjhzoy"));
        Assert.assertEquals(false, checkRansomNote_FreqArray("c", "xyz"));
        Assert.assertEquals(false, checkRansomNote_FreqArray("abcdef", "xyz"));
        Assert.assertEquals(true, checkRansomNote_FreqArray("silent", "listen"));
        Assert.assertEquals(true, checkRansomNote_FreqArray("q", "q"));*/

        Assert.assertEquals(false, checkRansomNote_HashMap("aa", "ab"));


    }

    public boolean checkRansomNote_FreqArray(String ransomNote, String magazine) {//O(N)

        int[] magCharTracker = new int[26];
        int[] ranCharTracker = new int[26];

        int ptr = 0;
        while (ptr < magazine.length()) //O(N)
            magCharTracker[magazine.charAt(ptr++) - 'a']++;

        ptr = 0;

        while (ptr < ransomNote.length())//O(N)
            ranCharTracker[ransomNote.charAt(ptr++) - 'a']++;

        for (int i = 0; i < magCharTracker.length; i++)//O(26) --> O(N)
        {
            if (ranCharTracker[i] > magCharTracker[i]) return false;
        }

        return true;
    }

    public boolean checkRansomNote_HashMap(String ransomNote, String magazine) {//O(N)


        Map<Character, Integer> magazineMap = new HashMap<Character, Integer>();

        int ptr = 0;
        char currentChar;
        while (ptr < magazine.length()) //O(N)
        {
            currentChar = magazine.charAt(ptr++);

            if (magazineMap.containsKey(currentChar)) magazineMap.put(currentChar, magazineMap.get(currentChar) + 1);
            else magazineMap.put(currentChar, 1);

        }

        System.out.println(magazineMap);

        ptr = 0;
        while (ptr < ransomNote.length()) //O(N)
        {
            currentChar = ransomNote.charAt(ptr++);

            if (magazineMap.containsKey(currentChar)) {

                if (magazineMap.get(currentChar) == 0) {
                    magazineMap.remove(currentChar);
                    return false;
                }
                else
                    magazineMap.put(currentChar, magazineMap.get(currentChar) - 1);
            } else return false;

        }

        System.out.println(magazineMap);

        return true;

    }


    public boolean checkRansomNote_ConcurrentHashMap(String ransomNote, String magazine) {//O(N)


        Map<Character, Integer> magazineMap = new HashMap<Character, Integer>();

        int ptr = 0;
        char currentChar;
        while (ptr < magazine.length()) //O(N)
        {
            currentChar = magazine.charAt(ptr++);

            if (magazineMap.containsKey(currentChar)) magazineMap.put(currentChar, magazineMap.get(currentChar) + 1);
            else magazineMap.put(currentChar, 1);

        }

        System.out.println(magazineMap);

        ptr = 0;
        while (ptr < ransomNote.length()) //O(N)
        {
            currentChar = ransomNote.charAt(ptr++);

            if (magazineMap.containsKey(currentChar)) {

                if (magazineMap.get(currentChar) == 0) {
                    magazineMap.remove(currentChar);
                    return false;
                }
                else
                    magazineMap.put(currentChar, magazineMap.get(currentChar) - 1);
            } else return false;

        }

        System.out.println(magazineMap);

        return true;

    }

}


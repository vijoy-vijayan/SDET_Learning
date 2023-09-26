package foundation.week13;

import org.junit.Assert;
import org.junit.Test;


public class Week13_Day6_CW_PalindromeInSentence {

	/* 
Leetcode link:
Given an input String,return a boolean array by validate each of the word is a palindrome.
Input = "this is a Test"
output = [false, false, true, true]


	Input 			----->  String
	Output 			----->  boolean[]

	Data Set:
		 Positive: 	---> Input: "MADAM"		                Output =  true
		 Positive: 	---> Input: "AAAAAA"                    Output =  true
		 Negative: 	---> Input: "Madam"                     Output =  false
		 Edge: 	    ---> Input: ""				            Output=   false
		 Edge: 	    ---> Input: "V"				            Output =  true

	Pseudo Code:
	1. Get the input String and split the sentence to words and store it in an array
	2. REturn empty array if the given string is null
	2. Handle the special condition of null and length 1... Return false for null and true for length 1
	2. Iterate until left<= right in wile loop
	3. Compare the String.charAt(left) with String.charAt(right)
	4. Return false if not matching
	5. Return True at the end of the function

	 */

    @Test
    public void allTests() {

        //Positive
        Assert.assertArrayEquals(new boolean[]{true,true,true}, isWordsPalindrome("MADAM A MADAM"));
        Assert.assertArrayEquals(new boolean[]{false,true,true}, isWordsPalindrome("MADM A MADAM"));
        Assert.assertArrayEquals(new boolean[]{false,false}, isWordsPalindrome("Test Leaf"));
        Assert.assertArrayEquals(new boolean[]{false}, isWordsPalindrome("Tester"));
        Assert.assertArrayEquals(new boolean[]{}, isWordsPalindrome(""));


    }

    public boolean[] isWordsPalindrome(String s) {

        if (s.length() == 0)
            return new boolean[]{};

        String[] arrWords = s.split(" ");
        boolean[] res = new boolean[arrWords.length];

        for (int eachWord = 0; eachWord < arrWords.length; eachWord++) {
            res[eachWord] = isPalindrome(arrWords[eachWord]);
        }

        return res;
    }

    public boolean isPalindrome(String s) {

        int left = s.length() / 2 - 1, right;

        if (s.length() % 2 == 0)
            right = s.length() / 2;
        else
            right = s.length() / 2 + 1;

        if (s.length() == 0)
            return false;
        else if (s.length() == 0)
            return true;
        else {
            while (right < s.length()) {
                if (s.charAt(left) != s.charAt(right))
                    return false;

                left--;
                right++;
            }
        }

        return true;
    }


}


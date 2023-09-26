package foundation.week13;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;


public class Week13_Day3_HW_NoOfSubStrings {

	/* 
Leetcode link: https://leetcode.com/problems/number-of-substrings-containing-all-three-characters/description/


	Input 			----->  String
	Output 			----->  int


	Data Set:
		 Positive: 	---> Input: [1,5,9,12,15],3			                Output =  1
		 Positive: 	---> Input: [1,5,9,13,17,21],4                      Output =  4
		 Negative: 	---> Input: [1,5,9,13,17,21],40                     Output =  0
		 Edge: 	    ---> Input: [0,10,20],10				            Output=   1
		 Edge: 	    ---> Input: [0,10,21],10				            Output =  0

	Pseudo Code:
	1. Get the input array and the diff. Initialise ptr1=0, ctr=0
	2. Iterate through the loop with condition while(ptr<=arr.length-2)
	3. Initialise ptr2 with ptr1 value.. Find the difference 1 by comparing with all the elements inside another loop
	4. If any of the element satisfies the diff condition .. Set Flag to true
	5. CHeck again for the difference in an other loop... If any element satisfies.. Increase the ctr
	6. Return ctr at the end

	 */

    @Test
    public void allTests() {

        //Positive
//        Assert.assertEquals(1, ArithmeticTriplets(new int[]{1, 5, 9, 12, 15}, 3));


    }

    public int ArithmeticTriplets(String s) {

        int[] charCount = new int[3]; // To store the count of 'a', 'b', and 'c'
        int left = 0; // Left pointer of the sliding window
        int result = 0; // Number of valid substrings

        for (int right = 0; right < s.length(); right++) {
            char currChar = s.charAt(right);
            charCount[currChar - 'a']++; // Increment the count of the current character

            // If we have at least one occurrence of all characters a, b, and c in the current window
            while (charCount[0] > 0 && charCount[1] > 0 && charCount[2] > 0) {
                // Increment the result by the number of valid substrings ending at the current right pointer
                result += s.length() - right;

                // Move the left pointer to shrink the window
                char leftChar = s.charAt(left);
                charCount[leftChar - 'a']--;
                left++;
            }
        }

        return result;
    }

    public int countSubstrings(String s) {
        int n = s.length();
        int result = 0;
        Map<Character, Integer> charCount = new HashMap<>();

        int left = 0;
        int right = 0;

        while (right < n) {
            char currChar = s.charAt(right);
//            charCount.put(currChar, charCount.getOrDefault(currChar, 0) + 1); -- Java 8 only supports getOrDefault
            if (charCount.containsKey(currChar)) {
                charCount.put(currChar, charCount.get(currChar) + 1);
            } else {
                charCount.put(currChar, 1);
            }

            while (charCount.size() == 3) {
                result += n - right;
                char leftChar = s.charAt(left);
                charCount.put(leftChar, charCount.get(leftChar) - 1);
                if (charCount.get(leftChar) == 0) {
                    charCount.remove(leftChar);
                }
                left++;
            }

            right++;
        }

        return result;
    }


}



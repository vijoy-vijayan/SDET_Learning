package foundation.week13;

import org.junit.Assert;
import org.junit.Test;


public class Week13_Day6_CW_Palindrome {

	/* 
Leetcode link: https://leetcode.com/problems/find-the-array-concatenation-value/description/


	Input 			----->  String
	Output 			----->  boolean

	Data Set:
		 Positive: 	---> Input: "MADAM"		                Output =  true
		 Positive: 	---> Input: "AAAAAA"                    Output =  true
		 Negative: 	---> Input: "Madam"                     Output =  false
		 Edge: 	    ---> Input: ""				            Output=   false
		 Edge: 	    ---> Input: "V"				            Output =  true

	Pseudo Code:
	1. Get the input String and initialise left=0, right=String.length()-1
	2. Handle the special condition of null and length 1... Return false for null and true for length 1
	2. Iterate until left<= right in wile loop
	3. Compare the String.charAt(left) with String.charAt(right)
	4. Return false if not matching
	5. Return True at the end of the function

	 */

    @Test
    public void allTests() {

        //Positive
        Assert.assertEquals(true, isPalindrome("MADAM"));
        Assert.assertEquals(true, isPalindrome("AAAAAA"));
        //Negative
        Assert.assertEquals(false, isPalindrome("MADAm"));
        //Edge
        Assert.assertEquals(false, isPalindrome(""));
        Assert.assertEquals(true, isPalindrome("V"));

    }

    public boolean isPalindrome(String s) {

        int left = 0, right = s.length() - 1;

        if (s.length() == 0)
            return false;
        else if (s.length() == 0)
            return true;
        else {
            while (left <= right) {
                if (s.charAt(left) != s.charAt(right))
                    return false;

                left++;right--;
            }
        }

        return true;
    }

    public boolean isNumberPalindrome(int num) {

        int rem,temp,ctr=0;
        while(num>0)
        {
            rem=num%10;



            num=num/10;


        }

        return true;
    }

    int powerof10(int temp)
    {
        int res=1;

        if (temp==0) return 1;
        while(temp>0)
        {
            res*=10;
            temp--;
        }

        return res;
    }


}


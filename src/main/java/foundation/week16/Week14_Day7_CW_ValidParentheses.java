package foundation.week16;

import org.junit.Assert;
import org.junit.Test;

import java.util.Stack;


public class Week14_Day7_CW_ValidParentheses {

	/* 
Leetcode link: https://leetcode.com/problems/valid-parentheses/


	Input 			----->  String
	Output 			----->  boolean

    Data Set:
		 Positive: 	---> Input: "()"		Output =    true
		 Negative: 	---> Input: "()("	    Output =    false
		 Edge: 	    ---> Input: "{}"		Output =    true


	Pseudo Code: Brute Force
	1. Get the input and find the length
	2. return false if the input length is odd
	3. Find the middle part if its even
	4. Add elements in the stack using push in the iteration
	5. Iterate over the stack and compare the retrieved elements with the next one
	6. Return false if there is mismatch
    7. Return true at the end


Best Solution :

Learning:


	 */

    @Test
    public void allTests() {

        isValidParenthesis("()[]");
    }

    public boolean isValidParenthesis(String s) {

        if(s.length()%2!=0)
            return false;



        Stack<Character> valChar=new Stack<Character>();

        System.out.println("Test");

        for(int i=0;i<s.length();i++)
        {
            valChar.push(s.charAt(i));
        }


        return true;
    }


}


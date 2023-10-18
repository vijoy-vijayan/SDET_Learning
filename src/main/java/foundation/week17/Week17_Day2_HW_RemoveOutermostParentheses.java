package foundation.week17;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;


public class Week17_Day2_HW_RemoveOutermostParentheses {

	/* 
Leetcode link: https://leetcode.com/problems/remove-outermost-parentheses/


	Input 			----->  String
	Output 			----->  String

    Data Set:
		 Positive: 	---> Input: "(()())(())"		                Output =    "()()()"
		 Positive: 	---> Input: "(()())(())(()(()))"	            Output =    "()()()()(())"
		 Edge: 	    ---> Input: "()()"	                            Output =  ""




	Pseudo Code: Brute Force
	1. Get the input string and initiate the openBracketCount as 0 and String builder to store the result
	2. Iterate through all the characters of a String
	3. If the character is "(".. Increment the ctr
	4. CHeck for the condition whether the ctr >0 --> That means open bracket is still not closed
	        Add the characters to the result
	5. If the character is ")"... Decrement the ctr


Best Solution : https://leetcode.com/problems/remove-outermost-parentheses/solutions/270022/java-c-python-count-opened-parenthesis/

Learning: Need to track of Opened parentheses count and then have to solve using that Logic


	 */

    @Test
    public void allTests() {

        Assert.assertEquals( "()()()", removeOuterParentheses("(()())(())"));
        Assert.assertEquals( "()()()()(())", removeOuterParentheses("(()())(())(()(()))"));
        Assert.assertEquals( "", removeOuterParentheses("()()"));



        /*

         Data Set:
		 Positive: 	---> Input: "(()())(())"		                Output =    "()()()"
		 Positive: 	---> Input: "(()())(())(()(()))"	            Output =    "()()()()(())"
		 Edge: 	    ---> Input: "()()"	                            Output =  ""

         */

    }

    public String removeOuterParentheses(String s) {

        StringBuilder result=new StringBuilder();
        int ctr=0;

        char currentChar;

        for (int i = 0; i < s.length(); i++) {
            currentChar=s.charAt(i);
            if(currentChar=='(')
            {
                if(ctr>0)
                    result.append(s.charAt(i));
                ctr++;
            }
            else
            {
                ctr--;
                if(ctr>0)
                    result.append(s.charAt(i));
            }

        }

        return result.toString();

    }

    public String removeOuterParentheses_BestSolution(String S) {
        StringBuilder s = new StringBuilder();
        int opened = 0;
        for (char c : S.toCharArray()) {
            if (c == '(' && opened++ > 0) s.append(c);
            if (c == ')' && opened-- > 1) s.append(c);
        }
        return s.toString();
    }

}


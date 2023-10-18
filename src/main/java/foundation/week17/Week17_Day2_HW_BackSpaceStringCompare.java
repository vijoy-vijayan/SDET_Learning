package foundation.week17;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class Week17_Day2_HW_BackSpaceStringCompare {

	/* 
Leetcode link: https://leetcode.com/problems/backspace-string-compare/


	Input 			----->  String, String
	Output 			----->  boolean

    Data Set:
		 Positive: 	---> Input: "de#f","dff#"	                        Output = true
		 Positive: 	---> Input: "ab##", "c#d#"                          Output = true
		 Edge: 	    ---> Input: "a#c", "b"                              Output = false




	Pseudo Code: Brute Force
	1. Get the input String and initiate two StringBuilders to keep the result
	2. Iterate through Str1 and add all the characters in res1...
	    if the character is #, remove the recent characetr that waws added
	 3. Repeat the step2 for the str2
	 4. Return the comparison result of res1 and res2


Referred Solution : https://leetcode.com/problems/backspace-string-compare/solutions/432978/java-stack-and-stringbuilder-solution-huge-different/

Learning: Stack Methods and its applications


	 */

    @Test
    public void allTests() {

        Assert.assertEquals(true, removeBackspaceCharacters("de#f","dff#"));
        Assert.assertEquals(true, removeBackspaceCharacters("ab##", "c#d#" ));
        Assert.assertEquals(false, removeBackspaceCharacters("a#c", "b"  ));
        Assert.assertEquals(true, removeBackspaceCharacters( "c", "c"));



        /*

         Positive: 	---> Input: "de#f","dff#"	                        Output = true
		 Positive: 	---> Input: "ab##", "c#d#"                          Output = true
		 Negative: 	---> Input: "a#c", "b"                              Output = false
		 Edge:      ---> Input: "c", "c"                                Output = true

         */

    }

    public boolean removeBackspaceCharacters(String s, String t) {

       StringBuilder res1=new StringBuilder();
       StringBuilder res2=new StringBuilder();

       int tempSize;

        for (char eachChar:s.toCharArray()) {
            if(eachChar=='#') {

                tempSize=res1.length()-1;

                if(tempSize>=0)
                    res1.deleteCharAt(tempSize);
            }
            else
                res1.append(eachChar);
        }
        for (char eachChar:t.toCharArray()) {
            if(eachChar=='#') {

                tempSize=res2.length()-1;

                if(tempSize>=0)
                    res2.deleteCharAt(tempSize);
            }
            else
                res2.append(eachChar);
        }

        return res1.toString().equals(res2.toString());
    }


    public boolean backspaceCompare_BestCode(String S, String T) {
        return stackSolution(S).equals(stackSolution(T));
    }

    private String stackSolution(String str) {
        Stack<Character> stack = new Stack<Character>();

        for (char c : str.toCharArray()) {

            if (c != '#') {
                stack.push(c);

            } else if (!stack.isEmpty()) {
                stack.pop();
            }
        }
        return stack.toString();
    }

}


package foundation.week13;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;


public class Week13_Day2_MentorGiven_AssignCookies {

	/* 
Leetcode link: https://leetcode.com/problems/assign-cookies/

Problem statement: 	
Your laptop keyboard is faulty, and whenever you type a character 'i' on it, it reverses the string that you have written. Typing other characters works as expected.

You are given a 0-indexed string s, and you type each character of s using your faulty keyboard.

Return the final string that will be present on your laptop screen.


	Input 			----->  int[],int[]
	Output 			----->  int

	Data Set:
		 Positive: 	---> Input: [1,2,3], [1,3]			    Output =  2
		 Negative: 	---> Input: [3,4,5],[4]                 Output =  1
		 Negative: 	---> Input: [3,4,5],[1,2]               Output =  0
		 Edge: 	    ---> Input: [1],[1]				        Output=   1
		 Edge: 	    ---> Input: [4,5,6],[4,5,6]				Output =  3




//3 -- No Need to check

// Write down logic in note or notepad -- FInd the pattern

	Pseudo Code:
	1. Get the input of greed and cookies array
	2. Initialise the pointer for Greed=0, pointer for Cookies=0 and initialise the ctr=0
	3. Sort both the arrays
	4. Loop through the array with conditions ... ptrGreed<greed.length && ptrCookie<cookie.length
	5. Compare the Greed element with cookie element.. If Greedlement > cookie .. Then increment the cookie ptr.. else increment both pointers
	6. Return the ctr at the end

	 */

    @Test
    public void allTests() {

        //Positive
        Assert.assertEquals(2, assignCookies(new int[]{1,2,3},new int[] {1,2}));
        Assert.assertEquals(1, assignCookies(new int[]{3,4,5},new int[] {4}));
        //Negative
        Assert.assertEquals(0, assignCookies(new int[]{3,4,5},new int[] {1,2}));
        //Edge
        Assert.assertEquals(1, assignCookies(new int[]{1},new int[] {1}));

    }

    public int assignCookies(int[] g, int[] s) {

        int ctr = 0, ptrGreed = 0, ptrCookies = 0;

        Arrays.sort(g);
        Arrays.sort(s);

        while ((ptrGreed < g.length)&&(ptrCookies < s.length)) {
            if (g[ptrGreed] <= s[ptrCookies]) {
                ctr++;
                ptrGreed++;
                ptrCookies++;
            } else {
                ptrCookies++;
            }
        }
        return ctr;
    }
}


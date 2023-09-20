package foundation.week12;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;


public class Week12_Day2_HW_NoOfLines {

	/* 
Leetcode link: https://leetcode.com/problems/number-of-lines-to-write-string/description/

Problem statement: 	
You are given a string s of lowercase English letters and an array widths denoting how many pixels wide each lowercase English letter is. Specifically, widths[0] is the width of 'a', widths[1] is the width of 'b', and so on.

You are trying to write s across several lines, where each line is no longer than 100 pixels. Starting at the beginning of s, write as many letters on the first line such that the total width does not exceed 100 pixels. Then, from where you stopped in s, continue writing as many letters as you can on the second line. Continue this process until you have written all of s.

Return an array result of length 2 where:

result[0] is the total number of lines.
result[1] is the width of the last line in pixels.


	Input 			----->  int[]
	Output 			----->  int

	Data Set:
		 Positive: 	---> Input: [1,3,2,4,5]			    Output =  2
		 Negative: 	---> Input: [1,2,3,4,5]			    Output =  0
		 Edge: 	    ---> Input: [3,6,5,4,1]			    Output =  5
		 Edge: 	    ---> Input: [1]				        Output =  0



	Pseudo Code:
	1. Get the input array and initialise the rowCtr,sum=0
	2. Iterate through the input array
	3. CHeck for the condition.. If (Sum>=100) sum+=arr[i];
	     else rowCtr++
	 4. return rowCTr and sum as array



	Learning: Need to learn the methods of Arrays class

	 */

    @Test
    public void allTests() {

        //Positive
        Assert.assertEquals(new int[] {3,60}, numberOfLines(new int[]{4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10},"bbbcccdddaaa"));

        //Negative
       /* Assert.assertEquals(0, heightChecker(new int[]{1, 2, 3, 4, 5}));

        //Edge
        Assert.assertEquals(5, heightChecker(new int[]{3, 6, 5, 4, 1}));
        Assert.assertEquals(0, heightChecker(new int[]{1}));*/

    }

    public int[] numberOfLines(int[] widths, String s) {
        int rowCtr=1,sum=0;

        for(int i=0;i<widths.length;i++)//90,5,7
        {
            sum+=widths[i];
            if(sum>100)
            {
                rowCtr++;
                sum = 0;
                i--;
            }
        }

        return new int[] {rowCtr,sum};

    }
}


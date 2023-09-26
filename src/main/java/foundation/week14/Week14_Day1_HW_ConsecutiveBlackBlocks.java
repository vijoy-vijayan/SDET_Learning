package foundation.week14;

import org.junit.Test;


public class Week14_Day1_HW_ConsecutiveBlackBlocks {

	/* 
Leetcode link: https://leetcode.com/problems/minimum-recolors-to-get-k-consecutive-black-blocks/description/


	Input 			----->  String,int
	Output 			----->  int

	Data Set:
		 Positive: 	---> Input: "WWWBBW",5			        Output =  3
		 Positive: 	---> Input: "WWWBWBW",4                 Output =  2
		 Negative: 	---> Input: "BBBBW",5                   Output =  1
		 Edge: 	    ---> Input: "BBBB",1				    Output=   0
		 Edge: 	    ---> Input: "W",1				        Output =  1

	Pseudo Code:
	1. Get the String and the k. Initialise left=0, right=0, ctr=0,tempCtr=0
	2. Iterate through a loop with condition right less than k and track the no of W characters in ctr
	3. iterate w new lop for the remaining characters with the right less than String length
	4. Update the ctr value with incrementing the element of K and decrementing the element of left
    5. Return the String array



	 */

    @Test
    public void allTests() {

        //Positive
//        Assert.assertEquals("aidia", ReverseString("india"));



    }

    public int minimumRecolors(String blocks, int k) {

        int res=Integer.MAX_VALUE,ptr=0,ctr=0;

        while(ptr<k)
        {
            if(blocks.charAt(ptr++)=='W')
                ctr++;
        }
        while(ptr<blocks.length())
        {
            res=Math.min(res,ctr);

            if(blocks.charAt(ptr-k)=='W')
                ctr--;
            if(blocks.charAt(ptr++)=='W')
                ctr++;

        }
        return Math.min(res,ctr);


    }
}


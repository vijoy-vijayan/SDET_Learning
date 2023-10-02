package foundation.missingProblems;

import org.junit.Assert;
import org.junit.Test;


public class MP_KBeauty {

	/* 
Leetcode link: https://leetcode.com/problems/find-the-k-beauty-of-a-number/description/


	Input 			----->  int,int
	Output 			----->  int

	Data Set:
		 Positive: 	---> Input: 240,2			    Output =  2
		 Positive: 	---> Input: 430043,2	        Output =  2
		 Negative: 	---> Input: 1111,2	            Output =  0
		 Negative: 	---> Input: 1111,4	            Output =  1
		 Edge: 	    ---> Input: 1,1				    Output =  1

	Pseudo Code:
	1. Get the input num and initialise ctr=0
	2. Iterate through the loop with until the length-k
	3. Get the substring of the given index .. Substring(i,i+k)
	4. Covert the substring to int and check whether it's a divisor of num
	5. If true, increment the ctr
	6. return ctr at the end


	Learning:

	 */

    @Test
    public void allTests() {

        Assert.assertEquals(2,findKBeauty(240,2));
        Assert.assertEquals(2,findKBeauty(430043,2));
        Assert.assertEquals(0,findKBeauty(1075,2));
        Assert.assertEquals(1,findKBeauty(1111,4));
        Assert.assertEquals(1,findKBeauty(1,1));

        /*Positive: 	---> Input: 240,2			    Output =  2
        Positive: 	---> Input: 430043,2	        Output =  2
        Negative: 	---> Input: 1111,2	            Output =  0
        Negative: 	---> Input: 1111,4	            Output =  1
        Edge: 	    ---> Input: 1,1				    Output =  1*/


    }

    public int findKBeauty(int num, int k) {
        int ctr = 0,temp;

        String numString = String.valueOf(num);

        for (int i = 0; i <= numString.length() - k; i++) {
            temp = Integer.parseInt(numString.substring(i, i + k));
            if (temp == 0) continue;
            else if (num % temp == 0) ctr++;
        }

        return ctr;
    }
}


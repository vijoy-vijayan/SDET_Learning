package foundation.missingProblems;

import org.junit.Assert;
import org.junit.Test;


public class MP_LeetCodeBank_SlidingWindow {

	/* 
Leetcode link: https://leetcode.com/problems/calculate-money-in-leetcode-bank/description/


	Input 			----->  int
	Output 			----->  int

	Data Set:
		 Positive: 	---> Input: 10			                    Output = 37
		 Negative: 	---> Input: 20	                            Output =  96
		 Edge: 	    ---> Input: 4				                Output =  10
		 Edge: 	    ---> Input: 1			                    Output =  1



	Pseudo Code:
        Best Solution : Copied from https://leetcode.com/problems/calculate-money-in-leetcode-bank/solutions/1009171/faster-than-100-00-commented-java-cpp-c/


	Learning:

	 */

    @Test
    public void allTests() {

        Assert.assertEquals(163,calculateMoney_SlidingWindow(26));
       /* Assert.assertEquals(37,calculateMoney_SlidingWindow(10));
        Assert.assertEquals(96,calculateMoney_SlidingWindow(20));
        Assert.assertEquals(10,calculateMoney_SlidingWindow(4));
        Assert.assertEquals(1,calculateMoney_SlidingWindow(1));
*/
        /*Positive: 	---> Input: 10			                    Output = 37
        Negative: 	---> Input: 20	                            Output =  96
        Edge: 	    ---> Input: 4				                Output =  10
        Edge: 	    ---> Input: 1			                    Output =  1*/


    }

    public int calculateMoney_SlidingWindow(int n) {
        int m=n/7;  //(no.of full weeks)
        // first week  1 2 3 4 5 6 7 (sum is 28 i.e. 7*(i+3) if i=1)
        // second week  2 3 4 5 6 7 8 (sum is 35 i.e. 7*(i+3) if i=2)
        //.... so on
        int res=0; //for result
        //calculating full weeks
        for(int i=1;i<=m;i++){
            res+=7*(i+3);
        }
        //calculating left days
        for(int i=7*m;i<n;i++){
            res+=++m;
        }
        return res;
    }
}


package foundation.missingProblems;

import org.junit.Assert;
import org.junit.Test;


public class MP_AvgValueOfEvenNumbers_DivBy3 {

	/* 
Leetcode link: https://leetcode.com/problems/average-value-of-even-numbers-that-are-divisible-by-three/


	Input 			----->  int[]
	Output 			----->  int

	Data Set:
		 Positive: 	---> Input: [5,12,3,24,30,30]			    Output = 24
		 Negative: 	---> Input: [1,3,5,7,9]	                    Output =  0
		 Edge: 	    ---> Input: [12]				            Output =  12
		 Edge: 	    ---> Input: [996,996]			            Output =  996



	Pseudo Code:
	1. Get the input arr and initialise ctr=0, sum=0
	2. Iterate through the length of the array
	3. check if the number is divisible by 6(2*3) and increase ctr and sum accordingly
	4. return 0 if ctr=0 else sum/ctr


	Learning:

	 */

    @Test
    public void allTests() {

        Assert.assertEquals(24, avgEvenDivBy3(new int[]{5, 12, 3, 24, 30, 30}));
        Assert.assertEquals(0, avgEvenDivBy3(new int[]{1, 3, 5, 7, 9}));
        Assert.assertEquals(12, avgEvenDivBy3(new int[]{12}));
        Assert.assertEquals(996, avgEvenDivBy3(new int[]{996, 996}));
        /*Positive: 	---> Input: [5,12,3,24,30,30]			    Output = 24
        Negative: 	---> Input: [1,3,5,7,9]	                    Output =  0
        Edge: 	    ---> Input: [12]				            Output =  12
        Edge: 	    ---> Input: [996,996]			            Output =  996*/


    }

    public int avgEvenDivBy3(int[] nums) {
        int ctr = 0, sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 6 == 0) {
                ctr++;
                sum += nums[i];
            }
        }
        return ctr > 0 ? sum / ctr : 0;
    }
}


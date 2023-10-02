package foundation.missingProblems;

import org.junit.Assert;
import org.junit.Test;


public class MP_AlternatingDigitSum {

	/* 
Leetcode link: https://leetcode.com/problems/alternating-digit-sum/


	Input 			----->  int
	Output 			----->  int

	Data Set:
		 Positive: 	---> Input: 1256			    Output = -2
		 Negative: 	---> Input: 20710	            Output =  8
		 Edge: 	    ---> Input: 5				    Output =  5
		 Edge: 	    ---> Input: 1000000000			Output =  1



	Pseudo Code:
	1. Get the input number and initialise sum=0,rem=0,ctr=0,temp=num
	2. Iterate through the loop to find the number of digits by diving temp/10 each time . Condition temp>0
	3. if ctr== even, temp=1, else temp=-1
	4. Iterate through an other loop with condition num> 0
	5. Find the rem , rem=num%10, num=num/10,temp=temp*-1; sum = sum + (temp * rem)
	6. Return the sum


	Learning:

	 */

    @Test
    public void allTests() {

        Assert.assertEquals(-2,alternateDigitSum(1256));
        Assert.assertEquals(19,alternateDigitSum(92969));
        Assert.assertEquals(8,alternateDigitSum(20710));
        Assert.assertEquals(5,alternateDigitSum(5));
        Assert.assertEquals(1,alternateDigitSum(1000000000));

        /*Positive: 	---> Input: 1256			    Output = -2
        Negative: 	---> Input: 20710	            Output =  8
        Edge: 	    ---> Input: 5				    Output =  5
        Edge: 	    ---> Input: 1000000000			Output =  1*/

    }

    public int alternateDigitSum(int n) {

            int sum = 0, rem = 0, ctr = 0, temp = n;

            while (temp > 0) {
                temp /= 10;
                ctr++;
            }

            if (ctr % 2 == 0) temp = 1;
            else temp = -1;

            while (n > 0) {
                rem = n % 10;
                n = n / 10;
                temp *= -1;
                sum += (temp * rem);

            }

            return sum;
    }
}


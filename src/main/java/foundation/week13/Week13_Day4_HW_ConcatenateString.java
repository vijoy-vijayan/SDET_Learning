package foundation.week13;

import org.junit.Assert;
import org.junit.Test;


public class Week13_Day4_HW_ConcatenateString {

	/* 
Leetcode link: https://leetcode.com/problems/find-the-array-concatenation-value/description/


	Input 			----->  int[]
	Output 			----->  int

	Data Set:
		 Positive: 	---> Input: [1,5,9,12,15]		        Output =  636
		 Positive: 	---> Input: [1,5,9,1]                   Output =  70
		 Negative: 	---> Input: [9,15,10,1]                 Output =  1601
		 Edge: 	    ---> Input: [100]				        Output=   100
		 Edge: 	    ---> Input: [123,45]				    Output =  12345

	Pseudo Code:
	1. Get the input array and initialise left=0, right=arr.length-1, result=0
	2. Iterate through the loop with condition while(left<=right)
	3. Calculate the number of digits of arr[right].. then find the total with
	    formula ... res=arr[left]*10 to power of no of Digits+arr[right]
	4. Increase left and decrease right
	5. Handle special condition left==right.. Add the number direcctly to res
	6. Return the result

	 */

    @Test
    public void allTests() {

        //Positive
        /*Assert.assertEquals(636, ArrayConcatenationValue(new int[]{1,5,9,12,15}));
        Assert.assertEquals(70, ArrayConcatenationValue(new int[]{1,5,9,1}));
        Assert.assertEquals(1601, ArrayConcatenationValue(new int[]{9,15,10,1}));
        Assert.assertEquals(100, ArrayConcatenationValue(new int[]{100}));
        Assert.assertEquals(12345, ArrayConcatenationValue(new int[]{123,45}));*/

        printProgram();


    }

    public long ArrayConcatenationValue(int[] nums) {

        int left = 0, right = nums.length - 1, count = 0;

        long res=0;

        while (left <= right) {
            if (left == right) {
                res += nums[left];
                break;
            } else {
                count = 1;
                int temp = nums[right];

                while (temp != 0) {
                    temp /= 10;
                    count *= 10;
                }

                res+= nums[left] * count + nums[right];
            }

            left++;
            right--;
        }

        return res;
    }

    public void printProgram()
    {
        int x=Integer.MAX_VALUE;
        System.out.println(x+x);
    }
}


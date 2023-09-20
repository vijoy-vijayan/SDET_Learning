package foundation.week12;

import org.junit.Assert;
import org.junit.Test;


public class Week12_Day7_CW_HighestSum {

	/* 
Leetcode link: Class Work

Problem statement: 	
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
Note that you must do this in-place without making a copy of the array.


	Input 			----->  int[], int
	Output 			----->  int

	Data Set:
		 Positive: 	---> Input: [1, 0, 2, 0, 3]	,3		    Output =  5
		 Positive: 	---> Input: [1,5,2,3,7,1], 3		    Output =  12
		 Negative: 	---> Input: [1,2,3],0			        Output =  0
		 Edge: 	    ---> Input: [1,5,2,3,7,1,9,9],2		    Output =  [18]
		 Edge: 	    ---> Input: [0]		                    Output =  [0]



	Pseudo Code:
	1. Get the array and th the number k. Initiate the ptr1,ptr2,sum to 0 or Integer.MIN_Value if its negative
	2. Iterate through the while loop with breaking condition ptr1<arr.length-1-k
	3. Add the first three elements with incrementing ptr2 and store in sum... Check resultant sum> existing sum
	4. Increment ptr2 and continue through the main loop
	5. return sum




	 */

    @Test
    public void allTests() {


      /*  Assert.assertEquals(5, getHighestSum(new int[]{1, 0, 2, 0, 3},3));
        Assert.assertEquals(12, getHighestSum(new int[]{1,5,2,3,7,1},3));
        Assert.assertEquals(18, getHighestSum(new int[]{1,5,2,3,7,1,9,9},2));
        Assert.assertEquals(0, getHighestSum(new int[]{0,0},2));*/

        getHighestSum_SlidingWindow();


    }


    public int getHighestSum(int[] arr,int k) {///sum1==-4... sum2==-21... sum3=-10.. sum4==-5... sum5=-2...
                                                // max=-4

        int ptr1 = 0, ptr2 = 0,temp=0;

        int sum=Integer.MIN_VALUE;
//        int sum=0;

        while(ptr1<=arr.length-k)
        {

            temp=0;
            for (int i = 0; i < k; i++) {

                temp=temp+arr[i+ptr2];


            }
            ptr2++;

            if(temp>sum)
                sum=temp;


            ptr1++;
        }
        return sum;
    }

    public void getHighestSum_SlidingWindow() {///sum1==-4... sum2==-21... sum3=-10.. sum4==-5... sum5=-2...
        /*int max = Integer.MIN_VALUE, pointer = 0, currentSum = 0;
        // not needed second pointer as this is balanced traversal ,right = k-1;
        //2. Do the required operation till k index
        while(pointer < k)
            currentSum += nums[pointer++];
        //3. continue the operation for rest of the array
        while( pointer < nums.length){
            max = Math.max(currentSum, max);
            currentSum += nums[pointer] - nums[pointer-k];
            pointer++;
        }*/
        //return Math.max(currentSum, max);
        int res=Integer.MAX_VALUE+Integer.MAX_VALUE;


        System.out.println(res);
    }



}
package foundation.week13;

import org.junit.Assert;
import org.junit.Test;


public class Week13_Day2_HW_SubArrayWithThreshold {

	/* 
Leetcode link: https://leetcode.com/problems/number-of-sub-arrays-of-size-k-and-average-greater-than-or-equal-to-threshold/description/

Problem Statement:
Given an array of integers arr and two integers k and threshold, return the number of sub-arrays of size k and average greater than or equal to threshold.

	Input 			----->  int[],int,int
	Output 			----->  int

	Data Set:
		 Positive: 	---> Input: arr = [2,2,2,2,5,5,5,8], k = 3, threshold = 4			Output =  3
		 Positive: 	---> Input: arr = [0,1,5,6,7], k = 2, threshold = 5			        Output =  3

		 Negative: 	---> Input: arr = [0,1,5,6,7], k = 2, threshold = 25			    Output =  0

		 Edge: 	    ---> Input: arr = [0], k = 1, threshold = 0			        Output =  1


	Pseudo Code:
	1. Get the input arr, k, threshold and intialise ptr and ctr as 0
	2. Iterate through the loop with condition while( pointer <= nums.length-k)
	3. Calculate the average of three elements with formula .. if (arr[ptr]+arr[ptr+1]+arr[ptr+2]/k)>= threshold) .. Ctr++
    4. return the ctr

	 */

    @Test
    public void allTests() {

        //Positive
        Assert.assertEquals(3, getcount_subArrayWithThreshold(new int[]{2,2,2,2,5,5,5,8},3,4));
        Assert.assertEquals(2, getcount_subArrayWithThreshold(new int[]{0,1,5,6,7},2,5));
        Assert.assertEquals(0, getcount_subArrayWithThreshold(new int[]{0,1,5,6,7},2,25));
        Assert.assertEquals(1, getcount_subArrayWithThreshold(new int[]{0},1,0));


        /*
        Positive: 	---> Input: arr = [2,2,2,2,5,5,5,8], k = 3, threshold = 4			Output =  3

        Positive: 	---> Input: arr = [0,1,5,6,7], k = 2, threshold = 5			        Output =  3

        Negative: 	---> Input: arr = [0,1,5,6,7], k = 2, threshold = 25			    Output =  0

        Edge: 	    ---> Input: arr = [0], k = 1, threshold = 0			        Output =  1
        */



    }

    public int getcount_subArrayWithThreshold(int[] arr, int k, int threshold) {

       int ctr=0,ptr=0,temp=0;

       while(ptr<=arr.length-k)
       {
           temp=0;
           for(int i=0;i<k;i++)
               temp=temp+arr[ptr+i];

           if(temp/k>=threshold)
               ctr++;

           ptr++;
       }

        return ctr;
    }
}


package foundation.week13;

import org.junit.Assert;
import org.junit.Test;


public class Week13_Day3_HW_ArithmeticTriplets {

	/* 
Leetcode link: https://leetcode.com/problems/find-the-array-concatenation-value/description/


	Input 			----->  int[],int
	Output 			----->  int




	return 2



	Data Set:
		 Positive: 	---> Input: [1,5,9,12,15],3			                Output =  1
		 Positive: 	---> Input: [1,5,9,13,17,21],4                      Output =  4
		 Negative: 	---> Input: [1,5,9,13,17,21],40                     Output =  0
		 Edge: 	    ---> Input: [0,10,20],10				            Output=   1
		 Edge: 	    ---> Input: [0,10,21],10				            Output =  0

	Pseudo Code:
	1. Get the input array and the diff. Initialise ptr1=0, ctr=0
	2. Iterate through the loop with condition while(ptr<=arr.length-2)
	3. Initialise ptr2 with ptr1 value.. Find the difference 1 by comparing with all the elements inside another loop
	4. If any of the element satisfies the diff condition .. Set Flag to true
	5. CHeck again for the difference in an other loop... If any element satisfies.. Increase the ctr
	6. Return ctr at the end

	 */

    @Test
    public void allTests() {

        //Positive
        Assert.assertEquals(1, ArithmeticTriplets(new int[]{1,5,9,12,15},3));
        Assert.assertEquals(4, ArithmeticTriplets(new int[]{1,5,9,13,17,21},4));
        Assert.assertEquals(0, ArithmeticTriplets(new int[]{1,5,9,13,17,21},44));
        Assert.assertEquals(1, ArithmeticTriplets(new int[]{0,10,20},10));
        Assert.assertEquals(0, ArithmeticTriplets(new int[]{0,10,21},10));


        /*

         Positive: 	---> Input: [1,5,9,12,15],3			                Output =  1
		 Positive: 	---> Input: [1,5,9,13,17,21],4                      Output =  4
		 Negative: 	---> Input: [1,5,9,13,17,21],40                     Output =  0
		 Edge: 	    ---> Input: [0,10,20],10				            Output=   1
		 Edge: 	    ---> Input: [0,10,21],10				            Output =  0
         */



    }

    public int ArithmeticTriplets(int[] nums, int diff) {

       int ptr1=0,ptr2=0,ctr=0;
       boolean flag=false;

       	/*
       	[0,1,4,6,7,10], \ptr1-1, ptr2-4,6,7,10

       	[0,1,4,6,7,10], \ptr1-1,ptr2-4 .....ptr3...6,7,10

        0,1,4... 1,3 .....
        0,4,6....4,2....
        1,4,6...3,2
        1,4,7... 3,3 .... 1
        4,6,7... 2,1
        4,7,10...3,3 ....2
        6,7,10...1,3
        */

       while(ptr1<=nums.length-2)//ptr1=1 -- 1,4,6,7,10
       {
           ptr2=ptr1+1;//ptr2=

           flag=false;

           while(ptr2<nums.length)
           {
               if(nums[ptr2]-nums[ptr1]==diff)
               {
                   flag=true;
                   break;
               }
               ptr2++;
           }
           int ptr3=ptr2+1;
           if(flag) {
               while (ptr3 < nums.length) {
                   if (nums[ptr3] - nums[ptr2] == diff) {
                       ctr++;
                       break;
                   }
                   ptr3++;
               }
           }

           ptr1++;
       }

        return ctr;
    }
}


package algorithm_TwoPointers.week12;

public class HighestSum {

    /*

Given an array of Integers and a number k.
Return the highest sum of any k consecutive elements in the array.
Input Array: {1,5,2,3,7,1}
Target (k): 3
Output: 12
Explanation: sum of 2,3,7 is the max


Input: int[],int

Output: int


Data Set:
		 Positive: 	---> Input: [2,5,7,0,8],3			                Output =  15
		 Positive: 	---> Input: [20,21,1,5,9,13,17],4                   Output =  42
		 Negative: 	---> Input: [-1,-5,],40                     Output =  0
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

    public int findMaximumSUm(int[] input,int windowSize)//-1,-2,-3,-4,-5 .... 2 .... Result: -3
    {
        int i=0,j=0,sum=0,res;

        for (int k = 0; k < windowSize; k++)   //First Window  0,1
            sum+=input[k];

        res=sum;

        for (int k = windowSize; k < input.length; k++) {//2,3,4

            sum+=input[k]-input[k-windowSize];//2-68     ,3-68+  12- 23 =57

            if(sum>res)
                res=sum;
        }

        return res;
    }


}

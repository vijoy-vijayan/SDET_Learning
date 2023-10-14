package foundation.week16;

import org.junit.Assert;
import org.junit.Test;


public class Week15_Day4_MG_MergeArrays {

	/* 
Leetcode link: https://leetcode.com/problems/number-of-equivalent-domino-pairs/


	Input 			----->  int[],int,int[],int
	Output 			----->  Update int[]

    Data Set:
		 Positive: 	---> Input: [2,5,0,0],2,[1,8],2		Output =    [1,2,5,8]
		 Negative: 	---> Input: [2,3],2,[],0	        Output =    [2,3]
		 Edge: 	    ---> Input: [0],0,[6],1		        Output =    [6]


	Pseudo Code: Brute Force
	1. Get the inputs and initiate ptr1 and ptr2 to 0, res=0,resPtr=0
	2. Iterate through the loop with condition ptr1<m || ptr2<arr2.length
	3. Check the elements of arr1 with arr2
	        if(arr1[ptr1]> arr2[ptr2]) ... add the arr[ptr1] to res to resPtr Then update the ptr1
	        else add the arr[ptr2] to res to resPtr Then update the ptr2
	4. Update the resPtr
	5. No need to return anything at the end.. Just we have to update the arr1


Best Solution :


	 */

    @Test
    public void allTests() {


        Assert.assertArrayEquals(new int[]{1,2,5,8},getCount_DominoesPair_ComparingFromLast(new int[]{2,5,0,0},2,new int[]{1,8},2));

        /*
         Positive: 	---> Input: [2,5,0,0],2,[1,8],2		Output =    [1,2,5,8]
		 Negative: 	---> Input: [2,3],2,[],0	        Output =    [2,3]
		 Edge: 	    ---> Input: [0],0,[6],1		        Output =    [6]
		 */


    }

    public int[] getCount_DominoesPair(int[] nums1, int m, int[] nums2, int n) {


        int ptr1=0,ptr2=0;

        while(ptr1+ptr2<nums1.length)
        {
            if((nums1[ptr1]>nums2[ptr2])&&(ptr1<m)) {
                ptr1++;
            }
            else {
                nums1[ptr1+n]=nums1[ptr1];
                nums1[ptr1]=nums2[ptr2];
                ptr2++;
            }


        }


        return nums1;

    }

    public int[] getCount_DominoesPair_ComparingFromLast(int[] nums1, int m, int[] nums2, int n) {


        while(m<0&&n<0)
        {
            System.out.println("m:"+m+".....n:"+n);
            if(nums1[m-1]>nums2[n-1])
            {
                nums1[m+n-1]=nums1[m-1];
                m--;
            }
            else
            {
                nums1[m+n-1]=nums2[n-1];
                n--;
            }
        }


        return nums1;

    }


}


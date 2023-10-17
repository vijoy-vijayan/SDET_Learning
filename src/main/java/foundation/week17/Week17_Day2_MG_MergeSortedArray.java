package foundation.week17;

import org.junit.Assert;
import org.junit.Test;


public class Week17_Day2_MG_MergeSortedArray {

	/* 
Leetcode link: https://leetcode.com/problems/merge-sorted-array/description/


	Time Start: 6:45 AM
Time End: 7:05 AM

Input:int[],int,int[],int
Output: Update the nums1 array and dont need to return anything


Test Data:

Positive:[7,8,0,0,0,0],2,[2,5,7,10],4... Output: [2,5,7,7,8,10]
Negative:[7],1,[],0.. Output: [7]
Edge:[0,0],2,[25,75],2... Output: [25,75]



Pseudo code:
1. Get the inputs and intiiaite temp to hold the largest value
2. Iterate through the loop until n becomes 0
3. Compare the elements of nums1 with index m and nums2 with index of n
4. If nums1[m]>nums2[n].. Update the temp with m and decrement m
    else.. Update the temp with n and decrement n
5. Update the temp value to the nums1 with the index of m+n

*/


    public void merge(int[] nums1, int m, int[] nums2, int n) {

        while(n>0)
        {
            if((m>0)&&(nums1[m-1]>nums2[n-1]))
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
    }
}


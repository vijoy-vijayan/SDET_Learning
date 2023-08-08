package week3.day2;

import java.util.Arrays;

import org.junit.Test;
import org.junit.Assert;

public class HW6_ReplaceAllDigits {

	/*

Problem statement: 	 
Given an array of integers nums, calculate the pivot index of this array.

The pivot index is the index where the sum of all the numbers strictly to the left of the index 
is equal to the sum of all the numbers strictly to the index's right.

If the index is on the left edge of the array, then the left sum is 0 
because there are no elements to the left. This also applies to the right edge of the array.

Return the leftmost pivot index. If no such index exists, return -1.


	Input 			----->  	int[]
	Output 			----->  	int


	Data Set:
		 Positive: 		---> Input: [1,7,3,6,5,6]						Output = 3
		 Negative: 		---> Input: [1,2,3]								Output = -1
		 Edge: 			---> Input: [2,1,-1]							Output = 0


Pseudo Code:
 1. Get the input array and iterate in Nested loop -- Outer loop for Pivot .. LeftSum=0, RIghtSum=0
 2. In the inner loop, write the logic before pivot index and After Pivot Index  .. i> j .. ELse
 3. After the end of inner loop check for the condition of sum matching.. Return Index if matches
 4. Return -1 at the end

	 */

	public boolean isAnagram(String s, String t) {

        char[] originalArr=s.toCharArray();

        char[] searchArr=t.toCharArray();

        Arrays.sort(originalArr);
        Arrays.sort(searchArr);

        if(originalArr.length!=searchArr.length)
            return false;

        for(int i=0;i<searchArr.length;i++)
        {
            if(originalArr[i]!=searchArr[i])
                return false;
        }
        
        return true;
    }

}


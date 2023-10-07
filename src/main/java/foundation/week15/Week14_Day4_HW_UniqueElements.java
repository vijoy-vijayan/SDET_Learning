package foundation.week15;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;


public class Week14_Day4_HW_UniqueElements {

	/* 
Leetcode link: https://leetcode.com/problems/sum-of-unique-elements/description/


	Input 			----->
	Output 			----->

    Data Set:




	Pseudo Code:
	1.


Best Solution :

Learning:


	 */

    @Test
    public void allTests() {



    }


    public int getUniqueElementsSum(int[] nums) {
        int[] ascii_digits=new int[101];
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            ascii_digits[nums[i]]++;
        }
        for(int i=1;i<ascii_digits.length;i++)
        {
            if(ascii_digits[i]==1)
                sum+=i;
        }
        return sum;
    }
}


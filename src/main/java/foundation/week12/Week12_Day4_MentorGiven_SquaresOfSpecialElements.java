package foundation.week12;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.ArrayList;


public class Week12_Day4_MentorGiven_SquaresOfSpecialElements {

	/* 
Leetcode link: https://leetcode.com/problems/sum-of-squares-of-special-elements/submissions/

Problem statement: 	
You are given a 1-indexed integer array nums of length n.

An element nums[i] of nums is called special if i divides n, i.e. n % i == 0.

Return the sum of the squares of all special elements of nums.


	Input 			----->  int[]
	Output 			----->  int

	Data Set:
		 Positive: 	---> Input: [1,3,2,4,5],5			    Output =  1
		 Negative: 	---> Input: [1,2,3,4,5],6			    Output =  0
		 Edge: 	    ---> Input: [3,6,5,4,1],1			    Output =  5
		 Edge: 	    ---> Input: [1],1				        Output =  0



	Pseudo code:
    1. Get the input array and find its length.. Initailise res=0
    2. Loop through the iteration from the index 1 to length
    3. Check for the condition length%index==0
    4. If true, Get the element from arr[index-1] and square it and store in sum
    5. return sum


	 */

    @Test
    public void allTests() {

        //Positive
        Assert.assertEquals(63, sumOfSquares(new int[]{2,7,1,19,18,3}));

    }

    public int sumOfSquares(int[] nums) {

        int sum=0;

        int arrLength=nums.length;

        for(int i=1;i<=arrLength;i++)
        {
            if(arrLength%i==0)
            {
                sum+=nums[i-1]*nums[i-1];
            }
        }

        return sum;

    }

//https://www.hackerrank.com/challenges/camelcase/problem
    /*
    Pseudo code:
     1. Get the String and initialise the ctr=1
     2. Loop through the given string length
     3. Get each character and check for the ASCII value -- Uppercase
     4. If true, increase the ctr
     5. return ctr
     */
    public static int camelcase(String s) {

        int ctr=1;

        for(int i=0;i<s.length();i++)
        {
            if((s.charAt(i)>=65)&&(s.charAt(i)<=90))
                ctr++;
        }

        return ctr;

    }

//https://www.hackerrank.com/challenges/compare-the-triplets/problem

    /*
    Pseudo code:
     1. Get the input lists - a,b.. Initialise ctr1=0,ctr2=0
     2. Iterate through the size of a ... (Both size are same)
     3. CHeck for the logic.. if a.get(i)>b.get(i) -> ctr1++, if b.get(i)>a.get(i) -> ctr2++
     4. Add ctr1, ctr2 to the final list
     5. return final list
     */
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

        List<Integer> result=new ArrayList<Integer>();
        int temp1=0,temp2=0;

        for(int i=0;i<a.size();i++)
        {
            if(a.get(i)>b.get(i))
                temp1++;
            else if(b.get(i)>a.get(i))
                temp2++;

        }
        result.add(temp1);
        result.add(temp2);

        return result;

    }


}


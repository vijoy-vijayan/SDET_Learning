package myPractice.LearningWithLead;

import org.junit.Test;

public class MaximumSum {
 /*
    Find the maximum sum

    Input: int[],int
    Output: int



  */

   @Test
    public void test(){
        testCharacterArray();
    }

    public int findMaximumSUm(int[] input,int windowSize)//-1,-2,-3,-4,-5 .... 2 .... Result: -3
    {
        int i=0,j=0,sum=0,res=Integer.MIN_VALUE;

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

    public void testCharacterArray()
    {
        char x='s';
        System.out.println(x);
        x++;
        System.out.println(x);
    }

}

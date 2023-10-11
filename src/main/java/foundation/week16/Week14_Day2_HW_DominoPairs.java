package foundation.week16;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;


public class Week14_Day2_HW_DominoPairs {

	/* 
Leetcode link: https://leetcode.com/problems/number-of-equivalent-domino-pairs/


	Input 			----->  int[][]
	Output 			----->  int

    Data Set:
		 Positive: 	---> Input: [[5,7],[7,5],[7,5],[5,7]]		Output =    6
		 Negative: 	---> Input: [[2,3],[4,5],[5,6]]	            Output =    0
		 Edge: 	    ---> Input: [[2,3]]		                    Output =    0
		 Edge: 	    ---> Input: [[2,3],[4,5],[5,6],[2,3]]		Output =    1


	Pseudo Code: Brute Force
	1. Get the dominoes of type int[][] and initiate ctr=0
	2. Iterate through the dominoes length in a nested Loop .. Outer loop : i from 0 to length-1
	3. In the inner loop, iterate from j=i+1 to length
	4. Compare the elements of i and j with OR condition
	        CHeck i[0] == j[0] and i[1]==j[1] or i[0]==j[1] and i[1]==j[0]

	5. If true, increment the ctr
	6. Return the ctr at the end


Best Solution : https://leetcode.com/problems/number-of-equivalent-domino-pairs/solutions/340022/java-c-python-easy-and-concise/

Learning: Could have solved using HashMap


	 */

    @Test
    public void allTests() {

        Assert.assertEquals(6,getCount_DominoesPair(new int[][]{{5,7},{7,5},{7,5},{5,7}}));
        Assert.assertEquals(0,getCount_DominoesPair(new int[][]{{2,3},{4,5},{5,6}}));
        Assert.assertEquals(0,getCount_DominoesPair(new int[][]{{2,3}}));
        Assert.assertEquals(1,getCount_DominoesPair(new int[][]{{2,3},{4,5},{5,6},{2,3}}));


        /*
         Positive: 	---> Input: [[5,7],[7,5],[7,5],[5,7]]		Output =    6
		 Negative: 	---> Input: [[2,3],[4,5],[5,6]]	            Output =    0
		 Edge: 	    ---> Input: [[2,3]]		                    Output =    0
		 Edge: 	    ---> Input: [[2,3],[4,5],[5,6],[2,3]]		Output =    1
		 */


    }

    public int getCount_DominoesPair(int[][] dominoes) {
        int ctr=0;

        for (int i = 0; i < dominoes.length-1; i++) {
            for (int j = i+1; j <dominoes.length ; j++) {
                if(((dominoes[i][0]==dominoes[j][0])&&(dominoes[i][1]==dominoes[j][1]))||((dominoes[i][1]==dominoes[j][0])&&(dominoes[i][0]==dominoes[j][1])))
                    ctr++;
            }
        }
        return ctr;
    }


}


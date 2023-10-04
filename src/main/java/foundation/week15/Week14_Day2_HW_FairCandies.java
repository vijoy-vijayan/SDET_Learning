package foundation.week15;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;


public class Week14_Day2_HW_FairCandies {

	/* 
Leetcode link: https://leetcode.com/problems/fair-candy-swap/


	Input 			----->  int[],int[]
	Output 			----->  int[]

    Data Set:
		 Positive: 	---> Input: [3,2,3],[4,4,4]			        Output =    [2,4]
		 Negative: 	---> Input: [1,3,5,7],[9,7,5,3]	            Output =    [3,7]
		 Edge: 	    ---> Input: [10],[5,3,2,20]		            Output =    [10,20]
		 Edge: 	    ---> Input: [5,3,2,20], [10]			    Output =    [20,10]


	Pseudo Code: Brute Force
	1. Get the candies as int[] from bob and Alice
	2. Find the sum of both bob and alice and get the average
	3. Find the shortage or extra by comparing to the average of both friends
	4. Iterate through the Nested Loop - Check the current element of Bob + shortage/extra is available with ALice
	5. If yes, return both the elements of Bob and alice


Best Solution : https://leetcode.com/problems/fair-candy-swap/solutions/3442225/brute-force-binary-search-hashmap/

Learning: Could have improved the time complexity from m*n to m+n using Set


	 */

    @Test
    public void allTests() {

        Assert.assertArrayEquals(new int[]{2, 4}, getSwapResult_FairCandies(new int[]{3, 2, 3}, new int[]{4, 4, 4}));
        Assert.assertArrayEquals(new int[]{1, 5}, getSwapResult_FairCandies(new int[]{1, 3, 5, 7}, new int[]{9, 7, 5, 3}));
        Assert.assertArrayEquals(new int[]{10, 20}, getSwapResult_FairCandies(new int[]{10}, new int[]{5, 3, 2, 20}));
        Assert.assertArrayEquals(new int[]{20, 10}, getSwapResult_FairCandies(new int[]{5, 3, 2, 20}, new int[]{10}));
        /*Positive: 	---> Input: [3,2,3],[4,4,4]			        Output =    [2,4]
        Negative: 	---> Input: [1,3,5,7],[9,7,5,3]	            Output =    [3,7]
        Edge: 	    ---> Input: [10],[5,3,2,20]		            Output =    [10,20]
        Edge: 	    ---> Input: [5,3,2,20], [10]			    Output =    [20,10]*/


    }

    public int[] getSwapResult_FairCandies(int[] aliceSizes, int[] bobSizes) {
        int sumBob = 0, sumAlice = 0;
        for (int eachCandy : aliceSizes) sumAlice += eachCandy;
        for (int eachCandy : bobSizes) sumBob += eachCandy;

        int missingAlice = ((sumAlice + sumBob) / 2 - sumAlice);

        for (int i = 0; i < aliceSizes.length; i++) {
            for (int j = 0; j < bobSizes.length; j++)
                if (aliceSizes[i] + missingAlice == bobSizes[j]) return new int[]{aliceSizes[i], bobSizes[j]};
        }
        return new int[]{-1, -1};
    }

    public int[] getSwapResult_FairCandies_HashSet(int[] aliceSizes, int[] bobSizes) {
        int sumBob = 0, sumAlice = 0;

        for (int eachCandy : aliceSizes) sumAlice += eachCandy;
        for (int eachCandy : bobSizes) sumBob += eachCandy;

        int missingAlice = ((sumAlice + sumBob) / 2 - sumAlice);

        HashSet<Integer> aliceUniqueCandies = new HashSet<Integer>();

        for (int i = 0; i < aliceSizes.length; i++)
            aliceUniqueCandies.add(aliceSizes[i] + missingAlice);

        for (int j = 0; j < bobSizes.length; j++)
            if (aliceUniqueCandies.contains(bobSizes[j]))
                return new int[]{bobSizes[j] - missingAlice, bobSizes[j]};

        return new int[]{-1, -1};
    }
}


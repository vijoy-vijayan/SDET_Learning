package foundation.missingProblems;

import org.junit.Assert;
import org.junit.Test;


public class MP_StringPairs {

	/* 
Leetcode link: https://leetcode.com/problems/find-maximum-number-of-string-pairs/description/


	Input 			----->  String[]
	Output 			----->  int

	Data Set:
		 Positive: 	---> Input: ["cd","ac","dc","ca","zz"]			    Output = 2
		 Negative: 	---> Input: ["cd","cd","cd","cd"]	                Output =  0
		 Edge: 	    ---> Input: ["ab","ba]				                Output =  12




	Pseudo Code:
	1. Get the input arr and initialise ctr=0
	2. Iterate through the nested loop with length of the array the second loop starts with i+1
	3. Compare the i with each reverse of j and check for the pair
	4. Increase the ctr if the match is found
	4. return ctr at the end


	Learning:

	 */

    @Test
    public void allTests() {

        Assert.assertEquals(2,getStringPairCount(new String[]{"cd","ac","dc","ca","zz"}));
        Assert.assertEquals(0,getStringPairCount(new String[]{"cd","cd","cd","cd"}));
        Assert.assertEquals(1,getStringPairCount(new String[]{"ab","ba"}));

        /*Positive: 	---> Input: ["cd","ac","dc","ca","zz"]			    Output = 2
        Negative: 	---> Input: ["cd","cd","cd","cd"]	                Output =  0
        Edge: 	    ---> Input: ["ab","ba"]				                Output =  1*/




    }

    public int getStringPairCount(String[] words) {
        int ctr = 0;

        for (int i = 0; i < words.length-1; i++) {

            for (int j = i+1; j < words.length; j++) {
                if((words[i].charAt(0)==words[j].charAt(1))&&(words[i].charAt(1)==words[j].charAt(0)))
                    ctr++;
            }
        }

        return ctr ;
    }
}


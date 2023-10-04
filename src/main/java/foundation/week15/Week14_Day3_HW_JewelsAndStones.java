package foundation.week15;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;


public class Week14_Day3_HW_JewelsAndStones {

	/* 
Leetcode link: https://leetcode.com/problems/jewels-and-stones/


	Input 			----->  String, String
	Output 			----->  int

    Data Set:
		 Positive: 	---> Input: "uvw","uvwxyZUVW"			    Output =    3
		 Negative: 	---> Input: "pqrs","mango"	                Output =    0
		 Edge: 	    ---> Input: "x","x"		                    Output =    [10,20]



	Pseudo Code: Brute Force
	1. Get the Jewels and Stones and initiate HashMap <Char, Int> and sum as 0
	2. Iterate through the Keys and store its count in the values
	3. Iterate through the Jewel characters and update the sum according to the values
	4. Return the sum at the end


Best Solution :

Learning:


	 */

    @Test
    public void allTests() {

    Assert.assertEquals(3,calculateJewelCount("uvw","uvwxyZUVW"));
    Assert.assertEquals(0,calculateJewelCount("pqrs","mango"));
    Assert.assertEquals(1,calculateJewelCount("x","x"));

        /*Positive: 	---> Input: "uvw","uvwxyZUVW"			    Output =    3
        Negative: 	---> Input: "pqrs","mango"	                Output =    0
        Edge: 	    ---> Input: "x","x"		                    Output =    [10,20]*/


    }

    public int calculateJewelCount(String jewels, String stones) {
        int sum=0;
        HashMap<Character,Integer> mapStones=new HashMap<>();

        for (int i = 0; i < stones.length(); i++) {
            if (mapStones.containsKey(stones.charAt(i))) mapStones.put(stones.charAt(i), mapStones.get(stones.charAt(i)) + 1);
            else mapStones.put(stones.charAt(i), 1);
        }

        System.out.println(mapStones);

        for (int i = 0; i < jewels.length(); i++)
        {
            if(mapStones.get(jewels.charAt(i))!=null)
                sum+=mapStones.get(jewels.charAt(i));
        }


        return sum;
    }


}


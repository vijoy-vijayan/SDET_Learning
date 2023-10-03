package foundation.week15;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Week14_Day2_MG_MajorityElement {

	/* 
Leetcode link: https://leetcode.com/problems/majority-element/


	Input 			----->  int[]
	Output 			----->  int

	Data Set:
		 Positive: 	---> Input: [3,2,3]			        Output = 3
		 Negative: 	---> Input: [2,2,1,1,1,2,2]	        Output =  2
		 Edge: 	    ---> Input: [1,2,3,4,5,9,9,9,6]		Output =  9
		 Edge: 	    ---> Input: [1]			            Output =  1



	Pseudo Code: Brute Force
	1. Get the input array and sort it
	2. Return nums[0] if length==1
	3. Return nums[length/2] otherwise

	Pseudo Code: Hash Map
	1. Get the input array
	2. Return nums[0] if length==1
	3. Add the elements and the count in the HashMap
	4. Calculate the average of the length
	5. Iterate through the map and check for the value>=avg
	6. return the key



Best Solution :


	 */

    @Test
    public void allTests() {



    }

    public int majorityElement_AverageLogic(int[] nums) {

        if(nums.length==1)
            return nums[0];

        Arrays.sort(nums);
        int avg=nums.length/2;
        return nums[avg];
    }

    public int majorityElement_HashMap(int[] nums) {

        if(nums.length==1)
            return nums[0];

        HashMap<Integer,Integer> mapElemCount=new HashMap<Integer,Integer>();
        
        int currentElement;

        for (int i = 0; i < nums.length; i++) {

            currentElement = nums[i];

            if (mapElemCount.containsKey(currentElement)) mapElemCount.put(currentElement, mapElemCount.get(currentChar) + 1);
            else mapElemCount.put(currentElement, 1);
            
        }

        int avg=nums.length/2;

       for(Map.Entry<Integer,Integer> es:mapElemCount.entrySet())
       {
           if(es.getValue()>=avg)
               return es.getKey();
       }


        return -1;
    }


    public int majorityElement_FreqArray()
    {

    }
}


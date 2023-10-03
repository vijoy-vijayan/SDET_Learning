package foundation.week15;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;


public class Week14_Day2_HW_DestinationCity {

	/* 
Leetcode link: https://leetcode.com/problems/destination-city/


	Input 			----->  List<List<String>>
	Output 			----->  String

	Test Data:
        Positive:[["Tirupur","Coimbatore"],["Coimbatore","Kannur"],["Kannur","Thalassery"]]     Output: Thalassery
        Negative:[["Tirupur","Coimbatore"],["Coimbatore","Chennai"]]                            Output: Chennai
        Edge: [["Tirupur","Coimbatore"]]                                                        Output: Coimbatore



	Pseudo Code: Brute Force
	1. Get the nested list and add initiate the HashMap<String,String>
	2. Iterate through the Nested Loop and add all the details to the Map
	3. Iterate through the map values
	4. Search if the value is key of any other entries
	5. If true moves to the next entry, else return the value


Best Solution :
https://leetcode.com/problems/destination-city/solutions/609868/java-tricky-4-lines-using-one-set/
https://leetcode.com/problems/destination-city/solutions/856289/java-100-0-faster-set-solution/

Learning: Should have implemented Set rather than the Map


	 */

    @Test
    public void allTests() {

        /*List<String> strings = Arrays.asList("Item1", "Item2", "Item3", "Item4", "Item5");

        Not knowing how to pass Nested List data for assertion - Need to check with Mentor
        Assert.assertEquals("Thalassery",getDestinationCity());*/

        /*Positive:[["Tirupur","Coimbatore"],["Coimbatore","Kannur"],["Kannur","Thalassery"]]     Output: Thalassery
        Negative:[["Tirupur","Coimbatore"],["Coimbatore","Chennai"]]                            Output: Chennai
        Edge: [["Tirupur","Coimbatore"]]                                                        Output: Coimbatore*/



    }

    public String getDestinationCity(List<List<String>> paths) {

        HashMap<String,String> mapSrcDest=new HashMap<String, String>();

        for(List<String> eachPath:paths)
            mapSrcDest.put(eachPath.get(0),eachPath.get(1));

        for(Map.Entry<String,String> es:mapSrcDest.entrySet())
            if(mapSrcDest.get(es.getValue())==null)return es.getValue();

        return null;
    }






}


package foundation.week10;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Week10_Day3_HW_CountItemsMatchingRule {

	/* 
Leetcode link: https://leetcode.com/problems/count-items-matching-a-rule/

Problem statement: 	
You are given an array items, where each items[i] = [typei, colori, namei] describes the type,
color, and name of the ith item. You are also given a rule represented by two strings, ruleKey and ruleValue.

The ith item is said to match the rule if one of the following is true:

ruleKey == "type" and ruleValue == typei.
ruleKey == "color" and ruleValue == colori.
ruleKey == "name" and ruleValue == namei.
Return the number of items that match the given rule.

	Input 			----->  List<List<String>>, String, String
	Output 			----->  int

	Data Set:
		 Positive: 	---> Input: [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]],
		 					"color","silver"   Output =  1
		 Negative: 	---> Input: [["a","b","c"],["d","e","f"],["g","h","i"],["a","a","c"]],"name","c"	Output =  2
		 Edge:  	---> Input: [["a","b","c"]],"name","1"	Output =  1

	Pseudo Code:
	1. Get the List of items and iterate through the Nested loop
	2. In the Outer loop, Iterate through the list of items
	3. In the inner loop search for the match of particular rule key and the rule value
	4. Increase the ctr if match is found and continue for all elements
	5. Return ctr at the end

Better Solution: https://leetcode.com/problems/count-items-matching-a-rule/solutions/1093390/java-easy-and-short-100-memory/

	 */
	@Test
	public void negativeTest()
	{
		List<List<String>> nestedList = new ArrayList<>();

        nestedList.add(Arrays.asList("a", "b", "c"));
        nestedList.add(Arrays.asList("d", "e", "f"));
        nestedList.add(Arrays.asList("g", "h", "i"));
        nestedList.add(Arrays.asList("a", "a", "c"));
       Assert.assertEquals(2,getCount_MatchingRule(nestedList, "name","c"));


	}
	@Test
	public void edgeTest()
	{
		List<List<String>> nestedList = new ArrayList<>();

        nestedList.add(Arrays.asList("a", "b", "c"));
        Assert.assertEquals(0,getCount_MatchingRule(nestedList, "name","a"));
		Assert.assertEquals(1,getCount_MatchingRule(nestedList, "type","a"));
	}
	@Test
	public void positiveTest()
	{
		List<List<String>> nestedList = new ArrayList<>();

        nestedList.add(Arrays.asList("phone", "blue", "pixel"));
        nestedList.add(Arrays.asList("computer", "silver", "lenovo"));
        nestedList.add(Arrays.asList("phone", "gold", "iphone"));

		Assert.assertEquals(1,getCount_MatchingRule(nestedList,"color","silver"));
	}


	public int getCount_MatchingRule(List<List<String>> items, String ruleKey, String ruleValue) {//K1:L2

		int ctr=0;

		int itemKeyIndex = 0;

		if(ruleKey.equals("type"))
			itemKeyIndex=0;
		else if (ruleKey.equals("color"))
			itemKeyIndex=1;
		else if(ruleKey.equals("name"))
			itemKeyIndex=2;

		for(List<String> eachList:items)
		{
				if(ruleValue.equals(eachList.get(itemKeyIndex)))
					ctr++;
		}

		return ctr;
	}

}


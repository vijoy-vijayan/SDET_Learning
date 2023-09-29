package foundation.week14;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Week14_Day5_HW_ReverseStringII {

	/* 
Leetcode link: https://leetcode.com/problems/find-all-anagrams-in-a-string/description/


	Input 			----->  String, int
	Output 			----->  String

	Data Set:
		 Positive: 	---> Input: "orange",2			        Output =  "roaneg"
		 Negative: 	---> Input: "pondy", 3                  Output =   "nopyd"
		 Edge: 	    ---> Input: "silent",6		            Output=   "tnelis"
		 Edge: 	    ---> Input: "a",1		                Output=   "a"

    Algorithm: Sliding Window - Static

	Pseudo code:
    1. Get the input string and k and initialise the boolean flag as true, StringBuilder result
    2. Iterate through a for loop with ptr as 0 iterating through ptr < length and incrementing ptr with k
    3. Get the substring of by passing ptr as start and ptr+k as end
    4. If flag is true reverse the substring and append it to result
    5. Reverse the flag and reset the substring to empty
    6. Check for the terminating condition
    7. Return the result

Best Solution: https://leetcode.com/problems/reverse-string-ii/solutions/2609325/java-1ms-100-faster-99-less-memory-usage/ -- Skipped some iterations
	 */

    @Test
    public void allTests() {

        Assert.assertEquals("roaneg",reverseString2("orange", 2));
        Assert.assertEquals("nopdy",reverseString2("pondy", 3 ));
        Assert.assertEquals("tnelis",reverseString2("silent",6	));
        Assert.assertEquals("a",reverseString2("a",1));
        Assert.assertEquals("roaneg",reverseString2("orange", 2));

    }

    public String reverseString2(String s, int k) {
        int ptr=0;
        boolean flag = true;
        StringBuilder result = new StringBuilder(),temp = new StringBuilder();

        for (; ptr < s.length() - k; ptr = ptr + k) {
            temp.append(s.substring(ptr, ptr + k));
            if (flag) // Flag to reverse the every 2nd Substring
                temp.reverse();

            result.append(temp);
            flag = !flag;
            temp.setLength(0); // Making temp to Empty

        }
        temp.append(s.substring(ptr, s.length()));

        if (flag)
            temp.reverse();

        return result.append(temp).toString();
    }
}
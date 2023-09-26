package foundation.week13;

import org.junit.Assert;
import org.junit.Test;


public class Week13_Day7_CW_ShortestDistance {

	/* 
Leetcode link:https://leetcode.com/problems/shortest-distance-to-a-character/description/


	Input 			----->  String,char
	Output 			----->  int[]

	Data Set:
		 Positive: 	---> Input: "testleaf",'e'	                Output =  [1,0,1,2,1,0,1,2]
		 Negative: 	---> Input: "vijoy",'j'                     Output =  [2,1,0,1,2]
		 Edge: 	    ---> Input: "a",'a'			                Output=   [0]
		 Edge: 	    ---> Input: "xxx",x				            Output =  [0,0,0]

	Pseudo Code:
	1. Get the input String and initialise left=0, right=0, resArr with length of String, tempCount=0
	2. Find the first occurrence of the given character and make right as the index of occurrence
	3. Iterate through the loop with condition as left less than the String length
	4. Update resArr with right-left value
	5. Handle special condition when left==right
	        CHeck for the next occurrence of right.. If so.. FInd the mid of current right and next right.. Set flag
	6. If flag is Set and left<mid... Update resArr with left-right value
	7. ELse left> mid.. Update resArr with newRight-left
	6. return the array

	 */

    @Test
    public void allTests() {

        //Positive

//        Assert.assertArrayEquals(new int[]{2,1,0,1,2}, getShortestDistance("vijoy",'j'));
        Assert.assertArrayEquals(new int[]{1,0,1,2,1,0,1,2}, getShortestDistance("testleaf",'e'));

    }

    public int[] getShortestDistance(String s, char c) {//1,2,3,4,5  10

        int left = 0, right = 0, updatedRight = 0, tempMid = 0;
        boolean flag = false;

        int[] resArr = new int[s.length()];

        while ((s.charAt(right) != c) && (right < s.length())) {
            right++;
        }

        if(right==s.length())
            return resArr;

        while (left < s.length()) {

            if (left < right) {
                resArr[left] = right - left;
                left++;

            } else if (left == right) {
                resArr[left] = 0;
                left++;

                updatedRight = right+1;
                while ((updatedRight < s.length())&&(s.charAt(updatedRight) != c) ) {
                    updatedRight++;
                }
                if (updatedRight != s.length()) {
                    flag = true;
                    tempMid = (right + updatedRight) / 2;
                }


            } else {
                if (flag) {
                    if (left < tempMid) {
                        resArr[left] = left - right;
                    } else if(left == tempMid) {
                        resArr[left] = left - right;
                        right=updatedRight;
                    }
                    else {
                        resArr[left] = updatedRight - left;
                    }
                    left++;
                } else {
                    resArr[left] = left - right;
                    left++;

                }

            }

        }
        return resArr;
    }


}


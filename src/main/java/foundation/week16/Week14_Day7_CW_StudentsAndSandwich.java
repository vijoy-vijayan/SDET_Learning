package foundation.week16;

import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Stack;


public class Week14_Day7_CW_StudentsAndSandwich {

	/* 
Leetcode link: https://leetcode.com/problems/number-of-students-unable-to-eat-lunch/description/


	Input 			----->  String
	Output 			----->  boolean

    Data Set:
		 Positive: 	---> Input: "()"		Output =    true
		 Negative: 	---> Input: "()("	    Output =    false
		 Edge: 	    ---> Input: "{}"		Output =    true


	Pseudo Code: Brute Force
	1. Get the input and find the length
	2. return false if the input length is odd
	3. Find the middle part if its even
	4. Add elements in the stack using push in the iteration
	5. Iterate over the stack and compare the retrieved elements with the next one
	6. Return false if there is mismatch
    7. Return true at the end


Best Solution :

Learning:


	 */

    @Test
    public void allTests() {


    }

    public int countStudents(int[] students, int[] sandwiches) {

        int count=1;

        ArrayDeque<Integer> sandwichQueue=new ArrayDeque<>();
        ArrayDeque<Integer> studentQueue=new ArrayDeque<>();

        for (int i = 0; i < students.length; i++) {
            studentQueue.add(students[i]);
        }
        for (int i = 0; i < sandwiches.length; i++) {
            sandwichQueue.add(students[i]);
        }
        int temp=0;
        int shiftedCount=studentQueue.size();
         while(temp<shiftedCount)
         {

         }

        return count;

    }


}


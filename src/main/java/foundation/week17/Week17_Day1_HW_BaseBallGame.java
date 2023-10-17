package foundation.week17;

import org.junit.Assert;
import org.junit.Test;

import java.util.Stack;


public class Week17_Day1_HW_BaseBallGame {

	/* 
Leetcode link: https://leetcode.com/problems/baseball-game/


	Input 			----->  String[]
	Output 			----->  int

    Data Set:
		 Positive: 	---> Input: ["5","2","C","D","+"]		                Output =    30
		 Positive: 	---> Input: ["5","-2","4","C","D","9","+","+"]	        Output =    27
		 Positive: 	---> Input: ["-2","-2","+","+"]	                        Output =    -14
		 Edge: 	    ---> Input: ["1","C"]		                            Output =    0



	Pseudo Code: Data Structure: Stack
	1. Get the string array and initiate the stack of integer and res as 0;
    2. Iterate through each element of String
    3. Handle the condition in the switch case
        if C -- stack.pop
        if D -- stack.push(peek*2)
        if + -- stack.push(stack.get(length)+stack.get(length-1));
    4. Iterate through the stack length and update the sum
    5. Return the sum



Best Solution :

Learning:


	 */

    @Test
    public void allTests() {

        Assert.assertEquals(30,getTotalPoints_BaseBall(new String[]{"5","2","C","D","+"}));
        Assert.assertEquals(27,getTotalPoints_BaseBall(new String[]{"5","-2","4","C","D","9","+","+"}));
        Assert.assertEquals(-14,getTotalPoints_BaseBall(new String[]{"-2","-2","+","+"}));
        Assert.assertEquals(0,getTotalPoints_BaseBall(new String[]{"1","C"}));

        /*

         Data Set:
		 Positive: 	---> Input: ["5","2","C","D","+"]		                Output =    30
		 Positive: 	---> Input: ["5","-2","4","C","D","9","+","+"]	        Output =    27
		 Positive: 	---> Input: ["-2","-2","+","+"]	                        Output =    -14
		 Edge: 	    ---> Input: ["1","C"]		                            Output =    0

         */

    }

    public int getTotalPoints_BaseBall(String[] operations) {

        int sum=0;

        Stack<Integer> stackOps =new Stack<>();

        for (int i = 0; i < operations.length; i++) {

            if(operations[i].equals("C"))
                stackOps.pop();
            else if(operations[i].equals("D"))
                stackOps.push(stackOps.peek()*2);
            else if(operations[i].equals("+"))
                stackOps.push(stackOps.get(stackOps.size()-1)+stackOps.get(stackOps.size()-2));
            else
                stackOps.push(Integer.valueOf(operations[i]));
        }

        int stackSize=stackOps.size();
        for (int i = 0; i < stackSize; i++) {
            sum+=stackOps.pop();
        }

        return sum;

    }
}


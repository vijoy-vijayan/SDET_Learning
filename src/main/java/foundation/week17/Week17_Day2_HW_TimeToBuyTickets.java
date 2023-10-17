package foundation.week17;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class Week17_Day2_HW_TimeToBuyTickets {

	/* 
Leetcode link: https://leetcode.com/problems/time-needed-to-buy-tickets/


	Input 			----->  int[],int
	Output 			----->  int

    Data Set:
		 Positive: 	---> Input: [3,1,2,2,3,3],2		                Output =    8
		 Positive: 	---> Input: [10,1,2],0	                        Output =    13
		 Edge: 	    ---> Input: [100],0	                            Output =  100




	Pseudo Code: Brute Force
	1. Get the int array and initiate sum as 0
	2. Iterate through the int array and check for the below conditions
	3. if i>k
	        if arr[i]<arr[k] --> sum+=arr[i]
	        else sum+=arr[k]-1
	4. if i<=k
	        if arr[i]<arr[k] --> sum+=arr[i]
	        else  sum+=arr[k]
	5. Return sum


Referred Solution : https://leetcode.com/problems/time-needed-to-buy-tickets/solutions/1576926/java-o-n-one-pass-explained/

Learning: Could use Math class functions min and max if applicable


	 */

    @Test
    public void allTests() {

        Assert.assertEquals(8, findTotalTime_BuyTickets(new int[]{3, 1, 2, 2, 3, 3}, 2));
        Assert.assertEquals(13, findTotalTime_BuyTickets(new int[]{10, 1, 2}, 0));
        Assert.assertEquals(123, findTotalTime_BuyTickets(new int[]{123}, 0));


        /*

         Positive: 	---> Input: [3,1,2,2,3,3],2		                Output =    8
		 Positive: 	---> Input: [10,1,2],0	                        Output =    13
		 Edge: 	    ---> Input: [100],0	                            Output =  100

         */

    }

    public int findTotalTime_BuyTickets(int[] tickets, int k) {

        int sum = 0;

        for (int i = 0; i < tickets.length; i++) {
            if (tickets[i] < tickets[k]) {
                sum += tickets[i];
            } else {
                sum += tickets[k];
                if (i > k) sum--;
            }
        }

        return sum;
    }

    public int findTotalTime_BuyTickets_initialCode(int[] tickets, int k) {

        int sum = 0;

        for (int i = 0; i < tickets.length; i++) {
            if (i > k) {
                if (tickets[i] < tickets[k])
                    sum += tickets[i];
                else
                    sum += tickets[k] - 1;
            } else {
                if (tickets[i] < tickets[k])
                    sum += tickets[i];
                else
                    sum += tickets[k];
            }


        }

        return sum;

    }

    public int timeToBuyTicket(int[] tickets, int k) {
        int n = tickets.length;
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            queue.add(tickets[i]);
        }

        int time = 0;

        while (true) {
            int frontPersonTickets = queue.poll();

            if (frontPersonTickets > 1) {
                queue.add(frontPersonTickets - 1);
            }

            time++;

            if (frontPersonTickets == 1 && k == 0) {
                break;
            } else if (k == 0) {
                k = queue.size() - 1;
            } else {
                k--;
            }
        }

        return time;
    }
}


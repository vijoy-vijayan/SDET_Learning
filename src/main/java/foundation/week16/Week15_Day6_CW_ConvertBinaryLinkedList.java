package foundation.week16;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;


public class Week15_Day6_CW_ConvertBinaryLinkedList {

	/* 
Leetcode link: https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/description/


	Input 			----->  int[],int,int[],int
	Output 			----->  Update int[]

    Data Set:
		 Positive: 	---> Input: 		    Output =
		 Negative: 	---> Input: 	        Output =
		 Edge: 	    ---> Input: 		    Output =


	Pseudo Code: Brute Force
	1.


Best Solution :


	 */

    @Test
    public void allTests() {


        // Solved in Leetcode directly


    }

    public int convertBinaryToDecimal(ListNode head) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        while (head != null) {
            list.add(head.val);
            head = head.next;

        }

        System.out.println(list.size());

        int sum = 0, ctr = 0;

        for (int i = list.size() - 1; i >= 0; i--) {
            sum += list.get(i) * powerOf2(ctr++);
        }

        return sum;

    }

    public int powerOf2(int n) {
        int res = 1;
        if (n == 0)
            return res;
        else {
            for (int i = 0; i < n; i++)
                res *= 2;
        }
        return res;
    }

    public int convertBinaryToDecimal_BestCode(ListNode head) {

        ArrayList<Integer> list=new ArrayList<Integer>();
        while(head!=null)
        {
            list.add(head.val);
            head=head.next;
        }

        int sum=list.get(list.size()-1),temp=2;
        for(int i=list.size()-2;i>=0;i--)
        {
            sum+=list.get(i)*temp;
            temp*=2;
        }
        return sum;
    }


    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }


}


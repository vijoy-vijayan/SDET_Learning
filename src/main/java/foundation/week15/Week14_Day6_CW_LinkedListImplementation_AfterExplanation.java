package foundation.week15;

import org.junit.Test;

import java.util.LinkedList;


public class Week14_Day6_CW_LinkedListImplementation_AfterExplanation {

    Node head;

    Node tail;

    @Test
    public void addMultipleNodes()
    {

        LinkedList<Integer> temp=new LinkedList<>();

        int[] nodes=new int[]{11,43,56,11,35};

        for (int i = 0; i < nodes.length; i++) {

            if (head == null)
                head = tail = new Node(nodes[i]);
            else {
                tail.next = new Node(nodes[i]);
                tail = tail.next;
            }

        }
    }

    public Node addNode(int data)
    {
        return new Node(data);
    }

    class Node
    {

        int data;
        Node next;

        public Node(int data_key)
        {
            this.data=data_key;
            this.next=null;
        }

    }


}


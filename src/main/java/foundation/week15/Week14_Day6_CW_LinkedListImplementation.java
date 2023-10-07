package foundation.week15;

import org.junit.Test;


public class Week14_Day6_CW_LinkedListImplementation {

    Node Head;

    Node Tail;

    @Test
    public void addMultipleNodes()
    {
        this.Head=addNode(11);
        this.Tail=this.Head;

        this.Tail=addNode(43);
        this.Tail=addNode(23);
        this.Tail=addNode(11);
        this.Tail=addNode(90);
    }

    public Node addNode(int data)
    {
        return new Node(data);
    }

    class Node
    {

        int data;
        int next;

        public Node(int data_key)
        {
            this.data=data_key;
            this.next=data_key;
        }



    }


}


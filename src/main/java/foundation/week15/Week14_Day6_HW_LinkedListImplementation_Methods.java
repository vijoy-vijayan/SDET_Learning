package foundation.week15;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;


public class Week14_Day6_HW_LinkedListImplementation_Methods {

    Node head;
    Node tail;

    private int size = 0;

    @Test
    public void myLinkedList()
    {

        ArrayList<Integer> temp=new ArrayList<>();
        temp.remove(5);
        addAll(new int[]{11,43,56,11,35});

        System.out.println(get(2));

        remove(2);

        System.out.println("Size of the updated Linked List after removal: "+size);

        System.out.println(get(2));
    }
    public void addAll(int[] nodes)
    {

        for (int i = 0; i < nodes.length; i++) {

            if (head == null)
                head = tail = new Node(nodes[i]);
            else {
                tail.next = new Node(nodes[i]);
                tail = tail.next;
            }

            size++;

        }

        System.out.println("Size of the current Linked List: "+size);


    }

    public void add(int data) {
        if(head==null) {
            head = tail = new Node(data);
        }else {
            tail.next = new Node(data);
            tail = tail.next;
        }
        size++;
    }

    public Node addNode(int data)
    {
        return new Node(data);
    }

    public int get(int index) {
        if(index>size)
            throw new IndexOutOfBoundsException();
        Node temp = head;
        for(int i=0; i<index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }
    public int size() {
        return size;
    }

    public void remove(int index) {
        if(index>size)
            throw new IndexOutOfBoundsException();
        Node temp = head;
//        Node previousNode;
        for(int i=0; i<index-1; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;
//        previousNode = temp;
//        temp = temp.next;
//        previousNode.next = temp;
        size--;

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


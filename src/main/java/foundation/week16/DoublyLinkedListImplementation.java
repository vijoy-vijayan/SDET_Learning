package foundation.week16;

import foundation.week15.ListNode;
import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class DoublyLinkedListImplementation {

    //Implementing own Double link methods

    Node head, tail;
    private int size = 0;

    public void addFirst(int data) {
        Node newNode=new Node(data);
        if(head==null) {
            head = tail = newNode;
        }else {
            head.prev=newNode;
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public void addLast(int data) {
        Node newNode=new Node(data);
        if(head==null) {
            head = tail = newNode;
        }else {
            tail.next=newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public boolean removeFirst() {

        if(head==null) {
            return false;
        }else {
            Node nextNode=head.next;
            nextNode.prev=null;
            head=nextNode;

        }
        size--;
        return true;
    }

    public boolean removeLast() {

        if(head==null) {
            return false;
        }else {
            Node prevNode=tail.prev;
            prevNode.next=null;
            tail=prevNode;
        }
        size--;
        return true;
    }
    public String print(Node node){
        StringBuffer buff = new StringBuffer("[");
        //7,5,3,null
        while(node != null){
            buff.append(node.val).append(",");//7,5,3,
            node = node.next;
        }
        buff.deleteCharAt(buff.length()-1);

        return buff.append(']').toString();
    }

    public String printTail(Node node){
        StringBuffer buff = new StringBuffer("[");
        //7,5,3,null
        while(node != null){
            buff.append(node.val).append(",");//7,5,3,
            node = node.prev;
        }
        buff.deleteCharAt(buff.length()-1);

        return buff.append(']').toString();
    }

    @Test
    public void testDLL()
    {
        addFirst(15);
        addFirst(10);
        addFirst(5);
        System.out.println("After AddFirst Method: "+print(head));
        addLast(30);
        addLast(60);
        addLast(90);
        System.out.println("After AddLast Method: "+print(head));
        removeFirst();
        removeFirst();
        System.out.println("After removeFirst Method: "+print(head));
        removeLast();
        System.out.println("After removeLast Method: "+print(head));

        System.out.println("Tail: "+printTail(tail));
        System.out.println("Size: "+size);

        new LinkedList<Integer>();

        new Stack<Character>();


    }
}

package foundation.week15;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {

        ArrayList<Integer> temp=new ArrayList<>();
        temp.add(5);
        if(head == null) return  null;
        if(head.next == null) return head;


        //3,5,7
        ListNode currentHead = null;

        while(head != null){
            currentHead = new ListNode(head.val, currentHead);
            //3,null
            //5,3,null
            //7,5,3,null
            head = head.next;
        }
        return currentHead;
    }

    public ListNode reverseList1(ListNode head) {
        if(head == null) return  null;
        if(head.next == null) return head;

        ListNode currentHead = null, previousNode = null;
        //3,5,7
        while(head != null){
            currentHead = new ListNode(head.val);
            //3,null
            //5,null
            currentHead.next = previousNode;
            //currentHead.next=null,pN=3,null... null=null
            previousNode= currentHead;
            //pN=3,null
            head = head.next;
            //5
        }

        return currentHead;
    }

    /*@Test
    public void test(){
//        ListNode head = reverseList(new SinglyLinkedList().add(new int[]{1,2,3,4}));
        ListNode head = reverseList(new SinglyLinkedList().add(new int[]{3,5,7}));
        //head = 7,5,3,null
        String a = new SinglyLinkedList().print(head);
        System.out.println(a);
        Assert.assertEquals("[7,5,3]", a);
    }*/
    @Test
    public void test1(){
        ListNode head = reverseList1(new SinglyLinkedList().add(new int[]{3,5,7}));
        String a = new SinglyLinkedList().print(head);
        System.out.println(a);
        Assert.assertEquals("[7,5,3]", a);
    }
}

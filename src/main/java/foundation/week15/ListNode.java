package foundation.week15;

public class ListNode {

    ListNode next;
    int val;

    // 3,5,7


    //3, Next- Null

    //3,5 Next- Null

    //3,5,7 Next- Null

    ListNode(int value) {
        this.val = value;
        next = null;
    }

    //14 ,null
    //20, node4

    //3,5,7

    //val - 3, Node - Null

    //Node 3--> 3,null

    //Node5 -->5, Node3 --> 5,3,null

    //7, Node5 --> 7,5,3,null


    ListNode(int value, ListNode next) {
        this.val = value;
        this.next = next;
    }
}

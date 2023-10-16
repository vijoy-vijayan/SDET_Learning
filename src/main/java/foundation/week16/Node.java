package foundation.week16;

public class Node {

    Node prev,next;
    int val;

    Node(int value) {
        this.val = value;
        this.prev = null;//No need to initialise to null -- Automatically initialises to null
        this.next = null;//No need to initialise to null
    }

    //Yet to check the below method for Doubly Linked List
    Node(int value, Node next) {
        this.val = value;
        this.next = next;
    }
}

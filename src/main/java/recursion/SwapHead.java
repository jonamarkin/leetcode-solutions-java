package recursion;


import java.awt.*;
import java.util.LinkedList;

public class SwapHead {
    public ListNode swapHeads( ListNode head){
        if(head ==null || head.next==null) return head;

        ListNode firstNode = head;
        ListNode secondNode = head.next;

        firstNode.next = swapHeads(secondNode.next);
        secondNode.next = firstNode;

        return secondNode;
    }

}

class ListNode{
    int data;
    ListNode next;

    public ListNode(int data, ListNode next) {
        this.data = data;
        this.next = next;
    }
}

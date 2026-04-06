package leetcode.week2;

import dataStructures.week2_arrays.*;

public class RemoveNthNode{
    public Node removeNthNode(Node head, int n){
        if(head==null) throw new RuntimeException("LL is empty");

        Node dummyNode = head;
        Node slow = dummyNode;
        Node fast = dummyNode;

        int count = 0;

        while(count < n){
            count += 1;
            fast = fast.next;
        }

        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;

        return dummyNode.next;
    }
}
package leetcode.week2;

import dataStructures.week2_arrays.*;

public class LinkedListCycle{
    public boolean linkedListCycle(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }

        return false;
    }
}
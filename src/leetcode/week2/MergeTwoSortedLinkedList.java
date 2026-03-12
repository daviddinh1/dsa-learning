package leetcode.week2;

import dataStructures.week2_arrays.*;

public class MergeTwoSortedLinkedList{
    public Node mergeTwoSortedLinkedList(Node head1, Node head2){
        if(head1 == null){
            return head2;
        }
        if(head2 == null) return head1;

        Node dummyNode = new Node(0);
        Node current = dummyNode;
        
        while(head1 != null && head2 != null){
            if(head1.value < head2.value){
                current.next = head1;
                head1 = head1.next;
            }else if(head2.value < head1.value){
                current.next = head2;
                head2 = head2.next;
            }else{
                current.next = head1;
                head1 = head1.next;
                head2 = head2.next;
            }
            current = current.next;
        }

        if(head1 == null){
            current.next = head2;
        }

        if(head2 == null){
            current.next = head1;
        }

        return dummyNode.next;
    }
}

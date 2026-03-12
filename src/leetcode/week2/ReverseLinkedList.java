package leetcode.week2;


import dataStructures.week2_arrays.*;

public class ReverseLinkedList{
    public Node reverseLinkedList(Node head){
        if(head == null){
            throw new RuntimeException("Head is missing");
        }
        
        Node prev = null;
        Node currNode = head;
        Node next = null;

        while(currNode != null){
            next = currNode.next;
            currNode.next = prev;
            prev = currNode;
            currNode = next;
        }
        
        head = prev;
        return prev;
    }
}
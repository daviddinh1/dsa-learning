package dataStructures.week3_stacks;

import dataStructures.week2_arrays.Node;

public class StackLinkedlist{
    Node head;

    public StackLinkedlist(){
        this.head = null;
    }

    public boolean isEmpty(){
        if(head == null){
            return true;
        }else{
            return false;
        }
    }
    public void push(int element){
        Node newElement = new Node(element);
        newElement.next = head;
        head = newElement;
    }

    public int pop(){
        if(isEmpty()){
            throw new RuntimeException("the stack is empty");
        }
        int poppedValue = head.value;
        head = head.next;
        return poppedValue;
    }

    public int peek(){
        if(isEmpty()){
            throw new RuntimeException("the stack is empty");
        }
        return head.value;
    }
}
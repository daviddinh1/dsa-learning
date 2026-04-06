package dataStructures.week4_queues;

import dataStructures.week2_arrays.Node;

public class QueueLinkedList{
    //use head node to keep track of first node
    //use tail pointer to keep track of last node
    Node head;
    Node tail;

    public QueueLinkedList(){
        this.head = null;
        this.tail = null;
    }

    //isEmpty
    public boolean isEmpty(){
        if(head == null){
            return true;
        }else{
            return false;
        }
    }

    //enqueue
    public void enqueue(int element){
        if(isEmpty()){
            Node newElement = new Node(element);
            newElement.next = head;
            head = newElement;
            tail = newElement;
            return;
        }
        Node newElement = new Node(element);
        tail.next = newElement;
        tail = newElement;
    }

    //dequeue
    public int dequeue(){
        if(isEmpty()){
            throw new RuntimeException("QueueLinkedList is empty");
        }
        //why is the print not printing the correct
        int poppedVal = head.value;
        head = head.next;

        return poppedVal;

    }

    //print node vals
    public void printVals(){
        Node currNode = head;
        while(currNode != null){
            System.out.println(currNode.value);
            currNode = currNode.next;
        }
    }

}
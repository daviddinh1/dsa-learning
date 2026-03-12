package dataStructures.week2_arrays;

public class SinglyLinkedList{
    Node head;
    public SinglyLinkedList(){
        this.head = null;
    }

    public void insert(int value){
        if(head == null){
            Node newNode = new Node(value);
            head = newNode;
            return;
        }

        Node newNode = new Node(value);
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }

    public int search(int value){
        if(head == null){
            //throw exception
            throw new RuntimeException("List is empty");
        }
        Node current = head;
        while(current != null && current.value != value){
            current = current.next;
        }
        if(current == null){
            throw new RuntimeException("value was not found");
        }
        return current.value;
    }

    public void delete(int value){
        if(head.value == value){
            head = head.next;
            return;
        }

        Node prev = null;
        Node currNode = head;

        while(currNode != null && currNode.value != value){
            prev = currNode;
            currNode = currNode.next;
        }

        if(currNode == null){
            throw new RuntimeException("Value not found");
        }

        prev.next = currNode.next;
    }
    
    public void reverse(){
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
    }

    public void printList(){
        if(head == null){
            throw new RuntimeException("No head value");
        }
        Node currNode = head;
        while(currNode != null){
            System.out.println(currNode.value);
            currNode = currNode.next;
        }
    }
}
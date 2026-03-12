package dataStructures.week2_arrays;

public class Main{
    public static void main(String[] args){
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);
        linkedList.insert(4);

        System.out.println(linkedList.search(3));

        linkedList.reverse();
        linkedList.printList();
    }        
}
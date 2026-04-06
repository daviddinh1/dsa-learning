package dataStructures.week4_queues;

public class Main{
    public static void main(String[] args) {
        QueueLinkedList queLL = new QueueLinkedList();

        for(int i = 1 ; i<=10; i++){
            queLL.enqueue(i);
        }
        
        System.out.println(queLL.dequeue());
        System.out.println(queLL.head.value);
        // queLL.printVals();
    }
}
package dataStructures.week4_queues;

//lets implement a queue it should be first in first out
public class Queue{
    Object data[];
    int head = 0;
    int tail = 0;
    int size = 0;

    public Queue(){
        int size = 10;
        data = new Object[size];
    }

    //create a method enqueue where you add a element at the end of the queue
    public void enqueue(Object element){
        if(isFull()){
            throw new RuntimeException("The queue is full");
        }
        data[tail] = element;
        tail = (tail + 1) % data.length;
        size++;

    }

    //dequeue returns value and removes recently last element
    public Object dequeue(){
        if(isEmpty()){
            throw new RuntimeException("The queue is empty");
        }
        Object element = data[head];
        head = (head + 1) % data.length;        
        size--;
        return element;
    }

    //empty maybe this means you check if the queue is empty
    public boolean isEmpty(){
        if(size == 0){
            return true;
        } else{
            return false;
        }
    }

    //full you check if the queue is full 
    public boolean isFull(){
        if(size == data.length){
            return true;
        }else{
            return false;
        }
    }

    public void printValues(){
        for(int i = 0; i< size; i++){
            System.out.println((head + 1) % data.length);
        }
    }
}
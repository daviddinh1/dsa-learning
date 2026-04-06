package dataStructures.week3_stacks;

public class Stacks{
    Object data[];
    int top = -1;

    public Stacks(){
        int size = 10;
        data = new Object[size];

    }

    public boolean isEmpty(){
        if(top == -1){
            return true;
        }else{
            return false;
        }
    }

    //create a push method
    public void push(Object element){
        if(top == data.length-1){
            throw new RuntimeException("stack is full");
        }
        top++;
        data[top] = element;
    }

    //create a pop method
    public Object pop(){
        if(isEmpty()){
            throw new RuntimeException("Stack is empty");
        }
        Object poppedElement = data[top];
        top--;
        return poppedElement;
    }

    //create a peek method
    public Object peek(){
        if(isEmpty()){
            throw new RuntimeException("Stack is empty");
        }
        return data[top];
    }

}



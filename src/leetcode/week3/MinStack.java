package leetcode.week3;

import java.util.ArrayDeque;
import java.util.Deque;

public class MinStack{

    Deque<Integer> minStack = new ArrayDeque<>();
    Deque<Integer> stack = new ArrayDeque<>();


    public void push(int value){
        if(minStack.isEmpty() || minStack.peek() >= value){
            minStack.push(value);
        }

        stack.push(value);
    }

    public int pop(){
        if(stack.isEmpty()){
            throw new RuntimeException("stack is empty");
        }

        int poppedVal = stack.pop();
        if(poppedVal == minStack.peek()){
            minStack.pop();
        }

        return poppedVal;
    }

    public int top(){
        if(stack.isEmpty()){
            throw new RuntimeException("stack is empty");
        }
        return stack.peek();
    }

    public int getMin(){
        if(stack.isEmpty()){
            throw new RuntimeException("stack is empty");
        }
        return minStack.peek();
    }
}
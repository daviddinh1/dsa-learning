package leetcode.week3;

import java.util.Deque;
import java.util.ArrayDeque;

public class QueuesUsingStacks{
    
    Deque<Integer> stack1 = new ArrayDeque<>();
    Deque<Integer> stack2 = new ArrayDeque<>();


    public void push(int val){
        stack1.push(val);
    }

    public int pop(){
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }

    public boolean isEmpty(){
        if(stack1.isEmpty() && stack2.isEmpty()){
            return true;
        }
        return false;
    }

    public int peek(){
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        return stack2.peek();
    }
}
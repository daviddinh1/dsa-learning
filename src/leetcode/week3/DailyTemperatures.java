package leetcode.week3;

import java.util.Deque;
import java.util.ArrayDeque;

public class DailyTemperatures{
    public int[] dailyTemperatures(int[] temperatures){
        if(temperatures.length == 0){
            throw new RuntimeException("the length of the arr is 0");
        }

        //declare monotonic stack
        Deque<Integer> monotonicStack = new ArrayDeque<>();

        //declare answer arr
        int[] answer = new int[temperatures.length];

        for(int i = 0; i < temperatures.length; i++){
            while(!monotonicStack.isEmpty() && (temperatures[monotonicStack.peek()] < temperatures[i])){
                int index = monotonicStack.pop();
                answer[index] = i - index; 
            }

            monotonicStack.push(i);
        }

        return answer;

    }
}
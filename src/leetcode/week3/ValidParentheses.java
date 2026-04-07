package leetcode.week3;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParentheses{
    public boolean validParentheses(Character[] arr){
        if(arr.length == 0){
            return true;
        }
        
        //modern approach to using a deque faster because it is not synchronized
        Deque<Character> stack = new ArrayDeque<>();

        for(Character bracket: arr){
            if(bracket == ')'){
                if(!stack.isEmpty() && stack.peek() == '('){
                    stack.pop();
                }else{
                    return false;
                }
            }else if(bracket == ']'){
                if(!stack.isEmpty() && stack.peek() == '['){
                    stack.pop();
                }else{
                    return false;
                }
            }else if(bracket == '}'){
                if(!stack.isEmpty() && stack.peek() == '{'){
                    stack.pop();
                }else{
                    return false;
                }
            }else{
                stack.push(bracket);
            }
        }

        if(stack.size() == 0){
            return true;
        }else{
            return false;
        }

    }
}


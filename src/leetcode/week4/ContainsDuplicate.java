package leetcode.week4;

import java.util.HashMap;

public class ContainsDuplicate{
    public boolean containsDuplicate(int[] arr){
        if(arr.length <= 1){
            return false;
        }

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num: arr){
            if(map.containsKey(num)){
                return true;
            }else{
                map.put(num,1);
            }
        }

        return false;


    }
}
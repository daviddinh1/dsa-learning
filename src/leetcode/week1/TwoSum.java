package leetcode.week1;

import java.util.HashMap;


public class TwoSum{
    public int[] twoSum(int[] nums, int target){
        if(nums != null&& nums.length < 1){
            System.out.println("The nums arr is null or has less than 2 values");
        }

        //declare a hashmap to contain the conjegate
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int conjegate;

        int[] result = new int[2];

        for(int i = 0; i < nums.length ; i++){
            conjegate = target - nums[i];

            if(hashMap.containsKey(conjegate)){
                result[0] = hashMap.get(conjegate);
                result[1] = i;
                return result;
            }
            hashMap.put(nums[i],i);
        }

        return result;
    }
}
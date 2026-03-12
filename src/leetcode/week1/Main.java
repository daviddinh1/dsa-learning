package leetcode.week1;

import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        System.out.println("Hello Leetcode week 1!");

        //declare your twosum object then utilize the method you created
        /*

        int[] nums = {2,7,11,15};
        int target = 9;

        TwoSum res = new TwoSum();

        int[] result = res.twoSum(nums, target);

        System.out.println(Arrays.toString(result));
        */

        int[] nums = {1,2,2,2,2,2,2,2,5};

        ReplaceDuplicates res = new ReplaceDuplicates();

        System.out.println(res.replaceDuplicates(nums));
    }
}
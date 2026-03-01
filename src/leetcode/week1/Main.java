package leetcode.week1;

import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        System.out.println("Hello Leetcode week 1!");

        int[] nums = {2,7,11,15};
        int target = 9;

        //declare your twosum object then utilize the method you created
        TwoSum res = new TwoSum();

        int[] result = res.twoSum(nums, target);

        System.out.println(Arrays.toString(result));
    }
}
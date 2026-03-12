package leetcode.week1;

public class ReplaceDuplicates{
    public int replaceDuplicates(int[] nums){
        if(nums == null || nums.length == 0){
            System.out.println("The array is empty or null");
            return 0;
        }

        int k = 1;

        for(int num: nums){
            if(num != nums[k-1]){
                nums[k] = num;
                k++;
            }
        }

        return k;
    }
}
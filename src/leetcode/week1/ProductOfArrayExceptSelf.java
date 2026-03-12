package leetcode.week1;

public class ProductOfArrayExceptSelf{
    public int[] productOfArrayExceptSelf(int[] nums){
        if(nums == null || nums.length < 0){
            System.out.println("array is empty");
        }

        int leftProduct = 1;
        int rightProduct = 1;
        int[] output = new int[nums.length];

        for(int i = 0; i < nums.length ; i++){
            output[i] = leftProduct;
            leftProduct *= nums[i];
        }

        for(int i = nums.length - 1; i >= 0; i--){
            output[i] = output[i] * rightProduct;
            rightProduct *= nums[i];
        }

        return output;
    }
}
package Sliding;

public class MaxSumSubArraySizeK {
    public static void main(String[] args) {
        int[] nums = {2, 1, 5, 1, 3, 2};
        int k = 3;
        int left = 0;
        int sum = 0;
        int maxSum = 0;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            if ((right - left + 1) == k) {
                maxSum = Math.max(sum, maxSum);
                sum -= nums[left];
                left++;
            }
        }
        System.out.println(maxSum);
    }
}
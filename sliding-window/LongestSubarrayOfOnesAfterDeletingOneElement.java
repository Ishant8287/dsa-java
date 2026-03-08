package Sliding;

public class LongestSubarrayOfOnesAfterDeletingOneElement {
    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1};

        int left = 0;
        int maxLength = 0;
        int zeroCount = 0;
        for (int right = 0; right < nums.length; right++) {

            if (nums[right] == 0) {
                zeroCount++;
            }
            while (zeroCount > 1) {
                left++;
                if (nums[left] == 0) {
                    zeroCount--;
                }
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        System.out.println(maxLength);
    }
}

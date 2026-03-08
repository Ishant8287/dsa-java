package Sliding;

public class ConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {1, 0, 1, 1, 0, 1};

        int maxLen = 0;
        int left = 0;

        for (int right = 0; right < nums.length; right++) {

            while (left <= right && nums[right] != 1) {
                left++;
            }
            //Updating maximum length
            maxLen = Math.max(maxLen, right - left + 1);
        }

        System.out.println(maxLen);
    }
}

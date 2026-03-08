package Sliding;

public class SubarrayProductLessThanK {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int K = 0;
        if (K <= 1) {
            System.out.println(0);
        }
        int left = 0;
        int count = 0;
        int product = 1;

        for (int right = 0; right < nums.length; right++) {

            product *= nums[right];
            while (product >= K) {
                product /= nums[left];
                left++;
            }
            count += right - left + 1;
        }

        System.out.println(count);
    }
}

package Sliding;

import java.util.ArrayList;

public class SlidingWindowMaximum {
    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        int left = 0;
        int max = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        for (int right = 0; right < nums.length; right++) {
            if ((right - left + 1) == k) {
                for (int i = left; i <= right; i++) {
                    if (nums[i] > max) {
                        max = nums[i];
                    }
                }
                ans.add(max);
                max = 0;
                left++;
            }
        }
        int[] result = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }

        System.out.println(result);

    }
}

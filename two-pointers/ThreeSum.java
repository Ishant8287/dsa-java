package Pointers;

import java.util.Arrays;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        Arrays.sort(arr);
        int n = arr.length;
        int k = 0;

        for (int i = 0; i < n; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = n - 1;
            while (left < right) {
                if (arr[i] + arr[left] + arr[right] == 0) {
                    System.out.println("Mil gya");
                    left++;
                    right--;
                } else if (arr[i] + arr[left] + arr[right] > 0) {
                    right--;
                } else if (arr[i] + arr[left] + arr[right] < 0) {
                    left++;
                    
                }
            }
        }
    }
}

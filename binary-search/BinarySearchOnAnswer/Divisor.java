package BinarySearchOnAnswer;
public class Divisor {
    static void main() {
        int[] arr = {1, 2, 5, 9};
        int threshold = 6;
        int ans = -1;
        int low = 1; // minimum divisor
        int high = Max(arr); // maximum divisor which can divide whole array

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int totalSum = 0;
            for (int n : arr) {
                totalSum += (n + mid - 1)/mid ;
            }

            if (totalSum <= threshold) {
                ans = totalSum;
                high = mid - 1;
            } else low = mid + 1;

        }
    }

    static int Max(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int m : arr) {
            if (m > max) {
                max = m;
            }
        }
        return max;
    }
}

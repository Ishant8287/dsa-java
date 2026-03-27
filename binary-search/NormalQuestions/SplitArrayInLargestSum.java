public class SplitArrayInLargestSum {
    static void main() {
        int[] arr = {10, 20, 30, 40};
        int low = Max(arr);
        int high = Sum(arr);
        int k = 2;// Required Partition
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int partitions = 1;
            int sum = 0;

            for (int num : arr) {
                if (sum + num > mid) {
                    partitions++;
                    sum = num;
                } else {
                    sum += num;
                }
            }
            if (partitions > k) {
                low = mid + 1;
            } else {
                ans = mid;
                high = mid - 1;
            }
        }
        System.out.println("Largest Sum is: " + ans);
    }

    static int Max(int[] arr) {
        int max = -1;
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }

    static int Sum(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return sum;
    }
}

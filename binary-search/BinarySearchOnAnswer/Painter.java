package BinarySearchOnAnswer;
public class Painter {
    static void main() {
        int[] arr = {7,2,5,10,8};
        int low = max(arr);
        int high = sum(arr);
        int k = 2;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            int totalTime = 0;
            int painter = 1;
            for (int i : arr) {
                if ((totalTime + i) > mid) {
                    painter++;
                    totalTime = i;
                } else {
                    totalTime += i;
                }
            }
            if (painter <= k) {
                ans = mid;
                high = mid - 1;
            } else low = mid + 1;
        }
        System.out.println(ans);
    }

    static int max(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > max)
                max = i;
        }
        return max;
    }

    static int sum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }
}

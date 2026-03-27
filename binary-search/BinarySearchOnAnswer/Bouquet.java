package BinarySearchOnAnswer;
public class Bouquet {
    static void main() {
        int[] arr = {1, 10, 3, 10, 2};
        int low = min(arr);
        int high = max(arr);
        int m = 3;
        int k = 1;
        int minDay = Bouquet(arr, low, high, m, k);
        System.out.println("Minimum day required are: " + minDay);

    }

    static int min(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int n : arr) {
            if (n < min) {
                min = n;
            }
        }
        return min;
    }

    static int max(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int n : arr) {
            if (n > max) {
                max = n;
            }
        }
        return max;
    }

    static int Bouquet(int[] arr, int low, int high, int m, int k) {
        int ans = -1;
        if (m * k > arr.length) return -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int dayCount = 0;
            int bouquet = 0;
            for (int n : arr) {
                if (n <= mid) {
                    dayCount++;
                } else {
                    bouquet += dayCount / k;
                    dayCount = 0;
                }
            }
            bouquet += dayCount / k;
            if (bouquet >= m) {
                ans = mid;
                high = mid - 1;
            } else low = mid + 1;

        }
        return ans;
    }
}
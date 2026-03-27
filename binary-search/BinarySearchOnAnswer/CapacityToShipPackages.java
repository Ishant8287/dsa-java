package BinarySearchOnAnswer;

public class CapacityToShipPackages {
    static void main() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int days = 5;
        int ans = -1;
        int low = Max(arr);
        int high = Sum(arr);

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int currentLoad = 0;
            int requiredDays = 1;
            for (int weight : arr) {
                if ((currentLoad + weight) <= mid) {
                    currentLoad += weight;
                } else {
                    requiredDays++;
                    currentLoad = weight;
                }
            }
            if (requiredDays <= days) {
                ans = mid;
                high = mid - 1;
            } else low = mid + 1;
        }
        System.out.println(ans);
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

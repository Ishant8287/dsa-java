package BinarySearchOnAnswer;
public class AggressiveCows {
    static void main() {
        int[] stalls = {1, 2, 4, 8, 9}; // Stalls position
        int C = 3; //Number of Cows
        int ans = -1;

        int low = 1;
        int high = Max(stalls) - Min(stalls);

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int lastPos = stalls[0];
            int count = 1;
            for (int i = 1; i < stalls.length; i++) {
                if ((stalls[i] - lastPos >= mid)) {
                    count++;
                    lastPos = stalls[i];
                }
            }
            if (count < C) {
                high = mid - 1;
            } else {
                ans = mid;
                low = mid + 1;
            }
        }
        System.out.println(ans);
    }

    //Max
    static int Max(int[] stalls) {
        int max = Integer.MIN_VALUE;
        for (int n : stalls) {
            if (n > max) {
                max = n;
            }
        }
        return max;
    }

    static int Min(int[] stalls) {
        int min = Integer.MAX_VALUE;
        for (int n : stalls) {
            if (n < min) {
                min = n;
            }
        }
        return min;
    }
}

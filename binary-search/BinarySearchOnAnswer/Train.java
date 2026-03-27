package BinarySearchOnAnswer;

public class Train {
    static void main() {
        int[] arr = {5};
        double hour = 2.5;
        int low = max(arr);
        int high = sum(arr);
        if (hour <= arr.length - 1) System.out.println(-1);
        int result = speed(arr, low, hour, high);
        if (result != -1) {
            System.out.println(result);
        }
    }

    static int speed(int[] arr, int low, double hour, int high) {
        int ans = -1;

        while (low <= high) {
            double totalTime = 0;
            int mid = low + (int) (high - low) / 2;
            for (int i = 0; i < arr.length; i++) {
                if (i == arr.length - 1) {
                    totalTime += (double) arr[i] / mid;
                } else {
                    totalTime += (arr[i] + mid - 1) / mid;
                }
            }

            if (totalTime <= hour) {
                ans = mid;
                high = mid - 1;
            } else low = mid + 1;
        }
        return ans;
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

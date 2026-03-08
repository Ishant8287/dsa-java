public class MagneticForce {
    static void main() {
        int[] arr = {1, 2, 3, 4, 7};
        int low = 1;
        int m = 3;
        int ans = -1;
        int high = arr[arr.length - 1] - arr[0];
        while (low <= high) {
            int mid = low + (high - low) / 2;

            int count = 1;
            int lastPos = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] - lastPos >= mid) {
                    count++;
                    lastPos = arr[i];
                }
            }
            if (count >= m) {
                ans = mid;
                low = mid + 1;
            } else high = mid - 1;
        }
        System.out.println(ans);
    }
}

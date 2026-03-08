public class BallInABasket {
    static void main() {
        int[] arr = {1, 2, 3, 4, 7};
        int m = 3;
        int low = 1;
        int high = 6;
        int res = Ball(arr, low, high, m);
        System.out.println(res);
    }

    static int Ball(int[] arr, int low, int high, int m) {
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            int count = 1;
            int lastPos = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if ((arr[i] - lastPos) >= mid) {
                    count++;
                    lastPos = arr[i];
                }
            }
            if (count >= m) {
                ans = mid;
                low = mid + 1;
            } else high = mid - 1;
        }
        return ans;
    }
}

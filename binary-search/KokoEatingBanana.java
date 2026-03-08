public class KokoEatingBanana {
    static void main() {
        int[] piles = {30,11,23,4,20};
        int ans = -1;
        int high = Max(piles);
        int low = 1;
        int hours = 6;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int totalHours = 0;
            for (int n : piles) {
                totalHours += (n + mid - 1) / mid;
            }
            if (totalHours <= hours) {
                ans = mid;
                high = mid - 1;
            } else low = mid + 1;
        }

        System.out.println(ans);
    }

    static int Max(int[] arr) {
        int max = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}

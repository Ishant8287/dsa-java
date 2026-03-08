public class AllocateMinimumBook {
    static void main() {
        int[] arr = {12, 34, 67, 90};

        int low = 90;
        int high = 203;
        int k = 2;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            int sum = 0;
            int student = 1;
            for (int i : arr) {
                if ((sum + i) > mid) {
                    student++;
                    sum = i;
                } else sum += i;
            }
            if (student <= k) {
                ans = mid;
                high = mid - 1;
            } else low = mid + 1;
        }
        System.out.println(ans);
    }
}

import java.util.ArrayList;

public class RangeFirstAndLast {
    static void main() {
        int[] arr = {2, 4, 4, 4, 6, 7, 9, 9, 10, 12};
        int x = 4; //target
        boolean flag;
        ArrayList<Integer> ans = new ArrayList<>();
        int firstOccurrence = Bound(arr, x, true);
        int lastOccurrence = Bound(arr, x, false);
        ans.add(firstOccurrence);
        ans.add(lastOccurrence);
        System.out.println(ans);
    }

    static int Bound(int[] arr, int x, boolean flag) {
        int low = 0;
        int high = arr.length - 1;
        int idx = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (x < arr[mid]) {
                high = mid - 1;
            } else if (x > arr[mid]) {
                low = mid + 1;
            } else if (x == arr[mid]) {
                if (flag) {
                    idx = mid;
                    high = mid - 1;
                } else {
                    idx = mid;
                    low = mid + 1;
                }
            }
        }
        return idx;
    }

}

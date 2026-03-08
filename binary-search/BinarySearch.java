import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 4, 5, 5, 6, 6, 23, 2344, 2312312, 34324};
        Arrays.sort(arr);
        int target = 8;
        int ans = firstIndex(arr, target);
        System.out.println(ans);



    }

    public static int firstIndex(int[] arr, int target) {
        int low = 0, high = arr.length - 1, idx = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (target < arr[mid])
                high = mid - 1;
            else if (target > arr[mid])
                low = mid + 1;
            else {
                idx = mid;
                high = mid - 1;
            }
        }
        return idx;
    }
}


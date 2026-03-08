public class SearchInRotatedarrayDuplicate {
    static void main() {
        int[] arr = {1, 0, 1, 1, 1};

        int low = 0;
        int target = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {System.out.println(mid); break;    }
            else if (arr[mid] == arr[low] && arr[mid] == arr[high]) {
                low++;
                high--;
                continue;
            } else if (arr[mid] >= arr[low]) {
                if (target >= arr[low] && target < arr[mid]) high = mid - 1;
                else low = mid + 1;
            } else if (arr[mid] < arr[low]) {
                if (target <= arr[high] && target > arr[mid]) low = mid + 1;
                else high = mid - 1;
            }
        }
    }
}

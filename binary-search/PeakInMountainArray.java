public class PeakInMountainArray {
    static void main() {
        int[] arr = {-1, 0, 1, 2, 5, 6, 8, 6, 3};
        int result = peak(arr);
        System.out.println(result);

    }

    static int peak(int[] arr) {
        int low = 1; //cuz first elem cannot be peak
        int high = arr.length - 2; //last elem cannot be peak
        while (low <= high) {
            int mid = low + (high - low) / 2;
            // 1. Check if we found the peak
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return arr[mid];
            }
            // 2. If we are on the rising slope, the peak is to the right
            else if (arr[mid] < arr[mid + 1]) {
                low = mid + 1;
            }
            // 3. Otherwise, we must be on the falling slope or a flat spot
            else {
                high = mid - 1;
            }
        }
        return -1;
    }
}

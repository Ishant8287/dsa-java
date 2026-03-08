public class LastOccurence {
    static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 3, 4, 5, 5, 5, 6, 7, 8, 11};
        int low = 0;
        int target = 5;
        int high = arr.length - 1;
        int result = LastOcurrence(arr, target);
        System.out.println(result);
    }

    public static int LastOcurrence(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int idx = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (target < arr[mid]) {
                high = mid - 1;
            } else if (target > arr[mid]) {
                low = mid + 1;
            } else {
                idx = mid;
                low = mid + 1;
            }
        }
        return idx;
    }

}

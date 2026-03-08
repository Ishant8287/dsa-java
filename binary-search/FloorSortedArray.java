public class FloorSortedArray {
    static void main() {
        int[] arr = {1, 2, 4, 10, 10, 12, 19};
        int x = 5;
        int low = 0;
        int idx = -1;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (x < arr[mid]) {
                high = mid - 1;
            }
            else if(x >= arr[mid]){
                idx = mid;
                low = mid + 1;
            }
        }
        System.out.println(idx);
    }
}


public class BinarySearchUsingRecursion {
    static void main() {
        int[] arr = {0, 89, 99, 102, 334, 990};
        int low = 0;
        int high = arr.length - 1;
        int target = 99;
        System.out.println(binarySearch(arr, low, high, target));;
    }

    static boolean binarySearch(int[] arr, int low, int high, int target) {
        if (low > high) return false; // If low crosses high
        int mid = low + (high - low) / 2;
        if (arr[mid] == target) return true;
        else if (target > arr[mid]) return binarySearch(arr, mid + 1, high, target); // go right
        else return binarySearch(arr, low, mid - 1, target);// go left
    }
}

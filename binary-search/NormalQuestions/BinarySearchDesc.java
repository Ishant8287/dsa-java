package NormalQuestions;
public class BinarySearchDesc {
    static void main(String[] args) {
        int[] arr = {99, 98, 78, 67, 56, 1};
        int target = 98;
        int i = 0;
        int j = arr.length - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (target < arr[mid]) {
                i = mid + 1;
            } else if (target > arr[mid]) {
                j = mid - 1;
            } else {
                System.out.print("Element found at " + mid);
                break;
            }
        }

    }
}

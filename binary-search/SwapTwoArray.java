public class SwapTwoArray {
    public static void main(String[] args) { // Added String[] args and public
        int[] arr = {1, 2, 3, 4};
        int[] arr1 = {5, 6, 7, 8};

        swap(arr, arr1);

        // Verify the swap
        for (int n : arr) {
            System.out.println(n);
        }
    }

    static void swap(int[] a, int[] b) {
        // We must loop and swap the actual values inside the boxes
        for (int i = 0; i < a.length; i++) {
            int temp = a[i];
            a[i] = b[i];
            b[i] = temp;
        }
    }
}

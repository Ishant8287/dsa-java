public class ReverseAnArray {
    static void main() {
        int[] arr = {1, 2, 3, 4, 5, 6};

        Reverse(arr, 0, 5);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    static void Reverse(int[] arr, int i, int j) {
        if (i >= j) return;
        else {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            Reverse(arr, i + 1, j - 1);
        }
    }


}

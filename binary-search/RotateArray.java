public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        int k = 3;//rotate
        int i = 0;
        int j = arr.length - 1;

        reverse(arr, 0, j);
        reverse(arr, 0, k - 1);
        reverse(arr, k, j);
        for (int elem : arr) {
            System.out.print(elem + " ");
        }

    }

    public static void reverse(int[] arr, int i, int j) {
        while (i <= j) {
            int temp;
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}

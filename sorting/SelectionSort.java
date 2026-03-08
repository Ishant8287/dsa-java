public class SelectionSort {
    public static void display(int[] arr) {
        for (int elem : arr) {
            System.out.print(elem + " ");
        }
    }

    static void main(String[] args) {
        int[] arr = {-9, 99, 23, 45, -89, -99999999, 0, 45, 8, 69, 106};
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int min = Integer.MAX_VALUE;
            int idx = -1;
            for (int j = i; j < n; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    idx = j;
                }
            }
            //swap
            int temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;
        }
        display(arr);

    }
}
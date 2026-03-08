public class Bubble_Sort {
    static void main(String[] args) {
        int[] arr = {99, 87, 1, 0, 45, 78};
        int n = arr.length;
        for (int j = 0; j < n - 1; j++) { //n-1 passes
            for (int i = 0; i < n - 1 - i; i++) { //n-2 passes
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        display(arr);
    }

    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

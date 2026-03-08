public class BubbleSort_desc_order {
    public static void display(int[] arr) {
        for (int elem : arr) {
            System.out.print(elem + " ");
        }
    }

    public static void main(String[] args) {
        //Array
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) { //n-1 passes
            boolean isSorted = true; //Initially array is sorted
            for (int j = 0; j < n - 1 - i; j++) { //n-2 passes
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSorted = false;
                }
            }
            //After array is sorted break the main loop
            if (isSorted) break;
        }
        display(arr);
    }
}




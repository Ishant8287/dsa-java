package Level_2;

public class ReverseArray {
    static void main() {
        int[] arr = {5, 3, 7, 12, 76, 9, 34, 5};
        recPrint(arr, arr.length - 1);
        System.out.println(); // for next line
        recPrint_2(arr, 0);
    }


    static void recPrint(int[] arr, int end) {
        if (end < 0) return;
        System.out.print(arr[end] + " ");
        recPrint(arr, end - 1);
    }

    //Other way
    static void recPrint_2(int[] arr, int start) {
        if (start == arr.length) return;
        recPrint_2(arr, start + 1);
        System.out.print(arr[start] + " ");
    }
}

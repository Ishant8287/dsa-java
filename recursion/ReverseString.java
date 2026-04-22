package Level_2;

public class ReverseString {
    //LeetCode 344
    static void main() {
        char[] arr = {'h', 'e', 'l', 'l', '0'};
        //I just have to reverse that using recursion
        int i = 0;
        int j = arr.length - 1;

        recursive(arr, i, j);
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }

    static void recursive(char[] arr, int i, int j) {
        if (i >= j) {
            return;
        }
        //Swap
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        //Recursive call
        recursive(arr, i + 1, j - 1);
    }

}

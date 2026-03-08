package Pointers;
public class DuplicateSortedArray {
    static void main() {
        int[] arr = {1, 1, 2};

        int slow = 0;
        int fast = 1;

        for (fast = 1; fast < arr.length; fast++) {
            if (arr[slow] != arr[fast]) {
                slow++;
                arr[slow] = arr[fast];
            }
        }
        System.out.println(slow + 1);
    }
}

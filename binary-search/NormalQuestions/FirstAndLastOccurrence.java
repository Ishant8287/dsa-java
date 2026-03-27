package NormalQuestions;

import java.util.ArrayList;

public class FirstAndLastOccurrence {
    static void main() {
        int[] arr = {1, 1, 2, 2, 2, 3, 4, 5, 5, 5, 6, 7, 8, 11};
        int low = 0;
        int target = 5;
        int high = arr.length - 1;
        int first = FirstOcurrence(arr, target);
        int last = LastOccurence(arr, target);
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(first);
        answer.add(last);
        System.out.println(answer);
    }

    static int FirstOcurrence(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int idx = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (target < arr[mid]) {
                high = mid - 1;
            } else if (target > arr[mid]) {
                low = mid + 1;
            } else {
                idx = mid;
                high = mid - 1;
            }
        }
        return idx;
    }

    static int LastOccurence(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int idx = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (target < arr[mid]) {
                high = mid - 1;
            } else if (target > arr[mid]) {
                low = mid + 1;
            } else {
                idx = mid;
                low = mid + 1;
            }
        }
        return idx;
    }

}

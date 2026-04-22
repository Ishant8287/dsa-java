package backtracking;
 import java.util.*;

public class Permutation {
    static void main() {
    int[] nums = {1,2,3};
        List<List<Integer>> result = new ArrayList<>();
        per(nums, new ArrayList<>(), 0, result);
        System.out.println(result);
    }

    static void per(int[] arr, List<Integer> list, int index, List<List<Integer>> result) {
        if (index == arr.length) {
            result.add(new ArrayList<>(list));
            return;
        }
        for (int i = index; i < arr.length; i++) {
            //include
            //swap arr[index] and arr[i]
            swap(arr, index, i);

            //add in list
            list.add(arr[index]);

            //explore
            per(arr, list, index + 1, result);

            //backtrack
            list.remove(list.size() - 1);
            //swap again to get array back
            swap(arr, index, i);
        }
    }

    //swap function
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}

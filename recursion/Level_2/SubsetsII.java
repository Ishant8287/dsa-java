package Level_2;

import java.util.*;

//LeetCode 90
public class SubsetsII {
    static void main() {
        int[] nums = {1, 2, 2};
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        subsetNoDuplicate(nums, new ArrayList<>(), 0, result);
        Collections.sort(result, (a, b) -> a.size() - b.size());
        System.out.println(result);

    }

    static void subsetNoDuplicate(int[] arr, List<Integer> list, int index, List<List<Integer>> result) {
        //base case
        if (index == arr.length) {
            result.add(new ArrayList<>(list));
            return;
        }

        //include
        list.add(arr[index]);
        subsetNoDuplicate(arr, list, index + 1, result);

        //exclude
        list.remove(list.size() - 1);

        //Check duplicate
        int i = index + 1;
        while (i < arr.length && arr[i] == arr[i - 1]) {
            i++;
        }


        //backtrack
        subsetNoDuplicate(arr, list, index + 1, result);

    }

}

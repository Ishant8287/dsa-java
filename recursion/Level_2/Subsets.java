package Level_2;

import java.util.*;

public class Subsets {
    static void main() {
        int[] nums = {1, 2, 3};
        //I need to generate ite subsets -> [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
        // I need to calculate power set of this set
        //This naturally leads to a recursive approach, or I correctly say backtracking approach
        //so for this I am going to use an empty list in which I store my subset and add, ans in a result list and to backtrack I will remove last elem from list
        List<List<Integer>> result = new ArrayList<>();
        subsetOfArray(nums, new ArrayList<>(), 0, result);
        Collections.sort(result, (a, b) -> a.size() - b.size());
        System.out.println(result);

    }

    static void subsetOfArray(int[] arr, List<Integer> list, int index, List<List<Integer>> result) {
        //Base case
        if (index == arr.length) {
            result.add(new ArrayList<>(list));
            return;
        }


        //include
        list.add(arr[index]);
        subsetOfArray(arr, list, index + 1, result);

        //remove / exclude
        list.remove(list.size() - 1);

        //Backtrack
        subsetOfArray(arr, list, index + 1, result);
    }
}
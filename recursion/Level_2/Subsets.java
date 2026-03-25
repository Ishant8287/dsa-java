package Level_2;

//LC 78
import java.util.*;

public class Subsets {
    static void main() {
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = new ArrayList<>();
        subset(nums, new ArrayList<>(), 0, result);

        //Print result
        Collections.sort(result, (a, b) -> a.size() - b.size());
        System.out.println(result);
    }

    static void subset(int[] arr, List<Integer> list, int index, List<List<Integer>> result) {
        //Base case
        if (arr.length == index) {
            result.add(new ArrayList<>(list));
            return;
        }

        //Include
        list.add(arr[index]);
        subset(arr, list, index + 1, result);


        //Backtrack
        list.remove(list.size() - 1);

        //exclude
        subset(arr, list, index + 1, result);


    }
}

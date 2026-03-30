package Level_2;

import java.util.*;

//Lc 77
public class Combinations {
    static void main() {
        int n = 4;
        int k = 2;
        List<List<Integer>> result = new ArrayList<>();
        help(1, n, k, new ArrayList<>(), result);
        System.out.println(result);
    }

    static void help(int start, int n, int k, List<Integer> list, List<List<Integer>> result) {
        // If the size
        if (list.size() == k) {
            result.add(new ArrayList<>(list));
            return;
        }

        for (int i = start; i <= n; i++) {
            list.add(i); //choose
            help(i + 1, n, k, list, result); //explore
            list.remove(list.size() - 1); //backtrack
        }
    }
}

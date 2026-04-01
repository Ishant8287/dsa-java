package Level_2;

import java.util.*;

public class PalindromePartitioning {
    public static void main(String[] args) {
        String s = "aab";
        List<List<String>> result = new ArrayList<>();
        par(s, 0, new ArrayList<>(), result);
        System.out.println(result);
        ;
    }

    static void par(String s, int start, List<String> list, List<List<String>> result) {
        // Base case
        if (start == s.length()) {
            result.add(new ArrayList<>(list));
            return;
        }

        // Explore all possible substrings starting from 'start'
        for (int i = start; i < s.length(); i++) {
            if (isPalindrome(s, start, i)) {
                // CHOOSE
                list.add(s.substring(start, i + 1));

                // EXPLORE
                par(s, i + 1, list, result);

                // BACKTRACK
                list.remove(list.size() - 1);
            }
        }
    }

    static boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

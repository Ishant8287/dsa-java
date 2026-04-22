package backtracking;

import java.util.*;

public class PalindromePartitioning {
    static void main() {
        String s = "aab";
        List<List<String>> result = new ArrayList<>();
        helper(s, 0, new ArrayList<>(), result);
        System.out.println(result);
    }

    static void helper(String s, int start, List<String> list, List<List<String>> result) {
        if (start == s.length()) {
            result.add(new ArrayList<>(list));
            return;
        }

        for (int i = start; i < s.length(); i++) {
            if (isPalindrome(s, start, i)) {
                //If it is palindrome then add to list -> choose
                list.add(s.substring(start, i + 1));

                //explore
                helper(s, i + 1, list, result);

                //backtrack
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

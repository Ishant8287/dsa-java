package Sliding;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "abcadeafgha";

        int left = 0;
        int maxLen = 0;

        HashSet<Character> set = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            //Checking duplicacy
            while (set.contains(ch)) {
                set.remove(s.charAt(left));
                left++;
            }

            //adding char to hash set if not present
            set.add(ch);

            maxLen = Math.max(maxLen, right - left + 1);
        }

        System.out.println(maxLen);
    }
}

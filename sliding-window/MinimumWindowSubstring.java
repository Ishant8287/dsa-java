package Sliding;

import java.util.HashMap;

public class MinimumWindowSubstring {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";


        int[] need = new int[128];
        int[] window = new int[128];
        int left = 0;
        int length = 0;
        int minLen = Integer.MAX_VALUE;
        int start = 0;
        int have = 0;
        int required = 0;


        for (char ch : t.toCharArray()) {
            if (need[ch] == 0) {
                required++;
            }
            need[ch]++;
        }

        for (int right = 0; right < s.length(); right++) {
            window[s.charAt(right)]++;

            //Check does it in need or not if yes inc have by 1
            if (need[s.charAt(right)] > 0 && need[s.charAt(right)] == window[s.charAt(right)]) {
                have++;
            }

            //and when have is equals to required
            while (have == required) {
                length = right - left + 1;
                if (length < minLen) {
                    minLen = length;
                    start = left;
                }
                window[s.charAt(left)]--;
                if (need[s.charAt(left)] > 0 && need[s.charAt(left)] > window[s.charAt(left)]) {
                    have--;
                }
                left++;
            }
        }

        if (minLen == Integer.MAX_VALUE) {
            System.out.println("");
        } else {
            System.out.println(s.substring(start, start + minLen));
        }
    }
}

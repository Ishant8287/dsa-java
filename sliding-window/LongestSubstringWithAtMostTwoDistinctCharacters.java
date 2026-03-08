package Sliding;

import java.util.HashMap;

//Leet code 159
public class LongestSubstringWithAtMostTwoDistinctCharacters {
    public static void main(String[] args) {
        String s = "abcbbbbcccbdddadacb";

        HashMap<Integer, Integer> map = new HashMap<>();
        int maxLength = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            int index = s.charAt(right) - 'a';
            map.put(index, map.getOrDefault(index, 0) + 1);

            while (map.size() > 2) {
                int leftIndex = s.charAt(left) - 'a';
                map.put(leftIndex, map.get(leftIndex) - 1);
                if (map.get(leftIndex) == 0) {
                    map.remove(leftIndex);
                }
                left++;
            }

            //Update max
            maxLength = Math.max(maxLength, right - left + 1);
        }
        System.out.println(maxLength);
    }
}

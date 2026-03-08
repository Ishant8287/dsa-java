package Sliding;

import java.util.ArrayList;

public class PermutationInString {
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";
        boolean x = checkInclusion(s1, s2);
        System.out.println(x);




    }

    public static boolean checkInclusion(String s1, String s2) {
        int[] need = new int[26];
        int[] window = new int[26];

        int k = s1.length();
        int left = 0;


        //Count frequency of characters in s1
        for (int i = 0; i < k; i++) {
            int index = s1.charAt(i) - 'a';
            need[index]++;
        }

        //Loop on s2
        for (int right = 0; right < s2.length(); right++) {
            int index = s2.charAt(right) - 'a';
            window[index]++;

            while ((right - left + 1) > k) {
                int leftIndex = s2.charAt(left) - 'a';
                window[leftIndex]--;
                left++;
            }

            if ((right - left + 1) == k) {
                boolean flag = true;
                for (int i = 0; i < 26; i++) {
                    if (need[i] != window[i]) {
                        flag = false;
                        break;
                    }
                }
                if (flag == true) {
                    return true;
                }
            }
        }
        return false;
    }

}


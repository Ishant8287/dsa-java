package Sliding;

public class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {
        String s = "ABABBA";
        int k = 2; // Maximum replacements
        int[] need = new int[26];
        int left = 0;
        int maxFrequency = 0;//Initially
        int maxLength = 0;
        for (int right = 0; right < s.length(); right++) {
            int index = s.charAt(right) - 'A';
            need[index]++;
            maxFrequency = Math.max(maxFrequency, need[index]); //Update maxFrq

            while (((right - left + 1) - maxFrequency) > k) {
                int leftIndex = s.charAt(left) - 'A';
                need[leftIndex]--;
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }
        System.out.println(maxLength);
    }
}

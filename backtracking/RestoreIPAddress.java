package Level_2;

import java.util.*;

public class RestoreIPAddress {

    static void main() {
        String s = "25525511135";
        List<String> result = new ArrayList<>();
        if (s.length() < 4 || s.length() > 12)
            System.out.println(result);
        backtrack(s, 0, new ArrayList<>(), result);
        System.out.println(result);
    }

    static void backtrack(String s, int start, List<String> current, List<String> result) {
        // Base Case:
        if (current.size() == 4) {
            if (start == s.length()) {
                result.add(String.join(".", current));
            }
            return;
        }

        int remainingSlots = 4 - current.size();
        if (s.length() - start > remainingSlots * 3 || s.length() - start < remainingSlots) {
            return;
        }

        // Try lengths 1, 2, and 3
        for (int len = 1; len <= 3 && start + len <= s.length(); len++) {
            String segment = s.substring(start, start + len);

            if (isValid(segment)) {
                current.add(segment); // Choose
                backtrack(s, start + len, current, result); // Explore
                current.remove(current.size() - 1); // Backtrack
            }
        }
    }

    static boolean isValid(String segment) {
        // Check leading zero
        if (segment.length() > 1 && segment.startsWith("0"))
            return false;

        // Check value range
        int val = Integer.parseInt(segment);
        return val >= 0 && val <= 255;
    }
}

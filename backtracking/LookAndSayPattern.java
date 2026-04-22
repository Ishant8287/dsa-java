package backtracking;

public class LookAndSayPattern {
    static void main() {
        String res = lookAndSay(5);
        System.out.println(res);

    }

    static String lookAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        String s = lookAndSay(n - 1) + "#";

        //Backtracking part
        String ans = "";
        int i = 0, j = 0;
        while (j < s.length()) {
            if (s.charAt(i) == s.charAt(j)) {
                j++;
            } else {
                int frequency = j - i;
                ans += frequency;
                ans += s.charAt(i);
                i = j;
            }
        }
        //If, if condition is true then this will handle remaining part
        int frequency = j - i;
        ans += frequency;
        ans += s.charAt(i);
        return ans;
    }
}

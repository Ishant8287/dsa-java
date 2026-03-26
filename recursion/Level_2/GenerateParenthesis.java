package Level_2;

import java.util.*;


//Lc 22
public class GenerateParenthesis {
    static void main() {
        int n = 1;
        List<String> ans = new ArrayList<>();
        helper("", 0, 0, ans, n);
        System.out.print(ans);

    }

    static void helper(String ans, int l, int r, List<String> list, int x) {
        if (r == x) {
            list.add(ans);
            return;
        }
        if (l < x) {
            helper(ans + "(", l + 1, r, list, x);
        }
        if (r < l) {
            helper(ans + ")", l, r + 1, list, x);
        }
    }
}

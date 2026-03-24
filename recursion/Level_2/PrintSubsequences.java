package Level_2;

public class PrintSubsequences {
    static void main() {
        String s = "abc";
        subsequences(" ", s, 0);
    }

    static void subsequences(String ans, String s, int index) {
        if (index == s.length()) {
            System.out.print(ans + " ");
            return;
        }
        char ch = s.charAt(index);
        subsequences(ans + ch, s, index + 1); //Include
        subsequences(ans, s, index + 1); //Exclude
    }
}

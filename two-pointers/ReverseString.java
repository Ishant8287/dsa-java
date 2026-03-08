public class ReverseString {
    static void main() {
        String[] s = {"h", "e", "l", "l", "o"};

        int i = 0;
        int j = s.length - 1;
        while (i < j) {
            String temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
        for (String s1 : s) {
            System.out.print(s1 + " ");
        }
    }
}

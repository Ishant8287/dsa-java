public class PalindromeString {
    static void main() {
        String x = "Ishant";
        int n = x.length();
        boolean isPalindrome = true;
        int i = 0;
        int j = n - 1;
        while (i < j) {
            if (x.charAt(i) != x.charAt(j)) {
                isPalindrome = false;
                break;
            } else {
                i++;
                j--;
            }
        }
        if (isPalindrome) {
            System.out.println("It is a Palindrome");
        } else {
            System.out.println("Not a palkindrome");
        }
    }
}

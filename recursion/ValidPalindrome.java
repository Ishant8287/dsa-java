package Level_2;

public class ValidPalindrome {
    static void main() {
        String s = "A man, a plan, a canal: Panama";
        int l = 0;
        int r = s.length() - 1;
        System.out.println(isPalindrome(s, l, r));
    }

    public static boolean isPalindrome(String s, int l, int r) {
        //If left pointer crosses right pointer
        if (l >= r) {
            return true;
        }
        //If character is blank then go right
        if (!Character.isLetterOrDigit(s.charAt(l))) {
            return isPalindrome(s, l + 1, r);
        }
        //If character is blank then go left
        if (!Character.isLetterOrDigit(s.charAt(r))) {
            return isPalindrome(s, l, r - 1);
        }
        //if character is not same after converting it to lc return false
        if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) {
            return false;
        }
        //call recursively
        else return isPalindrome(s, l + 1, r - 1);

    }
}

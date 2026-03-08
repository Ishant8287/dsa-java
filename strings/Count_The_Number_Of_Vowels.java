public class Count_The_Number_Of_Vowels {
    static void main() {
        String x = "Practice makes a man Perfect, especially 70 LeetCode problems!";
        String vowels = "aeiouAEIOU";
        int count = 0;

        for (int i = 0; i < x.length(); i++) {
            char ch = x.charAt(i);
            if (vowels.indexOf(ch) != -1) {
                count++;
            }
        }
        System.out.print("Total number of vowels are: " + count);
    }
}

public class CompareTo {
    static int compareTo(String a, String b) {
        int i = 0;
        int j = 0;
        int n = a.length() - 1;
        int m = b.length() - 1;
        while (n >= m) {
            char first = a.charAt(i);
            char second = b.charAt(j);
            if (Character.isLowerCase(first) && Character.isLowerCase(second)) {
                if (first == second) {
                    i++;
                    j--;
                } else if (first > second) {
                    System.out.println(first - second);
                } else System.out.println(second - first);
            }
        }


        return -1;
    }

    static void main() {

    }
}

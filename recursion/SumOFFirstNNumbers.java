public class SumOFFirstNNumbers {
    static void main() {
        int ans = Sum(10);
        System.out.println(ans);
    }

    static int Sum(int n) {
        if (n == 0) return 0;
        int res = n + Sum(n - 1);
        return res;
    }
}

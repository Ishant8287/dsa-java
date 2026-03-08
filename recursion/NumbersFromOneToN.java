public class NumbersFromOneToN {
    static void main() {
        print(1);
    }

    static void print(int n) {
        if (n == 11) return;
        System.out.println(n);
        print(n + 1);
    }
}

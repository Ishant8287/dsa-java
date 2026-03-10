package Level_1;

public class PrintNumberFromOneToN {
    static void main() {
        print(10);
    }

    static void print(int n) {
        if (n == 0) {
            return;
        } else {
            print(n - 1);
            System.out.println(n);
        }
    }
}

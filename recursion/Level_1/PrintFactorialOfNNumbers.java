package Level_1;

public class PrintFactorialOfNNumbers {
    static void main() {
        System.out.println(factorial(5));
    }

    static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else return n * factorial(n - 1);
    }
}

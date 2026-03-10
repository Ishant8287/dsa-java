package Level_1;

//Time Complexity	O(2ⁿ)
//Space Complexity	O(n) (recursion stack)
public class PrintFibonacciSeries {
    static void main() {
        System.out.println(Fib(10));
    }

    static int Fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        else return Fib(n - 1) + Fib(n - 2);
    }
}

package Level_2;

public class Tribonacci {
    static void main() {
        //Recursive approach
        int res = tribonacci(25);
        System.out.println(res);

        //Iterative approach
        int res1 = tribonacci2(50);
        System.out.println(res1);
    }

    //Recursive approach
    static int tribonacci(int n) {
        if (n == 0)
            return 0;
        if (n == 1 || n == 2)
            return 1;
        return tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);
    }

    //Iterative approach
    static int tribonacci2(int n) {
        if (n == 0) return 0;
        if (n == 1 || n == 2)
            return 1;
        int a = 0;
        int b = 1;
        int c = 1;
        for (int i = 3; i <= n; i++) {
            int d = a + b + c;
            a = b;
            b = c;
            c = d;
        }
        return c;
    }
}

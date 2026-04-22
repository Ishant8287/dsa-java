package Level_1;

public class SumOfSquare {
    static void main() {
        System.out.println(sumOfSquares(5));
    }


    //Formula can be used for optimal approach -> n(n+1)(2n+1)/6
    static int sumOfSquares(int n) {
        if (n == 1) {
            return 1;
        }
        return n * n + sumOfSquares(n - 1);
    }

}

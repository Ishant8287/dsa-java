package Level_2;

public class UniquePathIterativeMethod {
    public static void main(String[] args) {
        int res = uniquePaths(3, 7);
        System.out.println(res);
    }

    static int uniquePaths(int m, int n) {

        /*

        We are standing at (0,0) and want to reach (m-1, n-1)
        Allowed moves: only RIGHT or DOWN

        Total moves required = (m-1) DOWN + (n-1) RIGHT
                             = m + n - 2 moves

        Now we need to choose positions for DOWN moves (or RIGHT moves)

        So total ways = Combination:
        C(m+n-2, m-1)  OR  C(m+n-2, n-1)

        Example:
        m = 3, n = 7
        Total moves = 3+7-2 = 8
        Down moves = 2

        So answer = 8C2
        */

        int N = m + n - 2;   // total moves
        int r = Math.min(m - 1, n - 1);       // number of DOWN moves

        /*
        We calculate nCr using iterative formula:

        nCr = n! / (r! * (n-r)!)

        Optimized formula:
        nCr = (n-r+1)/1 * (n-r+2)/2 * ... * (n)/r
        */

        double path = 1;

        for (int i = 1; i <= r; i++) {
            path = path * (N - r + i) / i;
        }

        return (int) path;
    }
}
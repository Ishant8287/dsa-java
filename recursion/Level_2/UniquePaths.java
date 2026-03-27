package Level_2;

import java.util.Scanner;

public class UniquePaths {
    static void main() {
        //Leet code 62
        //Constraints 1 <= m, n <= 100
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int m = sc.nextInt();
        System.out.print("Enter columns: ");
        int n = sc.nextInt();

        int result = uniquePaths(m, n);
        System.out.println("Number of possible unique paths that the robot can take to reach the bottom-right corner: " + result);
    }

    static int uniquePaths(int m, int n) {
        if (m == 1 || n == 1) return 1;

        return uniquePaths(m, n - 1) + uniquePaths(m - 1, n);
    }
}

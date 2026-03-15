package Level_1;

import java.util.Scanner;

//Leetcode -> 70
public class ClimibingStairs {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = scanner.nextInt();
        System.out.println(climbStairs(n));

    }

    static int climbStairs(int n) {
        if (n <= 2) return n;
        return climbStairs(n - 1) + climbStairs(n - 2);
    }

    // When n= 45 it gives 1836311903 so we have two options either memo or for loop
    //With for loop
    static int climbStairsUsingFor(int n) {
        if (n <= 2) return n;
        int a = 1;
        int b = 2;
        for (int i = 3; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    //with memo ->  I will do it after I learn it x


}

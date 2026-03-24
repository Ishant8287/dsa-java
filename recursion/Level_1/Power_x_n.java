//50. Pow(x, n)
//Recursion
//Constraints
//-100.0 < x < 100.0
//-231 <= n <= 231-1
//n is an integer.
//Either x is not zero or n > 0.
//-104 <= xn <= 104
package Level_1;

import java.util.Scanner;


public class Power_x_n {
    void main() {
        Scanner scanner = new Scanner(System.in);

        //Enter base
        System.out.print("Enter base: ");
        double base = scanner.nextDouble();

        //Enter exponent
        System.out.print("Enter exponent: ");
        int exp = scanner.nextInt();


        //Result
        double res = myPow(base, exp);
        System.out.println("Base to the power exp is: " + res);


    }

    static double myPow(double x, int n) {
        // If exp becomes 0 then return 1 this is the base case here
        if (n == 0) return 1;

        //If n means exp is neg then simply make x as 1/x and n as -n
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }

        //then just apply recursion
        if (n % 2 == 0) {
            double half = myPow(x, n / 2);
            return half * half;
        }
        return x * myPow(x, n - 1);


    }
}

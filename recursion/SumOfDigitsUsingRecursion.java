package Level_1;

public class SumOfDigitsUsingRecursion {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(5274));
    }

    static int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        } else {
            return (n % 10) + sumOfDigits(n / 10);
        }
    }
}

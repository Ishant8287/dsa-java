package Level_1;

public class PrintAllNumbersFromOneToNButOnlyEvenNumbers {
    static void main() {
        EvenNumbers(10);
    }

    static void EvenNumbers(int n) {
        if (n == 0) {
            return;
        }
        EvenNumbers(n - 1);
        if (n % 2 == 0) {
            System.out.println(n);
        }
    }
}

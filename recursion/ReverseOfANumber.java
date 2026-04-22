package Level_1;

public class ReverseOfANumber {
    static int rev = 0;

    static void main() {
        int x = 5989;
        //op -> 9895
        int res = ReverseIterative(x, rev);
        System.out.println(Reverse(x, rev));
        System.out.println(res);

    }

    //Recursive approach
    static int Reverse(int x, int z) {
        if (x == 0) {
            return z;
        }
        z = z * 10 + x % 10;
        return Reverse(x / 10, z);
    }

    //Iterative Method
    static int ReverseIterative(int x, int y) {
        while (x > 0) {
            int digit = x % 10;
            y = y * 10 + digit;
            x = x / 10;
        }
        return y;
    }
}

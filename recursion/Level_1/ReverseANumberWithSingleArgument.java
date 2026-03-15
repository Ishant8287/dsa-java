package Level_1;

public class ReverseANumberWithSingleArgument {
    static void main() {
        System.out.println(Reverse(5989));
    }

    static int Reverse(int x) {
        if (x < 10) return x;
        int digits = (int) Math.log10(x);
        return ((x % 10) * (int) Math.pow(10, digits) + Reverse(x/10));
    }
}

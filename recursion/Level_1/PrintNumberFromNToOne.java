package Level_1;

public class PrintNumberFromNToOne {
    static void main() {
        print(10);
    }

    static void print(int n) {
        if (n == 0) {
            return;
        } else {
            System.out.println(n);
            print(n - 1);
        }
    }
}

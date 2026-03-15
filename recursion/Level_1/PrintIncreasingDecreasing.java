package Level_1;

public class PrintIncreasingDecreasing {
    static void main() {
        //Print 5 4 3 2 1 1 2 3 4 5

//        printDec(5);
//        printInc(1);

        printIncDec(5);
    }


    static void printIncDec(int n) {
        if (n == 0) return;
        System.out.println(n);
        printIncDec(n - 1);
        System.out.println(n);
    }

//    static void printDec(int n) {
//        if (n == 0) return;
//        System.out.print(n + " ");
//        printDec(n - 1);
//    }

//    static void printInc(int n) {
//        if (n == 6) return;
//        System.out.print(n + " ");
//        printInc(n + 1);
//
//    }
}

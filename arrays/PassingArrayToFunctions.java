package Lecture_10;

public class PassingArrayToFunctions {
    public static void main(String[] args) {
//        With numbers
//        int x = 10;
//        change(x);
//        System.out.println(x); //10
//
//
//    public static void change(int x) {
//        x = 20;
        //With array
        int[] x = {10, 3, 29, 38};
        change(x);
        System.out.println(x[2]);
    }

    public static void change(int[] y) {
        y[2] = 99;
    }
}
//reason:->yha refrence bnta hai new array nhi bnat
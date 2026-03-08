package Lecture_10;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        //sort
        int[] arr = {4, 1, 7, 5};
        print(arr);
        Arrays.sort(arr);
        print(arr);//Sorted Array print
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

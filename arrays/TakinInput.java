package Lecture_10;

import java.util.Scanner;

public class TakinInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        //input
        System.out.print("Enter numbers: ");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        //output
        System.out.print("Numbers are: ");
        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " ");
        }
        scanner.close();
    }

}
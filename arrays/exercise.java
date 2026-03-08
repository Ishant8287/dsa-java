package Lecture_10;

import java.util.Scanner;

public class exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = scanner.nextInt();
        int k = 0;

        //Array create
        int[] numbers = new int[size];

        //input
        System.out.print("Enter numbers: ");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.print("Enter number to search: ");
        int searchNumber = scanner.nextInt();

        //search
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == searchNumber) {
                System.out.println("Number found at index: " + i);
                k++;
            }
        }

        if(k==0){
            System.out.println("Number NOT found!");
        }


        scanner.close();
    }

}
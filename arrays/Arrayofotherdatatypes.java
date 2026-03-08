package Lecture_10;

public class Arrayofotherdatatypes {
    public static void main(String[] args) {
        //character array -> gives null character as we didn't give values to our array
        char[] arr = new char[8];
        for (char elem : arr) {
            System.out.print(elem + " ");
        }
        System.out.println();
        //And
//        char ch = '\0'; //gives null character
//        System.out.println((int) ch);

        //String
        String[] a = {"Ishant", "Ishita", "idk"};
        for (String elem : a) {
            System.out.print(elem + " ");
        }


    }
}

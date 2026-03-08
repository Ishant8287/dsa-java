package Lecture_10;

public class Array {
    public static void main(String[] args) {
        //type[] arrayName = new type[size]
        int[] marks = new int[3];
        //int marks[] = new int[3]; We can do this also
        // int marks[] = {97,98,95};
        marks[0] = 97;//phy
        marks[1] = 98; //Chem
        marks[2] = 95; //eng

//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);

        for (int i = 0; i < 3; i++) {
            System.out.println(marks[i]);
        }

    }
}
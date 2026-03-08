package Lecture_10;

public class forEach {
    public static void main(String[] args) {
        //for each used to traverse the ds we can't modify array elements
        int[] arr = {5,6,2,8,9};
        for(int element : arr){
            System.out.print(element + " ");
        }
    }
}

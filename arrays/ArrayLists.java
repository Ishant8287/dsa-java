package Lecture_10;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
    public static void main(String[] args) {
        //Arraylist are dynamic arrays
        //issue with arrays is fixed size
        //This is growing array
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(25);
        arr.add(22);
        arr.add(7);
        arr.add(18);
        arr.add(10);

        int n = arr.size();
        System.out.println(n);
        System.out.print(arr.get(2)); //arr[2]
        arr.set(3, 50); //arr[3] = 50

        //line
        System.out.println();

        //Display - 3 ways
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }

        System.out.println();
        //Enhanced for loop se
        for (Integer elem : arr) {
            System.out.print(elem + " ");
        }

        System.out.println();
        //or
        System.out.print(arr);

        System.out.println();
        //another way to add
        arr.add(33); //add at end
        arr.add(1, 200);
        arr.remove(n - 1); //remove that element from particular index
        arr.removeLast(); // remove last element
//        Collections.reverse(arr); //reverse
        System.out.println(arr);
        //reverse
        int i = 0;
        int j = arr.size() - 1;
        while (i < j) {
            int temp = arr.get(i);
            arr.set(i, arr.get(j));
            arr.set(j, temp);
            i++;
            j--;
        }

        System.out.println(arr);
    }
}

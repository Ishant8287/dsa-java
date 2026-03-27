import java.util.Scanner;

//Search an Element in Sorted Array
public class SearchAnElementInASortedArray {
    static void main() {
        Scanner sc = new Scanner(System.in);

        //Enter size of any array
        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();

        //Enter element to search
        System.out.print("Enter element to search: ");
        int toSearch = sc.nextInt();

        //Enter array elements
        int[] arr = new int[size];
        System.out.print("Enter the elements of an array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int index = ElementInAnArray(arr, toSearch, 0, arr.length - 1);
        System.out.println("The index of an target is " + index);


    }

    static int ElementInAnArray(int[] arr, int target, int low, int high) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] < target) low = mid + 1;
            else if (arr[mid] > target) high = mid - 1;
            else return mid;
        }
        return -1;
    }
}

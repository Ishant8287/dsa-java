
public class CheckElementExistsOrNot {
    static void main() {
        int[] arr = {15, 3, 7, 12, 76, 9, 34, 5};
        int elem = 15;

        System.out.println(exists(arr, elem, 0));
    }

//    static boolean exists(int[] arr, int elem, int low, int high) {
//        Arrays.sort(arr);
//        boolean flag = false;
//        int mid = low + (high - low) / 2;
//        if (arr[mid] == elem) {
//            flag = true;
//        } else if (elem > arr[mid]) exists(arr, elem, mid + 1, high);
//        else {
//            exists(arr, elem, low, mid - 1);
//        }
//        if (flag == true) return true;
//        return false;
//    }

    static boolean exists(int[] arr, int elem, int start) {
        //My thinking
//        if (start < arr.length) {
//            if (arr[start] == elem) return true;
//            exists(arr, elem, start + 1);
//        }
//        return false;

        //Not my thinking
        if (start == arr.length) return false;
        if (arr[start] == elem) return true;
        return exists(arr, elem, start + 1);
    }
}

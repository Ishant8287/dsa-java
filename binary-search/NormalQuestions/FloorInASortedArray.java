package NormalQuestions;

public class FloorInASortedArray {
    static void main(String[] args) {
        int[] arr = {1, 2, 8, 10, 10, 12, 19};
        int target = 5;
        int low = 0;
        int idx = -1;
        int high = arr.length - 1;
        while(low<=high){
            int mid = (low+high)/2;
            if(target < arr[mid]){
                high = mid - 1;
            }
            else{
                idx = mid;
                low = mid + 1;
            }
        }
        System.out.println(arr[idx]);//2
    }
}

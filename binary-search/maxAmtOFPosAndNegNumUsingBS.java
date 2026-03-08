public class maxAmtOFPosAndNegNumUsingBS {
    static void main(String[] args) {
        int[] arr = {-2, -1, -1, 1, 2, 3};
        int TotalPos = arr.length;
        int TotalNeg = -1;
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] < 0) {
                TotalNeg = mid;
                low = mid + 1;
            }
            else if(arr[mid] > 0){
                TotalPos  = mid;
                high = mid - 1;
            }
        }
        System.out.println(TotalNeg+1);
        System.out.println(arr.length - TotalPos);
    }
}

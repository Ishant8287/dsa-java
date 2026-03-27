public class SearchInsertPosition {
    static void main() {
        int[] arr = {1, 3, 5, 6};
//        int target = 3; //1
//        int target = 7; //4
           int target = 2;

        int res = searchInsert(arr, target);
        System.out.println(res); //1

    }

    /*
    approach -> We will find the elem less than that like exactly less than that then we will return that elem index +1
     But if we find the elem then we will simply return the mid
     //We are not using  (low+high)/2; so we can avoid overflow
     //For this array mid = 1; -> now on 1 we have 3 which is our target so we will simple return 1

    */

    static int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int ans = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                ans = mid + 1; //1-> 2 -> 3
                low = mid + 1;
            }
            if (nums[mid] > target) {
                ans = mid + 1;
                high = mid - 1;
            }
        }
        return ans;

    }
}
//target = 7


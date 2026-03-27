package BinarySearchOnAnswer;
import java.util.Scanner;

public class BallInABag {
    static void main() {
        Scanner sc = new Scanner(System.in);
        //Enter Size of an array
        int size;
        System.out.print("Enter size of an array: ");
        size = sc.nextInt();

        //Enter max Operations
        int maxOperation;
        System.out.print("Enter max operation to be perform on an array: ");
        maxOperation = sc.nextInt();

        //Setting ans = -1 initially
        int ans = -1;

        int[] nums = new int[size];
        //Enter elem in an array
        System.out.print("Enter elem in an array: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        //Set low and high
        int low = 1; //There should minimum 1 ball in the bag
        int high = Max(nums); //Maximum balls in a bag

        //Applying BS on Answer
        while (low <= high) {
            int mid = low + (high - low) / 2;

            //Calculating operations on balls to put them in a bag
            long totalOperation = 0;
            for (int num : nums) {
                totalOperation += (num - 1) / mid;
            }

            if (totalOperation <= maxOperation) {
                ans = mid;
                high = mid - 1; // Left
            } else low = mid + 1; //Right
        }
        System.out.print("Minimum Limit of balls in a bag: " + ans);
    }

    static int Max(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}

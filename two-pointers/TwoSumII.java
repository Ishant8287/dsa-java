import java.util.ArrayList;
import java.util.List;

public class TwoSumII {
    static void main() {
        int nums[] = {2, 7, 11, 15};
        int target = 9;
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        int j = nums.length - 1;

        while (i < j) {
            if (nums[i] + nums[j] == target) {
                list.add(i + 1);
                list.add(j + 1);
                break;
            }
            if ((nums[i] + nums[j] > target)) {
                j--;
            }
            if (nums[i] + nums[j] < target) {
                i++;
            }
        }

        System.out.println(list);

    }
}

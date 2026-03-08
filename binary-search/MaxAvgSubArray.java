import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxAvgSubArray {
    static void main() {
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;

        List<Double> allAverages = new ArrayList<>();

        for (int j = 0; j < nums.length-k; j++) {
            double sum = 0;
            for (int i = j; i < j+k; i++) {
                sum += nums[i];
            }
            allAverages.add(sum / k);

        }

        double maxAvg = Collections.max(allAverages);
        System.out.println(maxAvg);
    }
}

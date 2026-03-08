public class ContainerWithMostWater {
    static void main() {
        int height[] = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int i = 0;
        int j = height.length - 1;
        int maxArea = 0;

        while (i < j) {
            int currentArea = (Math.min(height[i], height[j])) * (j - i);
            maxArea = Math.max(currentArea, maxArea);
            if (height[i] < height[j]) {
                i++;
            } else if (height[i] > height[j]) {
                j--;
            }
        }
        System.out.println(maxArea);
    }
}

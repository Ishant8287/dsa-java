public class SearchInASortedMatrix {
    static void main() {
        int[][] arr = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        int target = 16;
        int row = arr.length;
        int col = arr[0].length;
        int low = 0;
        int high = row * col - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int midRow = mid / col;
            int midCol = mid % col;
            if (arr[midRow][midCol] == target) {
                System.out.println(mid);
                break;
            } else if (target < arr[midRow][midCol]) high = mid - 1;
            else low = mid + 1;
        }
    }
}

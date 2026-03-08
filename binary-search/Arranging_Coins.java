public class Arranging_Coins {
    static void main() {
        int n = 10;
        int low = 0;
        int high = n;
        int ans = -1;
        while(low<=high){
            int mid = low + (high - low)/2;
            if( mid <= (2*n)/(mid+1)){
                ans = mid;
                low = mid + 1;
            }
            else high = mid - 1;
        }
        System.out.println(ans);
    }
}

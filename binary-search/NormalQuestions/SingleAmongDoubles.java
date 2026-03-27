public class SingleAmongDoubles {
    static void main() {
        int[] arr = {1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6};
        int result = SingleAmongDoubles(arr);
        System.out.println(result);
    }

   static int SingleAmongDoubles(int[] arr){
        int low = 0;
        int high = arr.length-1;
        if(arr.length == 1) return arr[0];
        if(arr[0]!=arr[1]) return arr[0];
        if(arr[high] != arr[high -1 ]) return arr[high];
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]!=arr[mid+1] && arr[mid]!=arr[mid-1]) return  arr[mid];
            if((mid%2 == 0) && (arr[mid] == arr[mid+1]) || (mid%2!=0 && (arr[mid] == arr[mid-1]))) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
   }

}

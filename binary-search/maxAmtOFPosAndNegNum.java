public class maxAmtOFPosAndNegNum {
    static void main(String[] args) {
        int[] arr = {-2, -1, -1, 1, 2, 3};
        int TotalPos = 0;
        int TotalNeg = 0;
        for (int elem : arr) {
            if (elem > 0) TotalPos++;
            else TotalNeg++;
        }
        System.out.println(Math.max(TotalPos, TotalNeg));
    }
}

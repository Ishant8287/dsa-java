package Level_2;

public class TowerOfHanoi {
    static int count = 0;

    static void main() {
        hanoi(20, 'A', 'B', 'C');
        System.out.println(count);
    }

    static void hanoi(int n, char source, char helper, char destination) {


        if (n == 0) return;

        //n-1 disks from source to helper via destination
        hanoi(n - 1, source, destination, helper);

        //Print-> largest from source to destination
//        System.out.println(source + "->" + destination);
        count++;

        //n-1 disk from helper to destination via source
        hanoi(n - 1, helper, source, destination);

    }


}

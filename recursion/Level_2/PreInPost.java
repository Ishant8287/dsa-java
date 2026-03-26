package Level_2;

public class PreInPost {
    static void main() {
        pip(3);
    }

    static void pip(int n) {
        if (n == 0) {
            return;
        }
        System.out.print("Pre" + n + " ");//pre
        pip(n - 1);
        System.out.print("In" + n + " "); //in
        pip(n - 1);
        System.out.print("Post" + n + " "); //post
    }
}

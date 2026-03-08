import java.util.Scanner;

public class StringBasics {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
//        String x = scanner.next();
        String y = scanner.nextLine();

//        System.out.println(x);
        System.out.print(y);

        System.out.println(y.charAt(6));
    }
}

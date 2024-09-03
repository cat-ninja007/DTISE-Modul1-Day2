import java.util.Scanner;

public class CheckEvenOdd {
    public void check() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        if (num % 2 == 0) {
//            System.out.println(num + " is even.");
            System.out.println(true);
        } else {

//            System.out.println(num + " is odd.");
            System.out.println(false);
        }
    }
}

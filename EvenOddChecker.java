
import java.util.Scanner;

public class EvenOddChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("ป้อนตัวเลข: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " เป็นเลขคู่");
        } else {
            System.out.println(number + " เป็นเลขคี่");
        }
    }
}

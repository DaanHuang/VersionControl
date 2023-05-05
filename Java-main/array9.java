import java.util.Scanner;
import java.security.SecureRandom;

public class array9 {
    public static void main(String[] args) {
        SecureRandom S = new SecureRandom();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value:");
        int a = input.nextInt();
        int b = input.nextInt();
        for (int x = 0; x < 20; x++) {
            int i = b + S.nextInt(a - b + 1);
            System.out.println(i);
        }

    }
}
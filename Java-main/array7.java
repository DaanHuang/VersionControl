import java.util.Scanner;

public class array7 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] arr2 = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, };
        int sum = 0;
        int s;
        int w;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter window value:");
        w = input.nextInt();

        System.out.println("Enter step value");
        s = input.nextInt();

        for (int x = 0; x < arr.length - w + 1; x += s) {
            for (int t = w; t > 0; t--) {
                sum = sum + arr[x + w - t];
            }
            arr2[x] = sum / w;
            System.out.print(arr2[x] + " ");
            sum = 0;
        }
    }
}

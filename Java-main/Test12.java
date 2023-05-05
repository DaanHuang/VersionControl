public class Test12 {
    public static void main(String[] args) {
        int blank = 4;
        int star = 0;
        for (int row = 0; row < 9;) {
            for (int col = 0; col < blank; col += 1) {
                System.out.print(" ");
            }
            col = 0;
            for (; col < blank; col += 1) {
                System.out.print("*");
            }
            System.out.print("\n");

            if (row < 4) {
                blank -= 1;
                star += 2;
            } else {
                blank += 1;
                star -= 2;
            }
            row += 1;
        }
    }
}
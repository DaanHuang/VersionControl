public class Test14 {
    public static void main(String[] args) {
        String s = "1";
        for (int i = 5; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(s);
            s += (7 - i);
        }
    }
}
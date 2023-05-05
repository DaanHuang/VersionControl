public class Test15 {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            for (int k = 0; k < 6; k++) {
                if (i < 5-k)
                    System.out.printf("*");
                else
                    System.out.printf("%d", -(4-k-i) );
            }
            System.out.println("");
        }
    }
}
public class array5 {
    public static void main(String[] args) {
        int[][] data2 = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };

        System.out.println(data2.length);
        System.out.println(data2[1].length);
        for (int j = 0; j < 2; j++) {
            for (int i = 0; i < 4; i++) {
                System.out.print(data2[j][i]);
            }
            System.out.println("");
        }
    }
}

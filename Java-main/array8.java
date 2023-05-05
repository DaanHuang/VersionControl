public class array8 {
    public static void main(String[] args) {
        int[] iArr = { 7, 5, 4, 9, 8, 1, 2 };
        int a;
        for (int y = 0; y < iArr.length; y++) {
            for (int x = 0; x < iArr.length - 1; x++) {
                if (iArr[x] > iArr[x + 1]) {
                    a = iArr[x + 1];
                    iArr[x + 1] = iArr[x];
                    iArr[x] = a;
                }
            }
        }
        for (int z = 0; z < iArr.length; z++) {
            System.out.println(iArr[z]);
        }
    }
}

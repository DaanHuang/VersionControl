public class array2 {
    public static void main(String[] args) {
        int[] iArr = { 7, 5, 4, 9, 8, 1, 2 };
        int a, b, c, d;
        int e = 0;
        for (int y = 0; y < iArr.length; y++) {
            for (int x = 0; x < iArr.length - 1; x++)
                if (iArr[x] > iArr[x + 1]) {
                    a = iArr[x + 1];
                    iArr[x + 1] = iArr[x];
                    iArr[x] = a;
                }
        }
        for (int j = 0; j < iArr.length; j++) {
            e = e + iArr[j];
        }
        b = iArr[0];
        c = iArr[6];
        d = iArr[3];
        e = e / iArr.length;
        System.out.println("min=" + b);
        System.out.println("max=" + c);
        System.out.println("mid=" + d);
        System.out.println("average=" + e);
    }
}
public class array6 {
    public static void main(String[] args) {
        int x = 10;
        int y = x;
        y = 20;
        System.out.println(x);
        System.out.println(y);

        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int[] arr2 = arr;
        arr2[0] = 10;
        System.out.println(arr[0]);
        System.out.println(arr2[0]);

        int total = 0;
        for (String str : args) {
            total += Integer.parseInt(str);
            System.out.println("args[]" + str);
        }
        System.out.println("total " + total);
    }
}

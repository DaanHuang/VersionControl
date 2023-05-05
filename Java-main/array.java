public class array {
    public static void main(String[] args) {
        int[] arr = { 7, 5, 4, 8, 1, 2 };// 將陣列倒述//
        int j = 0;
        for (int min = 0, max = arr.length - 1; min < max; min++, max--) {
            j = arr[min];
            arr[min] = arr[max];
            arr[max] = j;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
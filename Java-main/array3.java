public class array3 {
    public static void main(String[] args) {
        int[] iArr = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
        int target = 2;
        int targetIndex = 0;
        int search_count = 0;

        for (int i = 0; i < iArr.length; i++) {
            if (iArr[i] == target) {
                targetIndex = i;
            }
            search_count++;
        }

        System.out.println("the position is " + targetIndex);
        System.out.println("search count is " + search_count);
    }

}

public class array4 {
    public static void main(String[] args) {
        int[] iArr = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
        int target = 2;
        int targetIndex = 0;
        int searchCount = 0;
        int mid = (0 + iArr.length) >>> 1;

        for (int i = 0; i < 3; i++) {
            searchCount++;
            if (iArr[mid] == target) {
                targetIndex = mid;
                break;
            } else if (iArr[mid] > target) {
                mid = (mid + iArr.length) >>> 1;
            } else {
                mid = (0 + mid) >>> 1;
            }
        }
        System.out.println("the position is " + targetIndex);
        System.out.println("searchCount is " + searchCount);
    }
}

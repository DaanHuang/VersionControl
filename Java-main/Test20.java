public class Test20 {
    public static void main(String[] args) {
        int[] iArr = {7, 3, 4, 9, 6};
        int a = 0;
        for(int y=0; y<iArr.length-1; y++) {
            for(int x=0; x<iArr.length-1-y; x++)
            if(iArr[x] > iArr[x+1]){
                a = iArr[x+1];
                iArr[x+1]=iArr[x];
                iArr[x]=a;
            }
        }

        for(int x=0; x<iArr.length; x++){
            System.out.println(">>" + iArr[x]);
        }
    }
    public static void add(int x){
        System.out.println("===>" + x);
    }
}
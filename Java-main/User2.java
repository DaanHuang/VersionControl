public class User2{
    public static void main(String[] args) {
        int [] iArr= {7, 3, 4, 9, 6};
        int a;
        for(int x=0; x<iArr.length; x++) {
            if(iArr[x] < iArr[x+1]) {
                a = iArr[x];
				iArr[x] = iArr[x+1];
				iArr[x+1] = a;
            }
        }


        for(int x=0; x<iArr.length; x++){
            System.out.println(">>" + iArr[x]);
        }
    }

    
    
}
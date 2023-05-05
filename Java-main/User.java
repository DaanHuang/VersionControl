public class User{
    public static void main(String[] args) {
        // Car myCar = new Car();
        Car[] myCar = new Car[1000000];  //[]: 代表陣列

        for (int x=0; x<1000000; x++){
            myCar[x] = new Car();        // new 實體化、創造:myCar 變成了"物件"
            myCar[x] = wheel1 = x;
            myCar[x] = wheel2 = x+1;
            myCar[x] = wheel3 = x+2;
            myCar[x] = wheel4 = x+3;
            int z = myCar[x].lanuch(7);
            System.out.println(z);
        }
    }
}
public class Teat16{
    public static void main(String[] args) {
        int a;
        int k = 7;

        System.out.printf("%d%n", k);

        Test17 t17 = new Test17();
        a = t17.sub(k, 4);
        System.out.printf("%d%n", a);
    }
}
class Test17 {
    public int add(int x, int y) {
        int t = x + y;
        return t;
    }
}
public class array11 {
    public static void main(String[] args) {
        Human tom;
        tom = new Human("man", 180, 70);
        tom.printHight2();
        tom.printwight2();
    }
}

class Human {
    String sex;
    int height;
    int weight;

    public Human(String sex, int height, int weight) {
        this.sex = sex;
        this.height = height;
        this.weight = weight;
    }

    public void printHight2() {
        System.out.println(height);
    }

    public void printwight2() {
        System.out.println(weight);
    }
}

import javax.lang.model.util.ElementScanner6;

public class Test18 {
    public static void main(String[] args) {
        for(int i = -4; i <= 4; i++) {
            for(int k = -5; k <= 5; k++){
                if(Math.abs(k)+Math.abs(i)>4)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println("");
           
       }
        
    }
}
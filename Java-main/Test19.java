import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class Test19 {
    public static void main(String[] args) {
        int x ;
        int t ;
        Scanner input = new Scanner(System.in);
		System.out.println("Enter your KM:");
        x = input.nextInt();
        if(x>7){
            t = (x-7)*5+85;
            System.out.print(t);
        }
        else
            System.out.print("85");
        
            
    }
    
}
import java.util.Scanner;
public class Test8 {
	public static void main(String[] args) {
		int a = 0;
		String space = "";
		
		while (a < 5) {
			a = a + 1;
			space = space + "*";
			System.out.println(space);
		}
		a = 4;
		StringBuffer space2 = new StringBuffer(space); 
		int c = 0;
		
		while (c < a) {
			space2.delete(space2.length()-1, space2.length()); 
			c = c + 1;
			System.out.println(space2);
		}
	}
}
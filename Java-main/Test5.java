import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		int grade = 0;
		String space = "";
		
		while (grade < 10) {
			System.out.printf("%d%n",grade);
			grade = grade + 1;
			space = space + " ";
			System.out.printf(space);
		}
	}
}
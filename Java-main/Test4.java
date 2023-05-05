public class Test4 {
	public static void main(String[] args) {
		int grade;
		
		System.out.println("Enter first integer:");
		grade = input.nextInt();
		
	if (grade <=100 & grade >=0)
		switch (grade / 10*10) {

		case 90:
		case 100:
			System.out.println("A");	
			break;
		
		case 80: 
			System.out.println("B");	
			break;
		
		case 70: 
			System.out.println("C");	
			break;
		
		case 60: 
			System.out.println("D");	
			break;
		
		default : 
			System.out.println("E");	
			break;
		}
	else {
		System.out.println("not in value");}
	}
}
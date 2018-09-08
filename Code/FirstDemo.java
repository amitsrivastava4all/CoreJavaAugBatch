
import java.util.Scanner;
public class FirstDemo {
	//int y;
	public static void main(String[] args) {
		//int a = 10;
		//a = 200;
		Scanner scanner = new Scanner(System.in); 
		
		System.out.println("Enter the First Number");
		
		int firstNumber = scanner.nextInt();
		System.out.println("Enter the Second Number");
		int secondNumber = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter the NAme");
		String name = scanner.nextLine();
		System.out.println("NAme is "+name);
		//int firstNumber = System.in.read();
		//System.out.println("First Number is "+firstNumber);
		
		
		int result = firstNumber + secondNumber;
		System.out.println("Sum is "+result);
		scanner.close();
		scanner = new Scanner(System.in);
		System.out.println("Enter the Age");
		int age  = scanner.nextInt();
		scanner.close();
		

	}

}

import java.util.Scanner;

public class SecondDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Range");
		int range = new Scanner(System.in).nextInt();
		for(int i = 1; i<=range; i++) {
			for(int  j = 1; j<=i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}

import testing.Account;

class SavingAccount extends Account{
	void limit() {
		
		System.out.println("SA LImit of 25 K");
	}
	void noOfTransaction() {
		System.out.println("3 Trans in a Day");
	}
	void roi() {
		System.out.println("Rec Roi");
	}
}
class CurrentAccount extends Account{
	void noLimit() {
		System.out.println("N Trans "+balance);
	}
	void roi() {
		System.out.println("Pay Roi");
	}
}
public class ISADemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingAccount sa = new SavingAccount();
		sa.bankName = "HDFC";
		//sa.balance = 1000;
		
	}

}

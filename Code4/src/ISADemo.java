import testing.Account;

class SavingAccount extends Account{
	void limit() {
		
		System.out.println("SA LImit of 25 K");
	}
	void noOfTransaction() {
		System.out.println("3 Trans in a Day");
	}
	@Override
	public void roi() {
		System.out.println("Rec Roi");
	}
}
class CurrentAccount extends Account{
	void noLimit() {
		System.out.println("N Trans "+balance);
	}
	@Override
	public void roi() {
		System.out.println("Pay Roi");
	}
}
class AccountCaller{
//	void call(int x) {
//		
//	}
	void call(Account account) {
		account.deposit();
		account.withDraw();
		account.services();
		account.roi();
		if(account instanceof SavingAccount) {
			SavingAccount sa = (SavingAccount) account; // Downcasting
			sa.noOfTransaction();
			sa.limit();
		}
		else
		if(account instanceof CurrentAccount) {
			CurrentAccount ca = (CurrentAccount) account; // Downcasting
			ca.noLimit();
		}
		System.out.println("********************************");
	}
}
public class ISADemo {

	public static void main(String[] args) {
		AccountCaller ac = new AccountCaller();
		ac.call(new SavingAccount());  // Upcasting
		ac.call(new CurrentAccount());
		
		
		//SavingAccount sa = new SavingAccount();
		//sa.bankName = "HDFC";
		//sa.balance = 1000;
//		Account sa = new SavingAccount();  // Upcasting
//		sa.deposit();
//		sa.services();
//		sa.withDraw();
//		sa.limit();
//		sa.roi();
//		sa.noOfTransaction();
//		
//		System.out.println("****************************************");
//		sa = new CurrentAccount();
//		//CurrentAccount ca = new CurrentAccount();
//		sa.deposit();
//		sa.withDraw();
//		sa.services();
//		sa.noLimit();
//		sa.roi();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

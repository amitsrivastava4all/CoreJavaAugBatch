package testing;

public class Account{
	protected int id;
	protected String name;
	protected double balance;
	public String bankName;
	public void roi() {
		System.out.println("Account ROI....");
	}
	public void deposit() {
		System.out.println("Account Deposit...");
	}
	public void withDraw() {
		System.out.println("Account WithDraw");
	}
	public void services() {
		System.out.println("Account Services");
	}
}

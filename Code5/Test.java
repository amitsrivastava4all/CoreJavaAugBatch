class M1
{
	void show() {
		System.out.println("Show....");
	}
}
class M2 extends M1{
	void show(int x) {
		System.out.println("Show x ");
	}
	@Override
	void show() {
		System.out.println("Overriding.....");
	}
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new M2().show(88);
	}

}

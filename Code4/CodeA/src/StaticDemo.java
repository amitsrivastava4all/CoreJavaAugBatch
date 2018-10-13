import static java.lang.System.out;
class B {
	B(){
		out.println(" i am Parent...");
	}
}
interface MathOpr{
//final class MathOpr{
//	private MathOpr() {
//		
//	}
	static void add() {
		out.println("add Call");
	}
	static void sub() {
		out.println("add Call");
	}
	
}
class A extends B{
	final int m;
	//static final int m;
	int y;  // Instance Var
	static int z; // Class Var
	static {
		//y = 888;
		final int m=999;  // local
		z = 1000;  //class
		System.out.println("I am Static Block");
	}
	A(){
		int tt= 999;
		m=100; // instance
		y++;
		z++;
		System.out.println("I am Cons Y is "+y+ " Z is "+z+" m is "+m);
	}
	
}
public class StaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MathOpr m = new MathOpr();
		//m.add();
		//System s = new System();
		MathOpr.add();
		A obj = new A();
		A obj2 = new A();
		A obj3 = new A();

	}

}

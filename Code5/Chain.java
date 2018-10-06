abstract class H1
{
	int a;
	H1(){
		a = 100;
		System.out.println("H1 Cons call");
	}
	H1(int a){
		this.a = a;
		System.out.println("H1 Param Cons");
	}
}
class H2 extends H1{
	int b;
	//static final int c ;
	final int c;
	H2(){
		int rr;
		//super(1000);
		//super();
		c = 999;
		this.b = super.a + 100;
		System.out.println("H2 Cons Call B is "+b);
	}
}
public class Chain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		H2 obj = new H2();
		
	}

}

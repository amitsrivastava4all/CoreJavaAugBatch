interface W{
	void show();
}
@FunctionalInterface
interface Calc {//extends W{
	public int compute(int x, int y);
}
class Adder implements  Calc{

	@Override
	public int compute(int x, int y) {
		// TODO Auto-generated method stub
		return x+ y;
	}
	
}
class Subtract implements  Calc{

	@Override
	public int compute(int x, int y) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
public class CalcDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(10>2) {
		Calc c = (a,b)->a+b;
		int sum = c.compute(10,20);
		System.out.println(sum);
		Calc d = (a,b)->{
			System.out.println("A is "+a+ " and b is "+b);
			return a + b;
		};
		sum = d.compute(20, 30);
		System.out.println("Now Sum is "+sum);
		/*Calc calc = new Calc() {

			@Override
			public int compute(int x, int y) {
				// TODO Auto-generated method stub
				return x * y;
			}
			
		};
		Calc calc2 = new Calc() {

			@Override
			public int compute(int x, int y) {
				// TODO Auto-generated method stub
				return x * y;
			}
			
		};*/
		}
		

	}

}

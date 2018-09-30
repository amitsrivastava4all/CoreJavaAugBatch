class Overloading{
	void show(byte x) {
		System.out.println("byte");
	}
//	void show(long x) {
//		System.out.println("long");
//	}
//	void show(float x) {
//		System.out.println("float");
//	}
	void show(short x) {
		System.out.println("short");
	}
//	void show(int x) {
//		System.out.println("int");
//	}
//	void show(Integer x) {
//		System.out.println("Integer");
//	}
	void show(Long x) {
		System.out.println("Long");
	}
//	void show(int ...x) {
//		System.out.println("int var args");
//	}
	
	
}
public class TypePromotionDemo {

	public static void main(String[] args) {
		Overloading o =new Overloading();
		//o.show(1);  // Implicit
		o.show((byte)10);  // Explicit 
		// TODO Auto-generated method stub

	}

}

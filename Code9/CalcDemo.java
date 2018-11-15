import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

class AA{
	public String toString() {
		return "Hello A ";
	}
}

class Calc{
	static {
		System.out.println("Calc Class Load");
	}
	Calc(){
		System.out.println("Calc Cons Call");
	}
	public int add(int x, int y) {
		return x + y;
	}
	public int sub(int x, int y) {
		return x - y;
	}
	public int mul(int x, int y) {
		return x * y;
	}
	public int div(int x, int y) {
		return x / y;
	}
}
class ModernCalc{
	ModernCalc(){
		System.out.println("ModernCalc Cons Call");
	}
	static {
		System.out.println("Modern Cal Class Load...");
	}
	public int power(int x, int y) {
		return (int)Math.pow(x, y);
	}
}
public class CalcDemo {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		//Calc calc  = new Calc();
		// calc.add(10,20);
		Object obj = new AA();
		System.out.println(obj+ " "+obj.toString()+" "+obj.hashCode());
		Object w = "hello";
		w = 100;
		w=true;
		w = 100.20;
		System.out.println(w.toString());
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Class Name to Load");
		String className = scanner.next();
		Object object = Class.forName(className).newInstance();  // new Calc() or ModernCalc()
		System.out.println("Enter the Method to Call");
		String methodName = scanner.next();
		Method method = object.getClass().getDeclaredMethod(methodName, int.class,int.class);
		Object result= method.invoke(object, 100,200);
		System.out.println("Result "+result);

	}

}

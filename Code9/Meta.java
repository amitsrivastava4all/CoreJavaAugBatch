import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

class P {
	
}
class Q extends P
{
	int x, y;
	private int z;
	static int m;
	void show() {
		
	}
	void print() {
		
	}
}
public class Meta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class c = Q.class;
		int counter= 0;
		int scounter= 0;
		Class parent = c.getSuperclass().getSuperclass();
		System.out.println("Parent "+parent.getName());
		System.out.println("Var "+c.getDeclaredFields().length);
		for(Field f : c.getDeclaredFields()) {
			if(Modifier.isPrivate(f.getModifiers())) {
				counter++;
			}
			if(Modifier.isStatic(f.getModifiers())) {
				scounter++;
			}
		}
		System.out.println(counter+ " "+scounter);

	}

}

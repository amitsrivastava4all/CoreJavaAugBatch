
public class WrapperDemo {
	int adder(int ...numbers) {
		int sum = 0;
		for(int num : numbers) {
			sum+=num;
		}
		return sum;
	}
	public static void main(String ...args) {
		// TODO Auto-generated method stub
		WrapperDemo w = new WrapperDemo();
		System.out.println(w.adder());
		System.out.println(w.adder(10));
		System.out.println(w.adder(10,20));
		System.out.println(w.adder(10,20,30));
		System.out.println(w.adder(10,20,30,40,50));
		System.out.println(w.adder(10,20,30,40,50,60));
		System.out.println(w.adder(10,20,30,40,50,60,70));

		
		
		
		
		String name = "AmitAmitAmitAmitAmitAmitAmit";
		String name2 = "AmitAmitAmitAmitAmitAmitAmit";
		long startTime = System.currentTimeMillis();
		Runtime r = Runtime.getRuntime();
		System.out.println(r.totalMemory());
		System.out.println(r.freeMemory());
		System.out.println(r.totalMemory() - r.freeMemory());
		
		String name3="Amit";
		for(int i= 1;i<=100000; i++) {
			//name3=new String("Amit");
		name = "Amit";
		}
		long endTime = System.currentTimeMillis();
		System.out.println("*********************************");
		System.out.println(r.totalMemory());
		System.out.println(r.freeMemory());
		System.out.println(r.totalMemory() - r.freeMemory());
		
		System.out.println("Total Time "+(endTime-startTime));
		System.out.println(name ==name2);
		
		int ee = 100;
		Integer t1 = new Integer(ee);  // Boxing
		int hh  = t1.intValue(); // UnBoxing
		hh++; // Plus
		t1 = new Integer(hh); // Boxing
		
		// New Way
		Integer h1 = 100;
		h1++;
		
		Integer x = 130; // Literal  (Boxing)
		//int y = x.intValue(); // UnBoxing
		++x; // AutoBoxing
		Integer y = 130;
		System.out.println(x==y);
		Integer z = new Integer(100); // Object Creation
		System.out.println(x==z);
		
		
	}

}


public class Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		long startTime = System.currentTimeMillis();
		for(int i = 1; i<=100000;i++){
			System.out.println("I is "+i);
			Thread.sleep(1000);
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Total Time "+(endTime-startTime));

	}

}

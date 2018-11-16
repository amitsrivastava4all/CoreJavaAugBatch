class Logic{
	static int counter;
	static void printing() {
		for(int i = 1; i<=5; i++,counter++) {
			System.out.println("Counter is "+counter+" I is "+i+" "+Thread.currentThread().getName());
		}
	}
}
class PrintingJob implements Runnable { //extends Thread {  // implements Runnable {
	int counter;
	Logic logic =new Logic();
	@Override
	public  void run() {
		System.out.println("Inside Run "+Thread.currentThread().getName()+" "+Thread.currentThread().isAlive());
		for(int i = 1; i<=5; i++,counter++) {
			System.out.println("Counter is "+counter+" I is "+i+" "+Thread.currentThread().getName());
			//try {
				//Thread.sleep(5000);
				Thread.yield();
			/*} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
		}
		/*synchronized(Logic.class) {
			Logic.printing();
		}*/
		/*synchronized (logic) {
			logic.printing();
		}*/
		//synchronized(this) {
//		for(int i = 1; i<=5; i++,counter++) {
//			System.out.println("Counter is "+counter+" I is "+i+" "+Thread.currentThread().getName());
//		}
		//}
		System.out.println("Loop Ends "+Thread.currentThread().getName());
	}
}

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*Runnable r = new Runnable() {
			public void run() {
				System.out.println("Logic");
			}
		};
		Thread worker = new Thread(r,"tom");
		worker.start();
		*/
//		new Thread(new Runnable() {
//			public void run() {
//				System.out.println("Logic");
//			}
//		},"tom").start();
		
		new Thread(()->System.out.println("Logic"),"tom").start();
//		
		String t = "Amit";
		//StringBuffer sb = new StringBuffer("amit");
		StringBuilder sb = new StringBuilder("amit");
		System.out.println(sb.capacity() + " "+sb.length());
		synchronized(sb) {
		sb.append("srivastava");
		}
		PrintingJob job = new PrintingJob();
		Thread worker1 = new Thread(job,"ram");
		Thread worker2 = new Thread(job,"shyam");
		Thread worker3 = new Thread(job,"mike");
		worker1.setPriority(Thread.MAX_PRIORITY);
		worker2.setPriority(Thread.MAX_PRIORITY);
		worker3.setPriority(Thread.NORM_PRIORITY);
		worker1.start();
		worker1.join();
		worker2.start();
		worker3.start();
		System.out.println("Main Start");
		for(int i = 1; i<=5; i++) {
			System.out.println("I is "+i+" "+Thread.currentThread());
		}

	}

}

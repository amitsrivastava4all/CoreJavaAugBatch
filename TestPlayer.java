class Maths{
	private Maths() {}
static void sin() {
	System.out.println("Sin");
}
}


public class TestPlayer {

	public static void main(String[] args) {
		//System s = new System();
		//s.out.println("Hello Java ");
		//Maths m = new Maths();
		//m.sin();
		
		//Maths.sin();
		//Player.print();
		//String w = new String
		// TODO Auto-generated method stub
		//Player mario = new Player(); 
		
		 Player mario = new Player(100,100,200,200,4,"Mario") ;
		
		 //mario.speed = -100;
		// mario.speed++;
		mario.print();
		mario.setSpeed(-10);
		System.out.println("Now New Speed is "+mario.getSpeed());
		//mario.Player();
		//mario.print();
		//System.out.println("Before Initalize Call....");
//		 mario.name= "Mario";
//		 mario.xAxis=-100;
//		 mario.yAxis=-300;
//		 mario.height = mario.width = -100;
//		 mario.speed = -5;
		//mario.initalizePlayer(100, 300, 100, 100, 5, "Mario");
		//mario.print();
		System.out.println("**********************************");
		
		/*Player contra = new Player();
		contra.initalizePlayer(200, 200, 200, 200, 5, "Contra");
		contra.print();*/
		//System.out.println("Name is "+Player.name);
//		System.out.println("Player ");
//		 mario.name= "Mario";
//		 mario.xAxis=100;
//		 mario.yAxis=300;
//		 mario.height = mario.width = 100;
//		 mario.speed = 5;
//		
//		System.out.println("X "+mario.xAxis);
//		System.out.println("Y "+mario.yAxis);
//		System.out.println("Width "+mario.width);
//		System.out.println("Height "+mario.height);
//		System.out.println("Speed "+mario.speed);
//		System.out.println("Name "+mario.name);
		
		
//		contra.name= "Contra";
//		contra.xAxis=200;
//		contra.yAxis=500;
//		contra.height = contra.width = 100;
//		contra.speed = 5;
//		
//		System.out.println("****************************************");
//		
//		System.out.println("X "+contra.xAxis);
//		System.out.println("Y "+contra.yAxis);
//		System.out.println("Width "+contra.width);
//		System.out.println("Height "+contra.height);
//		System.out.println("Speed "+contra.speed);
//		System.out.println("Name "+contra.name);
//		
//		
//		int x = 100;

	}

}

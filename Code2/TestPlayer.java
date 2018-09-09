
public class TestPlayer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player mario = new Player() ;
//		 mario.name= "Mario";
//		 mario.xAxis=-100;
//		 mario.yAxis=-300;
//		 mario.height = mario.width = -100;
//		 mario.speed = -5;
		mario.initalizePlayer(-100, -300, -100, -100, -5, "Mario");
		mario.print();
		System.out.println("**********************************");
		
		Player contra = new Player();
		contra.initalizePlayer(200, 200, 200, 200, 5, "Contra");
		contra.print();
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

interface IPlayer{
	void run(); // public abstract void attack()
	void attack();
	void fire();
	int MAX_POWER = 100; // public static final int MAX_POWER = 100
}
interface StarPlayer{
	void showHide();
}
interface HybridPlayer extends IPlayer, StarPlayer{
	
}
class GreenPlayer implements HybridPlayer{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fire() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showHide() {
		// TODO Auto-generated method stub
		
	}
	
}
abstract class CommonPlayer implements IPlayer{
	 public void run() {
		System.out.println("Run Call");
	}

//	@Override
//	public void attack() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void fire() {
//		// TODO Auto-generated method stub
//		
//	}
}
class BluePlayer implements IPlayer, StarPlayer{

	@Override
	public void showHide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fire() {
		// TODO Auto-generated method stub
		
	}
	
}
class RedPlayer extends  CommonPlayer{
	
}
class YellowPlayer extends CommonPlayer{
	public void fire() {
		System.out.println("Fire Speed 10");
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

// What to do
interface Silver{
	void food();	
}
interface Gold extends Silver{
	void discount();
}
interface Diamond extends Gold{
	void holiday();
}
// How to do
class Card implements Silver, Gold, Diamond{
	@Override
	public void holiday() {
		System.out.println("Free Holiday");
	}
	@Override
	public void discount() {
		System.out.println("Shopping 5% Discount");
	}
	@Override
	public void food() {
		System.out.println("one meal free.");
	}
}
//class Silver{
//	void food() {
//		System.out.println("one meal free.");
//	}	
//}
//class Gold{
//	void discount() {
//		System.out.println("Shopping 5% Discount");
//	}
//	void food() {
//		System.out.println("one meal free.");
//	}
//}

public class AbstractionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Silver silver = new Card();
		silver.food();
		
		Gold gold = new Card();
		gold.food();
		gold.discount();
		//gold.holiday();
		Diamond diamond = new Card();
		diamond.holiday();
		diamond.food();
		diamond.discount();
		//silver.discount();

	}

}

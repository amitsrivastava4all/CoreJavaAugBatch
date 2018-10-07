import java.util.ResourceBundle;

interface IProducer{
	public void callMe();
}
class FasterProducer implements IProducer{
	@Override
	public void callMe() {
		System.out.println("Faster Call Me Call");
	}
}
class Producer implements IProducer{
	@Override
	public void callMe() {
		System.out.println("Call Me Call");
	}
	public void dontCallMe(int x) {
		System.out.println("No Consumer can call me");
	}
}
class Factory{
	public IProducer getObject() {
		ResourceBundle rb = ResourceBundle.getBundle("config");
		String className = rb.getString("classname");
		try {
		return (IProducer)Class.forName(className).newInstance();
		}
		catch(Exception e) {
			System.out.println("Unable to Create Object of this class "+className);
			System.exit(0);
		}
		return null;
//		if(className.equals("Producer")) {
//			return new Producer();
//		}
//		else
//		if(className.equals("FasterProducer")) {	
//			return new FasterProducer();
//		}
//		return  null;
	
		//return new FasterProducer();
		//return new Producer();
	}
//	public IProducer getObject2() {
//		//return new FasterProducer();
//		return new FasterProducer();
//	}
}
class Consumer{
	void callProducer() {
		//IProducer p = new FasterProducer();
		Factory f = new Factory();
		IProducer p = f.getObject();
		p.callMe();
		
	}
	
}
class ConsumerC{
	void callProducer() {
		Factory f = new Factory();
		IProducer p = f.getObject();
		p.callMe();
		
	}
	
}
class ConsumerB{
	void callProducer() {
		Factory f = new Factory();
		IProducer p = f.getObject();
		p.callMe();
		
	}
	
}
public class LoosleyCoupledApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer c = new Consumer();
		c.callProducer();
		ConsumerB d = new ConsumerB();
		d.callProducer();
		ConsumerC e = new ConsumerC();
		e.callProducer();
	}

}

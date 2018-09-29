import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class TT{
	void show() throws IOException {
		FileInputStream fs = new FileInputStream("c:\\abcd\\xyz.txt");
		//int x = 100/0;
	}
}
class VV extends TT{
	@Override
	void show() throws FileNotFoundException {
		//super.show();
		FileInputStream fs = new FileInputStream("c:\\abcd\\xyz.txt");
		//fs.read();
		int y [] = new int[10];
		y[20] = 1000;
	}
}
public class OverrideDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VV obj = new VV();
		try {
			obj.show();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

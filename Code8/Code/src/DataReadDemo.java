import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataReadDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path = "/Users/amit/Documents/CoreJava330WEndAug"
				+ "/FileHandling/src/DataReadDemo.java";
		File file = new File(path);
		if(file.exists()) {
			FileInputStream fs = new FileInputStream(file);
			int singleByte = fs.read();
			while(singleByte!=-1) {
				System.out.print((char)singleByte);
				singleByte = fs.read();
			}
			fs.close();
			
			
		}
		else {
			System.out.println("File Not Exist");
		}
		

	}

}

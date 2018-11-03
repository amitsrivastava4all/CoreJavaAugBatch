import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileDemo {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		//path = "c:\\abcd\\xyz"
		String path = "/Users/amit/Documents/FileOutput/Sample.txt";
		//File file = new File(path);
		//boolean isCreated = file.createNewFile();
		//if(isCreated) {
		FileOutputStream fs = new FileOutputStream(path,true);
		//FileOutputStream fs = new FileOutputStream(file);
		System.out.println("Enter the Data to Write in a file.");
		String data = new Scanner(System.in).nextLine();
		byte bytes[] = data.getBytes();
		fs.write(bytes);
		fs.close();
		System.out.println("Data Store...");
		/*}
		else {
			System.out.println("Can't Write in a File");
		}*/

	}

}

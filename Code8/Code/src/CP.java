import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CP {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File sourceDir = new File("/Users/amit/Documents/songs");
		File targetPath = new File("/Users/amit/Documents/backupsongs");
		targetPath.mkdir();
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter the Source File Path");
//		String sourcePath = scanner.next();
//		System.out.println("Enter the Target File Path");
//		String tPath = scanner.next();
		if(sourceDir.exists()) {
			File files [] = sourceDir.listFiles();
			for(File file : files) {
				if(file.isFile()) {
					String fullPath = targetPath.getPath()+"/"+file.getName();
					System.out.println("Target Path "+fullPath+" Source Path "+file.getPath());
					FileOutputStream fo = new FileOutputStream(fullPath);
					BufferedOutputStream bo = new BufferedOutputStream(fo);
					FileInputStream fs = new FileInputStream(file.getPath());
					BufferedInputStream bs =  new BufferedInputStream(fs);
					int singleByte = bs.read();
					while(singleByte!=-1) {
						bo.write(singleByte);
						singleByte = bs.read();
					}	
					bo.close();
					bs.close();
					fo.close();
					fs.close();
					System.out.println("File Copied "+file.getPath());
				}
			}
		}
		/*File file = new File(sourcePath);
		long startTime = System.currentTimeMillis();
		if(file.exists()) {
			FileOutputStream fo = new FileOutputStream(tPath,true);
			BufferedOutputStream bo = new BufferedOutputStream(fo);
			FileInputStream fs = new FileInputStream(file);
			BufferedInputStream bs =  new BufferedInputStream(fs);
			int singleByte = bs.read();
			while(singleByte!=-1) {
				bo.write(singleByte);
				singleByte = bs.read();
			}
			long endTime = System.currentTimeMillis();
			System.out.println("Total Time Taken "+(endTime-startTime)+"ms");
			bo.close();
			bs.close();
			fo.close();
			fs.close();
			System.out.println("Copied....");
		}
		else {
			System.out.println("Can't Copy");
		}
*/
	}

}

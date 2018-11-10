import java.io.File;
import java.io.FilenameFilter;

class MyFilter implements FilenameFilter{
	String extName;
	MyFilter(String ext){
		this.extName = ext;
	}

	@Override
	public boolean accept(File dir, String fileName) {
		// TODO Auto-generated method stub
		return fileName.endsWith(this.extName);
	}
	
}
public class FilterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("/Users/amit/Documents/songs");
		//File files [] = file.listFiles(new MyFilter(".mp3"));
		File files [] = file.listFiles((dir,fileName)->fileName.endsWith(".mp3"));
		if(files!=null && files.length>0) {
			for(File f: files) {
				if(f.isDirectory()) {
				System.out.println("<DIR>"+f.getName());
				}
				else
					if(f.isFile()) {
						System.out.println("<FILE>"+f.getName());
					}
			}
		}
	}

}

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyClientDemo {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		final String SERVER_IP = "localhost";
		final int SERVERPORT =9001;
		Socket socket = new Socket(SERVER_IP, SERVERPORT);
		System.out.println("Client Start...");
		InputStream is = socket.getInputStream();
		DataInputStream ds = new DataInputStream(is);
		String mydata = ds.readUTF();
		System.out.println("Data Rec "+mydata);
		socket.close();

	}

}

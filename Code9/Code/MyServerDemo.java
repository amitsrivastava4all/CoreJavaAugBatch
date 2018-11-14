import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class MyServerDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		final int PORT = 9001;
		ServerSocket server = new ServerSocket(PORT);
		System.out.println("Server Start...");
		System.out.println("Waiting for Client");
		Socket socket = server.accept();
		System.out.println("Client Joins");
		System.out.println("Enter the Data to Send...");
		String data = new Scanner(System.in).nextLine();
		OutputStream os = socket.getOutputStream();
		DataOutputStream ds = new DataOutputStream(os);
		ds.writeUTF(data);
		System.out.println("Data Send It ");
		socket.close();
		

	}

}

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class InetAddressDemo {

	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub
		InetAddress i = InetAddress.getLocalHost();
		System.out.println(i.getHostName());
		System.out.println(i.getHostAddress());
		System.out.println(i);
		System.out.println("Enter the Host Name");
		String hostName = new Scanner(System.in).next();
		InetAddress address[] = InetAddress.getAllByName(hostName);
		for(InetAddress add: address) {
			System.out.println(add.getHostAddress());
		}
	}

}

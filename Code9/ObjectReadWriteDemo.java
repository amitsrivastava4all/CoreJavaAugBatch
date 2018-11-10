import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Address implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String city;
	String pincode;
	String country;
	Address(String city, String pincode, String country){
		this.city = city;
		this.pincode = pincode;
		this.country = country;
	}
	void print() {
		System.out.println("City "+city+" Pincode "+pincode+" Country "+country);
	}
}
class Employee implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int id ;
	Address address = new Address("Delhi","110007","India");
	String name;
	double salary;
	double bonus;
	String phone;
	transient String password;
	Employee(){
		System.out.println("Emp Default Cons call");
	}
	Employee(int id , String name, double salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.bonus = 1000;
		this.phone ="2222";
		password = "1234";
	}
	void print() {
		System.out.println("Id "+id+" Name "+name+" Salary "+salary+" Bonus "+bonus+" Phone "+phone+" Password "+password);
		address.print();
	}
}
class PartTimeEmployee extends Employee  { //implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int duration ;
	public PartTimeEmployee() {
		// TODO Auto-generated constructor stub
		super(1001,"Ram",9999);
		duration = 4;
	}
	@Override
	void print() {
		super.print();
		System.out.println("Duration "+duration);
	}
}
public class ObjectReadWriteDemo {
	static Object show() {
		return "Hello";
	}
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		//String w = (String)ObjectReadWriteDemo.show();
    	String path = "/Users/amit/Documents/FileOutput/emp.dat";
		FileOutputStream fs = new FileOutputStream(path);
		ObjectOutputStream os = new ObjectOutputStream(fs);
		PartTimeEmployee ram = new PartTimeEmployee();
		os.writeObject(ram); // Object to Binary (Serialization) --> binary write in a file
		os.close();
		fs.close();
		System.out.println("Data Store....");
		
		FileInputStream fi = new FileInputStream(path);
		ObjectInputStream oi = new ObjectInputStream(fi);
		PartTimeEmployee emp = (PartTimeEmployee)oi.readObject(); // Deserialization
		emp.print();
		oi.close();
		fi.close();
		//System.out.println(ram==emp);
	}

}

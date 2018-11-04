import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
	int id ;
	String name;
	double salary;
	Employee(int id , String name, double salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	void print() {
		System.out.println("Id "+id+" Name "+name+" Salary "+salary);
	}
}
public class ObjectReadWriteDemo {
	static Object show() {
		return "Hello";
	}
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		String w = (String)ObjectReadWriteDemo.show();
		String path = "/Users/amit/Documents/FileOutput/emp.dat";
		FileOutputStream fs = new FileOutputStream(path);
		ObjectOutputStream os = new ObjectOutputStream(fs);
		Employee ram = new Employee(1001, "Ram", 99999);
		os.writeObject(ram); // Object to Binary (Serialization) --> binary write in a file
		os.close();
		fs.close();
		System.out.println("Data Store....");
		FileInputStream fi = new FileInputStream(path);
		ObjectInputStream oi = new ObjectInputStream(fi);
		Employee emp = (Employee)oi.readObject(); // Deserialization
		emp.print();
		oi.close();
		fi.close();
		System.out.println(ram==emp);
	}

}

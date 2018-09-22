
public class TestEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = new String();
		String b = new String("Amit");
		String c = new String(new char[] {'A','M','I','T'});
		Emp ram =new Emp(1001,"Ram",9000);
		double oldSalary = ram.getSalary();
		double newSalary = oldSalary + (oldSalary * 0.20);
		ram.setSalary(newSalary );
		ram.print();
	
		
		//ram.salary = -9000;
		//System.out.println(ram.salary);

	}

}


public class Emp {
	private int id;
	private String name;
	private double salary;
	Emp(int id , double salary){
		this(salary);
		this.id = id;
	}
	Emp(int id, String name, double salary){
		this(id,salary);
		this.name = name;
	}
	Emp(double salary){
		if(salary>0) {
		this.salary = salary + 1000;
		}
	}
	public void setSalary(double salary) {
		if(salary>0) {
		this.salary = salary;
		}
	}
	public double getSalary() {
		return salary;
	}
	void print() {
		System.out.println("Salary is "+salary);
	}

}

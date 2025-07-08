package ClassesandObjects;

public class Employees {
	private String name;
	private float salary;
	
	public Employees(String name, float salary) {
		this.name = name;
		this.salary = salary;
		
	}
	
	public String getName() {
		return name;
	}
	public float getSalary() {
		return salary;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	public void displayDetails() {
		System.out.println("Employee: " + name);
		System.out.println("Salary: " + salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employees emp = new Employees("Naga", 50000.0f);
		emp.displayDetails();

	}

}

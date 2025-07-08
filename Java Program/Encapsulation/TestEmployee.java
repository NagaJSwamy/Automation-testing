package Encapsulation;


class Employee {
    private String empName;
    private double salary;

    public void setEmpName(String name) {
        this.empName = name;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary");
        }
    }

    public String getEmpName() {
        return empName;
    }

    public double getSalary() {
        return salary;
    }
}

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee();
        e.setEmpName("Anjali");
        e.setSalary(45000);
        System.out.println("Employee: " + e.getEmpName());
        System.out.println("Salary: ₹" + e.getSalary());

	}

}

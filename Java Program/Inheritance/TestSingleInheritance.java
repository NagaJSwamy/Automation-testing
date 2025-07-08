package Inheritance;

class Employee {
    double salary = 40000;

    void displaySalary() {
        System.out.println("Salary: ₹" + salary);
    }
}

class Programmer extends Employee {
    int bonus = 10000;

    void displayBonus() {
        System.out.println("Bonus: ₹" + bonus);
    }
}
public class TestSingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Programmer p = new Programmer();
        p.displaySalary();
        p.displayBonus();

	}

}

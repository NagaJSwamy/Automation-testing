package ClassesandObjects;
class Employee {
    String name;

    Employee(String name) {
        this.name = name;  // 'this' refers to current object
    }

    void show() {
        System.out.println("Employee Name: " + name);
    }
}
public class ThisKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee("Rahul");
        e.show();

	}

}

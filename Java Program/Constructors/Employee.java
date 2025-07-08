package Constructors;

public class Employee {
	int id;
    String name;

    // Parameterized constructor
    Employee(int i, String n) {
        id = i;
        name = n;
    }

    void show() {
        System.out.println(id + " " + name);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee(1, "Alice");
        Employee e2 = new Employee(2, "Bob");
        e1.show();
        e2.show();
		

	}

}

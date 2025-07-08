package Constructors;

public class Student {
	int id;
    String name;

    // Default constructor
    Student() {
        id = 101;
        name = "John";
    }

    void display() {
        System.out.println(id + " " + name);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
        s1.display();

	}

}

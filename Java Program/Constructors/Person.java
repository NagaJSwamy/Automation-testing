package Constructors;

public class Person {
	String name;
    int age;

    // Parameterized constructor
    Person(String n, int a) {
        name = n;
        age = a;
    }

    // Copy constructor
    Person(Person p) {
        name = p.name;
        age = p.age;
    }

    void display() {
        System.out.println(name + " " + age);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("David", 25);
        Person p2 = new Person(p1);  // Copy constructor
        p1.display();
        p2.display();

	}

}

package ClassesandObjects;
class Person {
    String name;
    int age;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
public class Details {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
        p.name = "Arun";
        p.age = 25;
        p.display();

	}

}

package Inheritance;

interface Sports {
    void play();
}

class Person {
    void speak() {
        System.out.println("Person is speaking.");
    }
}

class Student extends Person implements Sports {
    public void play() {
        System.out.println("Student is playing football.");
    }

    void study() {
        System.out.println("Student is studying.");
    }
}
public class TestHybridInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
        s.speak();
        s.study();
        s.play();

	}

}

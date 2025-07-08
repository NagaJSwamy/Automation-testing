package Abstraction;

abstract class Animal{
	abstract void sound();
	
	void eat() {
		System.out.println("This animal eats food.");
	}
}

class Dog extends Animal {
	void sound() {
		System.out.println("Dog barks");
	}
}
public class TestAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal myDog = new Dog();
		myDog.eat();
		myDog.sound();

	}

}

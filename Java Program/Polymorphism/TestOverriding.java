package Polymorphism;

class Animal {
    void sound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}
public class TestOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a1 = new Dog();  // upcasting
        Animal a2 = new Cat();

        a1.sound(); // Dog's version
        a2.sound(); // Cat's version

	}

}

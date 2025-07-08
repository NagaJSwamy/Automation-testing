package ClassesandObjects;
class Dog {
    String name;
    void bark() {
        System.out.println(name + " is barking.");
    }
}
public class MultipleObjectsfromSameClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d1 = new Dog();
        d1.name = "Tommy";

        Dog d2 = new Dog();
        d2.name = "Max";

        d1.bark();
        d2.bark();

	}

}

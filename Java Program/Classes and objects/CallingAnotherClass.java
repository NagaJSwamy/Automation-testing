package ClassesandObjects;
class Engine {
    void start() {
        System.out.println("Engine started.");
    }
}

class Car {
    Engine e = new Engine(); // has-a relationship

    void drive() {
        e.start();
        System.out.println("Car is running.");
    }
}
public class CallingAnotherClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();
        c.drive();

	}

}

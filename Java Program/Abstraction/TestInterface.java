package Abstraction;

interface Vehicle{
	void start();
	void stop();
}

class Car implements Vehicle {
	public void start() {
		System.out.println("Car get Started");
	}
	public void stop() {
		System.out.println("Car get Stopped");
	}
	
}
public class TestInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle myCar = new Car();
		myCar.start();
		myCar.stop();

	}

}

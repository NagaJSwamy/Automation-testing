package Interface;


interface Vehicle {
    void start();
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car starts with key.");
    }
}

class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike starts with kick.");
    }
}
public class TestVehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v1 = new Car();
        Vehicle v2 = new Bike();
        v1.start();
        v2.start();

	}

}

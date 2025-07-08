package Constructors;

public class Car {
	String model;

    // No-arg constructor
    Car() {
        model = "Maruti";
    }

    void show() {
        System.out.println("Car model: " + model);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();
        c.show();

	}

}

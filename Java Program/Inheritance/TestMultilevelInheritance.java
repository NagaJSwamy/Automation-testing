package Inheritance;

class Vehicle {
    void start() {
        System.out.println("Vehicle started.");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving.");
    }
}

class ElectricCar extends Car {
    void charge() {
        System.out.println("Electric car is charging.");
    }
}
public class TestMultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ElectricCar ec = new ElectricCar();
        ec.start();
        ec.drive();
        ec.charge();

	}

}

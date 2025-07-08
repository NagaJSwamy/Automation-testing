package Abstraction;

abstract class Shape{
	String color;
	Shape(String color) {
		this.color = color;
	}
	
	abstract double area();
	void displayColor() {
		System.out.println("Color: " + color);
	}
}

class Circle extends Shape {
	double radius;
	
	Circle(String color, double radius) {
		super(color);
		this.radius = radius;
	}
	
	double area() {
		return Math.PI * radius * radius;
	}
}
public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape c = new Circle("Red", 5);
        c.displayColor();
        System.out.println("Area: " + c.area());

	}

}

package Polymorphism;

class Calculator {
    void add(int a, int b) {
        System.out.println("Sum (int): " + (a + b));
    }

    void add(double a, double b) {
        System.out.println("Sum (double): " + (a + b));
    }

    void add(String a, String b) {
        System.out.println("Concatenated String: " + a + b);
    }
}
public class TestOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c = new Calculator();
        c.add(5, 10);
        c.add(3.5, 2.5);
        c.add("Hello, ", "World!");

	}

}

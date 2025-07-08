package ClassesandObjects;
class MathOperations {
    int square(int x) {
        return x * x;
    }

    int cube(int x) {
        return x * x * x;
    }
}
public class MultipleMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathOperations m = new MathOperations();
        System.out.println("Square: " + m.square(4));
        System.out.println("Cube: " + m.cube(3));

	}

}

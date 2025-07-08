package ClassesandObjects;
class Calculator {
    int add(int a, int b) {
        return a + b;
    }
}
public class MethodReturningValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c = new Calculator();
        int result = c.add(10, 20);
        System.out.println("Sum: " + result);

	}

}

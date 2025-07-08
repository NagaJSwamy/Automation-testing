package Method;

public class MethodCalling {
	int s = 1;
	
	//Method
	public int addTwoInt(int a, int b) {
		s = a+b; // Perfrom sum of two numbers given as argument
		return s; // Return the sum of two numbers
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodCalling a = new MethodCalling(); // Creating an object of Add class
		// Calling method using object and storing the return 
        // Value in n variable of int type
		int n = a.addTwoInt(1, 3);
		System.out.println("Sum: " + n);

	}

}

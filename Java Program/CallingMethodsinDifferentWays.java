package Method;

public class CallingMethodsinDifferentWays {
	public static int i = 0;
	
	CallingMethodsinDifferentWays(){ // Constructor to count objects
		i++;
	}
	public static int get() { // Static method to get the 
	    // number of objects created
		return i;
	}
	// Instance method m1 calling 
    // another method m2
	public int m1() {
		
		System.out.println("Inside the method m1");
		this.m2();
		return 2;
	}
	public void m2() {
		System.out.println("In method m2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallingMethodsinDifferentWays obj = new CallingMethodsinDifferentWays();
		// Calling m1 method using the class object
		int i = obj.m1();
		System.out.println("Control returned after m1: " + i);
		// Calling the get method directly using the class name
		int o = CallingMethodsinDifferentWays.get();
		System.out.println("No of instances created: " + o);

	}

}

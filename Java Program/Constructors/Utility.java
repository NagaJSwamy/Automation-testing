package Constructors;

public class Utility {
	private Utility() {
        System.out.println("Private Constructor called");
    }

    static void showMessage() {
        System.out.println("Utility method");
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Utility u = new Utility(); //Error: private constructor
        Utility.showMessage();       //Only static methods allowed

	}

}

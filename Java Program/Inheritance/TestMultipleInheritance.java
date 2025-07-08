package Inheritance;

interface Printer {
    void print();
}

interface Scanner {
    void scan();
}

class AllInOneMachine implements Printer, Scanner {
    public void print() {
        System.out.println("Printing document...");
    }

    public void scan() {
        System.out.println("Scanning document...");
    }
}
public class TestMultipleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AllInOneMachine machine = new AllInOneMachine();
        machine.print();
        machine.scan();

	}

}

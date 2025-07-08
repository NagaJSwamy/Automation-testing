package Method;

public class AccessorandMutatorMethods {
	private int num;
	private String n;
	
	public int getNumber() {
		return num;
	}
	
	public String getName() {
		return n;
	}
	
	public void setNumber(int num) {
		this.num = num;
	}
	
	public void setName(String n) {
		this.n = n;
	}
	
	public void printDetails() {
        System.out.println("Number: " + num);
        System.out.println("Name: " + n);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessorandMutatorMethods g = new AccessorandMutatorMethods();
        g.setNumber(123);  
        g.setName("Great volwer");   
        g.printDetails();

	}

}

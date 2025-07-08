package ClassesandObjects;

public class Numbers {
	private int a;
	private int b;
	
	public void setA(int a) {
		this.a = a;
	}
	public void setB(int b) {
		this.b = b;
	}
	
	public void sum() {
		System.out.println(a + b); 
		}
    public void sub() {
    	System.out.println(a - b); 
    	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Numbers obj = new Numbers();
		
		obj.setA(1);
		obj.setB(2);
		
		obj.sum();
		obj.sub();
		

	}

}

package AccessModifierP1;

class Private {
	
	private void display() {
		System.out.println("Private Number");
	}
}
class PrivateNew{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Private obj = new Private();
		obj.display();

	}

}

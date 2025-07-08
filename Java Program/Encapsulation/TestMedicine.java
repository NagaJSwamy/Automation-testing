package Encapsulation;

class Medicine {
    private String chemical;  // hidden from user

    public void setChemical(String chemical) {
        this.chemical = chemical;
    }

    public String getChemical() {
        return chemical;
    }
}
public class TestMedicine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Medicine med = new Medicine();
        med.setChemical("Paracetamol");
        System.out.println("Medicine contains: " + med.getChemical());

	}

}

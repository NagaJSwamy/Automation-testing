package Interface;


interface Device {
    default void charge() {
        System.out.println("Device is charging via default port.");
    }
}

class Phone implements Device {
    public void charge() {
        System.out.println("Phone charging via USB-C.");
    }
}

class Tablet implements Device {
    // uses default charge()
}
public class TestCharge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Device d1 = new Phone();
        Device d2 = new Tablet();
        d1.charge();
        d2.charge();

	}

}

package Abstraction;

abstract class Mobile {
    abstract void unlock();
    abstract void openApp(String appName);
}

class AndroidPhone extends Mobile {
    void unlock() {
        System.out.println("Phone unlocked using fingerprint.");
    }

    void openApp(String appName) {
        System.out.println(appName + " app opened.");
    }
}
public class TestMoblie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile phone = new AndroidPhone();
        phone.unlock();
        phone.openApp("WhatsApp");

	}

}

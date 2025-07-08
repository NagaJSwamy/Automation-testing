package Abstraction;

abstract class ATM {
    abstract void withdraw(double amount);
    abstract void checkBalance();
}

class SBIATM extends ATM {
    double balance = 5000;

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Please collect cash: ₹" + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void checkBalance() {
        System.out.println("Available Balance: ₹" + balance);
    }
}
public class TestATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ATM atm = new SBIATM();
        atm.withdraw(1000);
        atm.checkBalance();

	}

}

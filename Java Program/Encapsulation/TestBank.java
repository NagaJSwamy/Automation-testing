package Encapsulation;


class BankAccount {
    private double balance = 0;

    public void deposit(double amount) {
        if (amount > 0)
            balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance)
            balance -= amount;
        else
            System.out.println("Insufficient funds");
    }

    public double getBalance() {
        return balance;
    }
}
public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount account = new BankAccount();
        account.deposit(1000);
        account.withdraw(300);
        System.out.println("Remaining Balance: ₹" + account.getBalance());

	}

}

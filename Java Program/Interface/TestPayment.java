package Interface;


interface Payment {
    void pay(double amount);
}

class CashPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " in cash.");
    }
}

class OnlinePayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " online.");
    }
}
public class TestPayment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payment p1 = new CashPayment();
        Payment p2 = new OnlinePayment();
        p1.pay(500);
        p2.pay(750);

	}

}

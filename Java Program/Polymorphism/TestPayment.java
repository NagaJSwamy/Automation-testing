package Polymorphism;


class Payment {
    void pay() {
        System.out.println("Paying in general way");
    }
}

class Cash extends Payment {
    void pay() {
        System.out.println("Paid using cash");
    }
}

class Card extends Payment {
    void pay() {
        System.out.println("Paid using credit/debit card");
    }
}

class UPI extends Payment {
    void pay() {
        System.out.println("Paid using UPI");
    }
}
public class TestPayment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payment p1 = new Cash();
        Payment p2 = new Card();
        Payment p3 = new UPI();

        p1.pay();
        p2.pay();
        p3.pay();

	}

}

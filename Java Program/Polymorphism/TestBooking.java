package Polymorphism;

class Booking {
    void book(String name) {
        System.out.println("Seat booked for: " + name);
    }

    void book(int id) {
        System.out.println("Seat booked with ID: " + id);
    }

    void book(String name, int id) {
        System.out.println("Seat booked for " + name + " with ID: " + id);
    }
}
public class TestBooking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Booking b = new Booking();
        b.book("Amit");
        b.book(102);
        b.book("Ravi", 203);

	}

}

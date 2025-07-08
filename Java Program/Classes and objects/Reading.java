package ClassesandObjects;
class Book {
    String title;

    // Constructor
    Book(String t) {
        title = t;
    }

    void show() {
        System.out.println("Book Title: " + title);
    }
}
public class Reading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book("Java Programming");
        b1.show();

	}

}

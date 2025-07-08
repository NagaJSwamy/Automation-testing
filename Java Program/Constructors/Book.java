package Constructors;

public class Book {
	String title;
    int pages;

    // Constructor 1
    Book() {
        title = "Unknown";
        pages = 0;
    }

    // Constructor 2
    Book(String t) {
        title = t;
        pages = 100;
    }

    // Constructor 3
    Book(String t, int p) {
        title = t;
        pages = p;
    }

    void display() {
        System.out.println(title + " - " + pages + " pages");
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book();
        Book b2 = new Book("Java");
        Book b3 = new Book("Python", 350);
        b1.display();
        b2.display();
        b3.display();

	}

}

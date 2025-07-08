package ClassesandObjects;
import java.util.Scanner;
class Student {
    String name;
    int roll;

    void readData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter roll number: ");
        roll = sc.nextInt();
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll);
    }
}
public class ScannerInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
        s.readData();
        s.display();

	}

}

package Encapsulation;

class Student {
    private int marks;

    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100)
            this.marks = marks;
        else
            System.out.println("Invalid marks");
    }

    public int getMarks() {
        return marks;
    }
}
public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
        s.setMarks(85);
        System.out.println("Student Marks: " + s.getMarks());

	}

}

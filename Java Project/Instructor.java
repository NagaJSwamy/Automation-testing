package JavaProjectEduSmartLms;

public class Instructor extends User {
    private String createdCourse1;
    private String createdCourse2;

    public Instructor(String name, String emailID, String userID) {
        super(name, emailID, userID);
    }

    public void createCourse(String courseName) {
        if (createdCourse1 == null) {
            this.createdCourse1 = courseName;
        } else if (createdCourse2 == null) {
            this.createdCourse2 = courseName;
        } else {
            System.out.println("Cannot create more than 2 courses.");
        }
    }

    public void viewProfile() {
        System.out.println("Instructor Profile:");
        System.out.println("Name: " + getName());
        System.out.println("Email: " + getEmail());
        System.out.println("UserID: " + getUserId());
        System.out.println("Created Course 1: " + createdCourse1);
        System.out.println("Created Course 2: " + createdCourse2);
    }

}
